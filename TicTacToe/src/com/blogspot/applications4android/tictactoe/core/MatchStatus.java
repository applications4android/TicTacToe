package com.blogspot.applications4android.tictactoe.core;


/** Enum representing the status of the current match */
public enum MatchStatus {
    /** current player has won the match */
    COMPLETED,
    /** game is still on! */
    IN_PROGRESS,
    /** match is drawn */
    DRAWN;

    /**
     * Checks whether the game is over or not
     * @return true if it is, else false
     */
    public boolean isCompleted() {
        return (this != IN_PROGRESS);
    }
}
