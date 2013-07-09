package com.blogspot.applications4android.tictactoe.test.enums;

import com.blogspot.applications4android.tictactoe.enums.PlayerType;

import junit.framework.TestCase;


public class PlayerTypeTest extends TestCase {
    public void testUsage() {
        PlayerType t = PlayerType.COMPUTER;
        assertFalse(t == PlayerType.HUMAN);
        assertTrue(t == PlayerType.COMPUTER);
        assertTrue(t.isComputer());

        t = PlayerType.HUMAN;
        assertTrue(t == PlayerType.HUMAN);
        assertFalse(t == PlayerType.COMPUTER);
        assertFalse(t.isComputer());
    }
}
