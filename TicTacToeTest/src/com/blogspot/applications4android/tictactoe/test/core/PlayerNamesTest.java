package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.PlayerEnum;
import com.blogspot.applications4android.tictactoe.core.PlayerNames;
import com.blogspot.applications4android.tictactoe.exceptions.PlayerException;

import junit.framework.TestCase;


public class PlayerNamesTest extends TestCase {
    public void testAddPlayer() {
        PlayerException pe = null;
        boolean firstAdd = false;
        PlayerNames names = new PlayerNames();
        try {
            names.addPlayer(PlayerEnum.PLAYER_O, "name");
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
        PlayerNames names = new PlayerNames();
        try {
            names.addPlayer(PlayerEnum.PLAYER_O, "name");
            firstAdd = true;
            names.addPlayer(PlayerEnum.PLAYER_O, "name1");
        }
        catch(PlayerException e) {
            pe = e;
        }
        assertTrue(firstAdd);
        assertNotNull(pe);
    }

    public void testGetPlayerName() {
        PlayerNames names = new PlayerNames();
        try {
            names.addPlayer(PlayerEnum.PLAYER_O, "PlayerO");
            names.addPlayer(PlayerEnum.PLAYER_X, "PlayerX");
        }
        catch(Throwable t) {
            assertTrue(false);
        }
        try {
            assertEquals("PlayerO", names.getPlayerName(PlayerEnum.PLAYER_O));
            assertEquals("PlayerX", names.getPlayerName(PlayerEnum.PLAYER_X));
        }
        catch(Throwable t) {
            assertTrue(false);
        }
    }

    public void testBadGetPlayerName() {
        PlayerNames names = new PlayerNames();
        PlayerException pe = null;
        try {
            names.getPlayerName(PlayerEnum.PLAYER_O);
        }
        catch(PlayerException e) {
            pe = e;
        }
        assertNotNull(pe);
        pe = null;
        try {
            names.getPlayerName(PlayerEnum.PLAYER_X);
        }
        catch(PlayerException e) {
            pe = e;
        }
        assertNotNull(pe);
    }
}
