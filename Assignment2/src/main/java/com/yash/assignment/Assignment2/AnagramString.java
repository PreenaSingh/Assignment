package com.yash.assignment.Assignment2;

import java.util.List;
import java.util.stream.Collectors;

public class AnagramString {

	public boolean tocheckwhetherStringIsAnagram(String str1, String str2) {
		/*
		 * str1=str1.toLowerCase(); str2=str2.toLowerCase();
		 * 
		 * char[] characters = str1.toCharArray(); StringBuilder sbSecond = new
		 * StringBuilder(str2); for (char ch : characters) { int index =
		 * sbSecond.indexOf(Character.toString(ch)); if (index != -1) {
		 * sbSecond.deleteCharAt(index); } else { return false; } }
		 */
		
		 List<Character> char1=(str1.toLowerCase()).chars().mapToObj(e->(char)e).collect(Collectors.toList());
		 List<Character> char2=(str2.toLowerCase()).chars().mapToObj(e->(char)e).collect(Collectors.toList());
		 char1.removeAll(char2);
		 
		return char1.size()== 0 ? true : false;

	}
}
