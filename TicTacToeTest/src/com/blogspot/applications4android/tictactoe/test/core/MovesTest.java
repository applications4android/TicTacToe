package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.Move;
import com.blogspot.applications4android.tictactoe.core.Moves;
import com.blogspot.applications4android.tictactoe.core.PlayerEnum;

import junit.framework.TestCase;


public class MovesTest extends TestCase {
    public void testConstructor1() {
        Moves m = new Moves();
        assertEquals(0, m.size());
    }

    public void testConstructor2() {
        Exception te = null;
        try {
            Moves m = new Moves("PLAYER_O:0:0:0;PLAYER_X:1:1:1;");
            assertEquals(2, m.size());
        }
        catch(Exception e) {
            te = e;
        }
        assertNull(te);
    }

    public void testGoodRemoveLast() {
        Moves m = new Moves();
        assertEquals(0, m.size());
        Move mo1 = new Move(PlayerEnum.PLAYER_X, 0, 0, 1);
        m.add(mo1);
        assertEquals(1, m.size());
        Exception e = null;
        try {
            Move mo = m.removeLast();
            assertEquals(mo1, mo);
        }
        catch(Exception e1) {
            e = e1;
        }
        assertNull(e);
        assertEquals(0, m.size());
    }

    public void testBadRemoveLast() {
        Moves m = new Moves();
        assertEquals(0, m.size());
        Exception e = null;
        try {
            m.removeLast();
        }
        catch(Exception e1) {
            e = e1;
        }
        assertNotNull(e);
        assertEquals(0, m.size());
    }

    public void testToString() {
        Moves m = new Moves();
        m.add(new Move(PlayerEnum.PLAYER_O, 0, 0));
        m.add(new Move(PlayerEnum.PLAYER_X, 1, 1));
        assertEquals("PLAYER_O:0:0:0;PLAYER_X:1:1:0;", m.toString());
    }
}
