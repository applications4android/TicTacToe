package com.blogspot.applications4android.tictactoe.core;


/** Class representing a position in the board */
public class Position {
    /** x position in the board */
    public int x;
    /** y position in the board */
    public int y;
    /** z position in the board (for future purposes) */
    public int z;

    /**
     * Constructor
     * @param x_ x position
     * @param y_ y position
     * @param z_ z position
     */
    public Position(int x_, int y_, int z_) {
        x = x_;
        y = y_;
        z = z_;
    }

    /**
     * Constructor
     * @param x_ x position
     * @param y_ y position
     */
    public Position(int x_, int y_) {
        x = x_;
        y = y_;
        z = 0;
    }

    @Override
    public boolean equals(Object m) {
        Position p = (Position) m;
        if(p.x != x) return false;
        if(p.y != y) return false;
        if(p.z != z) return false;
        return true;
    }
}
