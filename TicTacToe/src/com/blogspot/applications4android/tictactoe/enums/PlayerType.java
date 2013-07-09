package com.blogspot.applications4android.tictactoe.enums;


/** Enum representing the kind of player */
public enum PlayerType {
    /** human player */
    HUMAN,
    /** computer */
    COMPUTER;

    /**
     * Checks whether the current player is computer or not
     * @return true if yes, else false
     */
    public boolean isComputer() {
        return (this == COMPUTER);
    }
}
