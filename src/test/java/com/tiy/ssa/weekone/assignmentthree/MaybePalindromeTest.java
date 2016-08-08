package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaybePalindromeTest {

	@Test
	public void test() {
		assertEquals(true, new MaybePalindrome("Racecar").isPalindrome());
		assertEquals(false, new MaybePalindrome(" Daniel").isPalindrome());
		assertEquals(true, new MaybePalindrome("lolol").isPalindrome());
		assertEquals(false, new MaybePalindrome("4545lm34").isPalindrome());
		assertEquals(true, new MaybePalindrome("ab23%32ba").isPalindrome());
		
		
	}

}
