package com.yash.assignment.Assignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AnagramStringTest {

	AnagramString anagramStringObj= new AnagramString();
	@Test
	public void shouldcheckIfgivenStringIsAnagramNReturnTrue(){
		boolean actual=anagramStringObj.tocheckwhetherStringIsAnagram("keep", "peek");
		assertEquals(true, actual);
		
	}
	@Test
	public void shouldcheckIfgivenStringIsAnagramNReturnFalse(){
		boolean actual=anagramStringObj.tocheckwhetherStringIsAnagram("Seek", "Peek");
		assertNotEquals(true, actual);
		
	}
	@Test
	public void shouldcheckIfgivenStringIsAnagramNReturn(){
		boolean actual=anagramStringObj.tocheckwhetherStringIsAnagram("motherinlaw", "hitlerwoman");
		assertNotEquals(false, actual);
		
	}
	@Test
	public void shouldcheckIfgivenStringIsAnagramReturn(){
		boolean actual=anagramStringObj.tocheckwhetherStringIsAnagram("motherinlaw", "hitlerwomen");
		assertEquals(false, actual);
		
	}
}
