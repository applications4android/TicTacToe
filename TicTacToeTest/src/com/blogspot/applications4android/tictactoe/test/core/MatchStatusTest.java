package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.MatchStatus;

import junit.framework.TestCase;


public class MatchStatusTest extends TestCase {
    public void testEnum() {
        MatchStatus status = MatchStatus.COMPLETED;
        assertTrue(status.isCompleted());
        status = MatchStatus.IN_PROGRESS;
        assertFalse(status.isCompleted());
        status = MatchStatus.DRAWN;
        assertTrue(status.isCompleted());
    }
}
