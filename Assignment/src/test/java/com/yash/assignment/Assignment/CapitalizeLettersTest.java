package com.yash.assignment.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CapitalizeLettersTest {

	CapitalizeLetters capitalizeLettersObj=new CapitalizeLetters();
	
	@Test
	public void shouldReturnStringwithstartandendletterasCapitol() {
		
		String actual=capitalizeLettersObj.returnCapitalizedLetterString("Welcome to yash");
		assertEquals("WelcomE TO YasH", actual);
	} 
	
}
