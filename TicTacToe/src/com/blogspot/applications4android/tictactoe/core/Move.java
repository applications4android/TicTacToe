package com.blogspot.applications4android.tictactoe.core;

import com.blogspot.applications4android.tictactoe.enums.PlayerEnum;
import com.blogspot.applications4android.tictactoe.exceptions.BadStringException;

/** Data structure representing a move made by a player in the game */
public class Move {
    /** player who has made this move */
    private PlayerEnum player;
    /** position chosen by the player */
    private Position pos;

    /**
     * Constructor
     * @param pl player
     * @param x_ x position
     * @param y_ y position
     * @param z_ z position
     */
    public Move(PlayerEnum pl, int x_, int y_, int z_) {
        player = pl;
        pos = new Position(x_, y_, z_);
    }

    /**
     * Constructor
     * @param pl player
     * @param x_ x position
     * @param y_ y position
     */
    public Move(PlayerEnum pl, int x_, int y_) {
        player = pl;
        pos = new Position(x_, y_);
    }

    /**
     * Constructor
     * @param pl player
     * @param p position
     */
    public Move(PlayerEnum pl, Position p) {
        player = pl;
        pos = p;
    }

    /**
     * Construct Move object from the string
     * @param str string
     * @throws BadStringException
     */
    public Move(String str) throws BadStringException {
        String[] tokens = str.split(":");
        if(tokens.length != 4) {
            throw new BadStringException("Bad 'Move' string passed: " + str);
        }
        if("PLAYER_O".equals(tokens[0])) {
            player = PlayerEnum.PLAYER_O;
        }
        else if("PLAYER_X".equals(tokens[0])) {
            player = PlayerEnum.PLAYER_X;
        }
        else {
            throw new BadStringException("Bad player type passed '" + tokens[0] + "'");
        }
        int x = str2int(tokens[1]);
        int y = str2int(tokens[2]);
        int z = str2int(tokens[3]);
        pos = new Position(x, y, z);
    }

    /**
     * Convert string to int
     * @param str string
     * @return desired int
     * @throw BadStringException
     */
    private int str2int(String str) throws BadStringException {
        try {
            return Integer.parseInt(str);
        }
        catch(NumberFormatException ne) {
            throw new BadStringException("Bad integer passed '" + str + "'");
        }
    }

    /**
     * Returns the player who made this move
     * @return the player
     */
    public PlayerEnum getPlayer() {
        return player;
    }

    /**
     * Returns the x position
     * @return x position
     */
    public int getX() {
        return pos.x;
    }

    /**
     * Returns the y position
     * @return y position
     */
    public int getY() {
        return pos.y;
    }

    /**
     * Returns the z position
     * @return z position
     */
    public int getZ() {
        return pos.z;
    }

    @Override
    public boolean equals(Object m) {
        Move mo = (Move) m;
        if(mo.player != player) return false;
        if(!pos.equals(mo.pos)) return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(player.toString());
        sb.append(":");
        sb.append(pos.x);
        sb.append(":");
        sb.append(pos.y);
        sb.append(":");
        sb.append(pos.z);
        return sb.toString();
    }
}
