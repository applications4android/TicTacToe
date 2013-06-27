package com.blogspot.applications4android.tictactoe.core;

import java.util.HashMap;

import com.blogspot.applications4android.tictactoe.exceptions.PlayerException;


/** List of players playing the current game with their names */
public class PlayerNames extends HashMap<PlayerEnum,String> {
    /** serial version id */
    private static final long serialVersionUID = 1136315364159780919L;

    /**
     * Add a player with his/her name to the list
     * @param pl player type
     * @param name player name
     * @throws PlayerException
     */
    public void addPlayer(PlayerEnum pl, String name) throws PlayerException {
        if(containsKey(pl)) {
            throw new PlayerException("Player " + pl + " already exists!");
        }
        put(pl, name);
    }

    /**
     * Get the player's name
     * @param pl player
     * @return name
     * @throws PlayerException
     */
    public String getPlayerName(PlayerEnum pl) throws PlayerException {
        if(!containsKey(pl)) {
            throw new PlayerException("Player " + pl + " does not exist!");
        }
        return get(pl);
    }
}
