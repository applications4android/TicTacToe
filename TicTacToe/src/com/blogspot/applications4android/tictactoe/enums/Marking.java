package com.blogspot.applications4android.tictactoe.enums;

/** Enum representing the types of markings (X, O and none) */
public enum Marking {
    /** X mark */
    MARK_X,
    /** O mark */
    MARK_O,
    /** no mark */
    MARK_NONE;

    /**
     * Checks whether the current is marked or not
     * @return true if it is, else false
     */
    public boolean isAlreadyMarked() {
        return (this != MARK_NONE);
    }
}
