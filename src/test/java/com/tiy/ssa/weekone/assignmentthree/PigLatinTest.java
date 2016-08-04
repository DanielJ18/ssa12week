package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		
		assertEquals("eakspay", new PigLatin("Speak").translateOneWord()); 
		assertEquals("igpay", new PigLatin("Pig").translateOneWord()); 
		assertEquals("atinlay", new PigLatin("Latin").translateOneWord()); 
		assertEquals("isway", new PigLatin("is").translateOneWord()); 
		assertEquals("ardhay", new PigLatin("hard").translateOneWord()); 
		assertEquals("otay", new PigLatin("to").translateOneWord()); 
		
	}

}
