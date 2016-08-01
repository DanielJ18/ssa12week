package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals("",  78, new Thermometer(78, true).display(true));
		
//		assertEquals("212f -> 100c",  100, new Thermometer (212, true).display(false));
		
//		assertEquals("",)
	}

	@Test
	public void displayCToF(){
		

		assertEquals("",  32, new Thermometer(0, false).display(true));
		
	}
	
	@Test
	public void displayFToC(){
	assertEquals("",  100, new Thermometer(212, true).display(false));
	
	}
	

	
}
