package com.blogspot.applications4android.tictactoe.core;

import java.util.HashMap;

import com.blogspot.applications4android.tictactoe.enums.PlayerEnum;
import com.blogspot.applications4android.tictactoe.enums.PlayerType;
import com.blogspot.applications4android.tictactoe.exceptions.PlayerException;


/** List of players playing the current game */
public class Players extends HashMap<PlayerEnum,Player> {
    /** serial version id */
    private static final long serialVersionUID = 1136315364159780919L;

    /**
     * Add a player with his/her name to the list
     * @param pl player type
     * @param name player name
     * @param type player type
     * @throws PlayerException
     */
    public void addPlayer(PlayerEnum pl, String name, PlayerType type) throws PlayerException {
        if(containsKey(pl)) {
            throw new PlayerException("Player " + pl + " already exists!");
        }
        put(pl, new Player(pl, name, type));
    }

    /**
     * Get the player's name
     * @param pl player
     * @return the player
     * @throws PlayerException
     */
    public Player getPlayer(PlayerEnum pl) throws PlayerException {
        if(!containsKey(pl)) {
            throw new PlayerException("Player " + pl + " does not exist!");
        }
        return get(pl);
    }
}
