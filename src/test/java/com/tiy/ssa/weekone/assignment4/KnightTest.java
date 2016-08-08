package com.tiy.ssa.weekone.assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnightTest {

    @Test
    public void test() {

	// you can only enter offset (x+1, y+2) for test

	assertEquals(true, new Knight(1, 0).isFirstMoveFromHomeLegal(2, 2));
	assertEquals(false, new Knight(0, 0).isHome(1, 2));
	assertEquals(true, new Knight(100, 100).move(101, 102));
    }

}
