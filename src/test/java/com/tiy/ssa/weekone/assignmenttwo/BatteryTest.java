package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		
	
		assertEquals("", 0, new Battery(0).discharge(56), 0.01);
		assertEquals("", 150, new Battery(150F).charge(25F), 0.01);
		assertEquals("", 1200 , new Battery(40).timeLeft(2), .01);
		
	}

}
