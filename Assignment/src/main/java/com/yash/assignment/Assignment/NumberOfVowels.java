package com.yash.assignment.Assignment;

public class NumberOfVowels {

	public int getnumberOfVowels(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count++;
			}
		}
		return count;
	}

}
