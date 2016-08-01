package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		
		assertEquals(2, new Power(1).base(2));
		assertEquals(4, new Power(2).base(2));
		assertEquals(8, new Power(3).base(2));
		assertEquals(16, new Power(4).base(2));
		assertEquals(32, new Power(5).base(2));
		
		
	}

}
