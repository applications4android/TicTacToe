package com.blogspot.applications4android.ttt.test.core;

import com.blogspot.applications4android.ttt.core.Player;

import junit.framework.TestCase;


public class PlayerTest extends TestCase {
    public void testToString() {
        assertEquals("X", Player.PLAYER_X.toString());
        assertEquals("O", Player.PLAYER_O.toString());
    }
}
