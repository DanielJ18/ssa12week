package com.tiy.ssa.weekone.assignmentthree;

public class PigLatin {

	private String word;

	public PigLatin(String word) {
		this.word = word;
	}
	

	
	
	public String translateOneWord( ) {

		if (isFirstCharVowel() == true) {
			return (word + "way");
		}

		if (isFirstCharVowel() == false && isSecondCharVowel() == false) {
			word = isFirstTwoConsonants(word);
			return (word);
		}
		if (isFirstCharVowel() == false && isSecondCharVowel() == true) {
			word = isFirstConsonantSecondVowel(word);
			return (word);
		}

		return "";

	}

	public boolean isFirstCharVowel() {

		word = word.toLowerCase();
		char firstChar = word.charAt(0);

		if ((firstChar == 'a') || (firstChar == 'e') || (firstChar == 'i') || (firstChar == 'o') || (firstChar == 'u'))

			return true;

		return false;

	}

	public boolean isSecondCharVowel() {

		word = word.toLowerCase();
		char secondChar = word.charAt(1);

		if ((secondChar == 'a') || (secondChar == 'e') || (secondChar == 'i') || (secondChar == 'o')
				|| (secondChar == 'u'))

			return true;

		return false;

	}

	public String isFirstConsonantSecondVowel(String word) {

		String newWord = "";
		char firstChar = word.charAt(0);

		for (int i = 1; i < word.length(); i++) {

			newWord = newWord + word.charAt(i);
		}

		newWord = newWord + firstChar + "ay";

		return (newWord);
	}

	public String isFirstTwoConsonants(String word)

	{
		String newWord = "";
		char firstChar = word.charAt(0);
		char secondChar = word.charAt(1);

		
		for (int i = 2; i < word.length(); i++) {

			newWord = newWord + word.charAt(i);
		}

		newWord = newWord + firstChar + secondChar + "ay";

		return (newWord);
	}

	

}
