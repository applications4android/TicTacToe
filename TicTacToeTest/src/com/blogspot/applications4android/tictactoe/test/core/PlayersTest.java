package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.Player;
import com.blogspot.applications4android.tictactoe.core.Players;
import com.blogspot.applications4android.tictactoe.enums.PlayerEnum;
import com.blogspot.applications4android.tictactoe.enums.PlayerType;
import com.blogspot.applications4android.tictactoe.exceptions.PlayerException;

import junit.framework.TestCase;


public class PlayersTest extends TestCase {
    public void testAddPlayer() {
        PlayerException pe = null;
        boolean firstAdd = false;
        Players names = new Players();
        try {
            names.addPlayer(PlayerEnum.PLAYER_O, "name", PlayerType.HUMAN);
            firstAdd = true;
        }
        catch(PlayerException e) {
            pe = e;
        }
        assertTrue(firstAdd);
        assertNull(pe);
    }

    public void testBadAddPlayer() {
        PlayerException pe = null;
        boolean firstAdd = false;
        Players names = new Players();
        try {
            names.addPlayer(PlayerEnum.PLAYER_O, "name", PlayerType.COMPUTER);
            firstAdd = true;
            names.addPlayer(PlayerEnum.PLAYER_O, "name1", PlayerType.HUMAN);
        }
        catch(PlayerException e) {
            pe = e;
        }
        assertTrue(firstAdd);
        assertNotNull(pe);
    }

    public void testGetPlayerName() {
        Players names = new Players();
        try {
            names.addPlayer(PlayerEnum.PLAYER_O, "PlayerO", PlayerType.HUMAN);
            names.addPlayer(PlayerEnum.PLAYER_X, "PlayerX", PlayerType.HUMAN);
        }
        catch(Throwable t) {
            assertTrue(false);
        }
        try {
            Player p = names.getPlayer(PlayerEnum.PLAYER_O);
            assertEquals("PlayerO", p.name());
            p = names.getPlayer(PlayerEnum.PLAYER_X);
            assertEquals("PlayerX", p.name());
        }
        catch(Throwable t) {
            assertTrue(false);
        }
    }

    public void testBadGetPlayerName() {
        Players names = new Players();
        PlayerException pe = null;
        try {
            names.getPlayer(PlayerEnum.PLAYER_O);
        }
        catch(PlayerException e) {
            pe = e;
        }
        assertNotNull(pe);
        pe = null;
        try {
            names.getPlayer(PlayerEnum.PLAYER_X);
        }
        catch(PlayerException e) {
            pe = e;
        }
        assertNotNull(pe);
    }
}
