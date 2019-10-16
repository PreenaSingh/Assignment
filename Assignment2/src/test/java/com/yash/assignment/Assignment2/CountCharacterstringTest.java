package com.yash.assignment.Assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountCharacterstringTest {
	
	CountCharactersInString countCharactersInStringObj=new CountCharactersInString();
	
	@Test
	public void shouldReturnStringwithCharacterCount() {
		String str="iamyashemployee";
		String expected="ia2m2y2she3plo";
		String actual=countCharactersInStringObj.toReturnCountOfCharactersInString(str);
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
