package com.blogspot.applications4android.tictactoe.exceptions;


/** Exception thrown when a bad string is passed to Move or Moves */
public class BadStringException extends Exception {
    /** serial version ID */
    private static final long serialVersionUID = 1383359829662939734L;

    /**
     * Construct an exception object with the message
     * @param msg message
     */
    public BadStringException(String msg) {
        super(msg);
    }
}
