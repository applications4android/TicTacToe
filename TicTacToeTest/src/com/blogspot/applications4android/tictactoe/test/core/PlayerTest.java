package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.Player;
import com.blogspot.applications4android.tictactoe.enums.PlayerEnum;
import com.blogspot.applications4android.tictactoe.enums.PlayerType;

import junit.framework.TestCase;


public class PlayerTest extends TestCase {
    public void testConstructor1() {
        Player p = new Player(PlayerEnum.PLAYER_O, "name", PlayerType.HUMAN);
        assertFalse(p.type().isComputer());
        assertEquals("name", p.name());
        assertEquals(PlayerEnum.PLAYER_O, p.mark());

        p = new Player(PlayerEnum.PLAYER_O, "name", PlayerType.COMPUTER);
        assertTrue(p.type().isComputer());
        assertEquals("name", p.name());
        assertEquals(PlayerEnum.PLAYER_O, p.mark());
    }
}
