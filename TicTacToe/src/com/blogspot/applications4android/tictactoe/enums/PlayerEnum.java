package com.blogspot.applications4android.tictactoe.enums;


/** Enum representing the types of players (X and O) */
public enum PlayerEnum {
    /** X player */
    PLAYER_X,
    /** O player */
    PLAYER_O;

    /**
     * Returns the player who is going to play the next move
     * @return the next player
     */
    public PlayerEnum nextPlayer() {
        if(this == PLAYER_X) return PLAYER_O;
        return PLAYER_X;
    }

    /**
     * Returns the marking used by the current player
     * @return the marking
     */
    public Marking getMarking() {
        if(this == PLAYER_X) return Marking.MARK_X;
        return Marking.MARK_O;
    }
}
