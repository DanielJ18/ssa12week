package com.tiy.ssa.weekone.assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathsTest {

	@Test
	public void test() {
	
		assertEquals(3, Maths.log2(8));
		assertEquals(3, Maths.log3(27) );
		assertEquals(0, Maths.log3(1) );
	}

		@Test
		
		public void stringy()
		{
			String abc = "ABC";
			String lower = abc.toLowerCase();
//			assertEquals("", "abc", abc);
			assertEquals("", "abc", lower);
			
		}
	
	

}
