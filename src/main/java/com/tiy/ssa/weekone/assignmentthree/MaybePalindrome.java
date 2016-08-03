package com.tiy.ssa.weekone.assignmentthree;

public class MaybePalindrome {

	private final String word;

	public MaybePalindrome(String word) {
		this.word = word;
	}

	public boolean isPalindrome() {

		String reverseWord = "";
		int wordLength = word.length();

		for (int i = wordLength - 1; i >= 0; i--)

			reverseWord = reverseWord + word.charAt(i);

		if (word.equals(reverseWord))

			return true;

		return false;

	}

}