package com.yash.assignment.Assignment;

public class CapitalizeLetters {
	

	public static String returnCapitalizedLetterString(String sentence) {

		StringBuilder result = new StringBuilder(sentence.length());
		String words[] = sentence.split("\\ "); 
		for (int i = 0; i < words.length; i++)
		{			
			result.append(Character.toUpperCase(words[i].charAt(0)))
			.append(words[i].substring(1,words[i].length()-1))
			.append(Character.toUpperCase(words[i].charAt(words[i].length()-1))).append(" ");

		}
		return result.toString().trim();
	}


}
