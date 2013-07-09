package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.Move;
import com.blogspot.applications4android.tictactoe.core.Position;
import com.blogspot.applications4android.tictactoe.enums.PlayerEnum;

import junit.framework.TestCase;


public class MoveTest extends TestCase {
    public void testConstructor1() {
        Move m = new Move(PlayerEnum.PLAYER_O, 0, 0, 1);
        assertEquals(PlayerEnum.PLAYER_O, m.getPlayer());
        assertEquals(0, m.getX());
        assertEquals(0, m.getY());
        assertEquals(1, m.getZ());
    }

    public void testConstructor2() {
        Move m = new Move(PlayerEnum.PLAYER_X, 5, 2);
        assertEquals(PlayerEnum.PLAYER_X, m.getPlayer());
        assertEquals(5, m.getX());
        assertEquals(2, m.getY());
        assertEquals(0, m.getZ());
    }

    public void testConstructor3() {
        Position p = new Position(5, 2);
        Move m = new Move(PlayerEnum.PLAYER_X, p);
        assertEquals(PlayerEnum.PLAYER_X, m.getPlayer());
        assertEquals(5, m.getX());
        assertEquals(2, m.getY());
        assertEquals(0, m.getZ());
    }

    public void testConstructor4Good() {
        Exception te = null;
        try {
            Move m = new Move("PLAYER_O:0:0:0");
            assertEquals(PlayerEnum.PLAYER_O, m.getPlayer());
            assertEquals(0, m.getX());
            assertEquals(0, m.getY());
            assertEquals(0, m.getZ());
        }
        catch(Exception e) {
            te = e;
        }
        assertNull(te);
        te = null;
        try {
            Move m = new Move("PLAYER_X:1:1:1");
            assertEquals(PlayerEnum.PLAYER_X, m.getPlayer());
            assertEquals(1, m.getX());
            assertEquals(1, m.getY());
            assertEquals(1, m.getZ());
        }
        catch(Exception e) {
            te = e;
        }
        assertNull(te);
    }

    public void testConstructor4Bad() {
        Exception te = null;
        try {
            new Move("PLAYER_X:1:1");
        }
        catch(Exception e) {
            te = e;
        }
        assertNotNull(te);
        te = null;
        try {
            new Move("PLAYER_BAD:1:1:1");
        }
        catch(Exception e) {
            te = e;
        }
        assertNotNull(te);
    }

    public void testEquals() {
        Move m = new Move(PlayerEnum.PLAYER_O, 0, 0, 1);
        Move m1 = new Move(PlayerEnum.PLAYER_O, 0, 0);
        Position p = new Position(0, 0, 1);
        Move m2 = new Move(PlayerEnum.PLAYER_O, p);
        assertFalse(m.equals(m1));
        assertTrue(m.equals(m2));
    }

    public void testToString() {
        Move m = new Move(PlayerEnum.PLAYER_O, 0, 0, 1);
        assertEquals("PLAYER_O:0:0:1", m.toString());
    }
}
