package com.blogspot.applications4android.ttt.core;

/**
 * Enum representing the types of players (X and O)
 */
public enum Player {
    /** player X */
    PLAYER_X {
        @Override
        public String toString() {
            return "X";
        }
    },

    /** player O */
    PLAYER_O {
        @Override
        public String toString() {
            return "O";
        }
    }
}
