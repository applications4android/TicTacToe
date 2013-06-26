package com.blogspot.applications4android.tictactoe.core;

/**
 * Enum representing the types of players (X and O)
 */
public enum Player {
    /** player X */
    PLAYER_X,
    /** player O */
    PLAYER_O;
 
    /**
     * Returns the next player who's supposed to play the move
     * @return next player
     */
    public Player nextPlayer() {
        if(this == PLAYER_X)   return PLAYER_O;
        return PLAYER_X;
    }
}
