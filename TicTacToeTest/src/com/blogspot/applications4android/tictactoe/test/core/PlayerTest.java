package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.Player;

import junit.framework.TestCase;


public class PlayerTest extends TestCase {
    public void testNextPlayer() {
        assertEquals(Player.PLAYER_O, Player.PLAYER_X.nextPlayer());
        assertEquals(Player.PLAYER_X, Player.PLAYER_O.nextPlayer());
    }
}
