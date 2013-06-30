package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.Position;

import junit.framework.TestCase;


public class PositionTest extends TestCase {
    public void testConstructor1() {
        Position p = new Position(1, 2, 3);
        assertEquals(1, p.x);
        assertEquals(2, p.y);
        assertEquals(3, p.z);
    }

    public void testConstructor2() {
        Position p = new Position(4, 5);
        assertEquals(4, p.x);
        assertEquals(5, p.y);
        assertEquals(0, p.z);
    }

    public void testEquals() {
        Position p1 = new Position(1, 1, 1);
        Position p2 = new Position(1, 2, 1);
        assertFalse(p1.equals(p2));
        p2.y = 1;
        assertTrue(p1.equals(p2));
    }
}
