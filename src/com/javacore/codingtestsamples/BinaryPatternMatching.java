package com.javacore.codingtestsamples;

public class BinaryPatternMatching {

	public static void main(String[] args) {
		BinaryPatternMatching binaryPattern = new BinaryPatternMatching();
		int match = binaryPattern.checkBinaryPatternMatch("010", "Amazing");
		System.out.println("match:" + match);
	}

	public int checkBinaryPatternMatch(String pattern, String s) {

		int patternLength = pattern.length();
		boolean patternMatch;
		int binaryPatternMatch = 0;

		for (int i = 0; i < s.length(); i++) {

			String temp = s.substring(i);

			if (temp.length() >= patternLength) {

				String sub = s.substring(i, patternLength + i);
				patternMatch = true;

				for (int j = 0; j < sub.length(); j++) {
					if (pattern.charAt(j) == '0' && !checkVowels(String.valueOf(sub.charAt(j)))) 
						patternMatch = false;

					if (pattern.charAt(j) == '1' && checkVowels(String.valueOf(sub.charAt(j))))
						patternMatch = false;

				}
				if (patternMatch) {
					binaryPatternMatch++;
					System.out.println("pattern matched-" + pattern + "-" + sub);
				}
			}
		}

		return binaryPatternMatch;

	}

	public boolean checkVowels(String letter) {
		String[] vowels = { "a", "e", "i", "o", "u", "y" };
		boolean isVowel = false;

		for (String vowel : vowels) {
			if (letter.equalsIgnoreCase(vowel))
				isVowel = true;
		}
		return isVowel;
	}

}
