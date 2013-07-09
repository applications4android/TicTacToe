package com.blogspot.applications4android.tictactoe.test.enums;

import com.blogspot.applications4android.tictactoe.enums.Marking;

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
