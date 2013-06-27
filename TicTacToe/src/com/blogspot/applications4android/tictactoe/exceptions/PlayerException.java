package com.blogspot.applications4android.tictactoe.exceptions;


/** Exception thrown while trying to set or get incorrect player in the list */
public class PlayerException extends Exception {
    /** serial version id */
    private static final long serialVersionUID = 47957488684526182L;

    /**
     * Construct an exception object with the message
     * @param msg message
     */
    public PlayerException(String msg) {
        super(msg);
    }
}
