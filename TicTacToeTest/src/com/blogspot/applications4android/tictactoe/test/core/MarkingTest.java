package com.blogspot.applications4android.tictactoe.test.core;

import com.blogspot.applications4android.tictactoe.core.Marking;

import junit.framework.TestCase;


public class MarkingTest extends TestCase {
    public void testIsAlreadyMarked() {
        Marking m = Marking.MARK_X;
        assertTrue(m.isAlreadyMarked());
        m = Marking.MARK_O;
        assertTrue(m.isAlreadyMarked());
        m = Marking.MARK_NONE;
        assertFalse(m.isAlreadyMarked());
    }
}
