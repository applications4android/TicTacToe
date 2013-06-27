package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.Marking;
import com.blogspot.applications4android.tictactoe.core.PlayerEnum;

import junit.framework.TestCase;


public class PlayerEnumTest extends TestCase {
    public void testNextPlayer() {
        PlayerEnum pl = PlayerEnum.PLAYER_X;
        assertEquals(PlayerEnum.PLAYER_O, pl.nextPlayer());
        pl = PlayerEnum.PLAYER_O;
        assertEquals(PlayerEnum.PLAYER_X, pl.nextPlayer());
    }

    public void testGetMarking() {
        PlayerEnum pl = PlayerEnum.PLAYER_X;
        assertEquals(Marking.MARK_X, pl.getMarking());
        pl = PlayerEnum.PLAYER_O;
        assertEquals(Marking.MARK_O, pl.getMarking());
    }
}
