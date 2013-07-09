package com.blogspot.applications4android.tictactoe.core;

import com.blogspot.applications4android.tictactoe.enums.PlayerEnum;
import com.blogspot.applications4android.tictactoe.enums.PlayerType;


/** Abstraction of a player in the game */
public class Player {
    /** which marking is this player playing for */
    private PlayerEnum m;
    /** name of the player */
    private String n;
    /** type of the player */
    private PlayerType t;

    /**
     * Constructor
     * @param _m player mark
     * @param _n player name
     * @param _t player type
     */
    public Player(PlayerEnum _m, String _n, PlayerType _t) {
        m = _m;
        n = _n;
        t = _t;
    }

    /**
     * returns the mark played by this player
     * @return the mark
     */
    public PlayerEnum mark() {
        return m;
    }

    /**
     * returns the name of this player
     * @return the name
     */
    public String name() {
        return n;
    }

    /**
     * returns the player type
     * @return the type
     */
    public PlayerType type() {
        return t;
    }
}
