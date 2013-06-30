package com.blogspot.applications4android.tictactoe.core;

import java.util.ArrayList;

import com.blogspot.applications4android.tictactoe.exceptions.BadStringException;


/** Stores all the moves made so far */
public class Moves extends ArrayList<Move> {
    /** serial version ID */
    private static final long serialVersionUID = 7634281970121040009L;

    /** Default constructor */
    public Moves() {
        super();
    }

    /**
     * Construct Moves object from the string
     * @param str string
     * @throws BadStringException
     */
    public Moves(String str) throws BadStringException {
        super();
        String[] tokens = str.split(";");
        for(String token : tokens) {
            if(token.length() <= 0) {
                continue;
            }
            add(new Move(token));
        }
    }

    /**
     * Removes the last move from the list and returns it
     * @return the last move
     * @throw IndexOutOfBoundsException
     */
    public Move removeLast() throws IndexOutOfBoundsException {
        if(size() <= 0) {
            throw new IndexOutOfBoundsException("No moves available in the list!");
        }
        return remove(size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Move m: this) {
            sb.append(m.toString());
            sb.append(";");
        }
        return sb.toString();
    }
}
