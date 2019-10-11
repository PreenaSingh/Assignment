package com.yash.assignment.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.assignment.Assignment.*;

public class NumberOfVowelTest {
	
	
	NumberOfVowels numberOfVowelsTest=new NumberOfVowels();
	@Test
	public void shouldReturnCountofVowelsPresent() {
		int actual=numberOfVowelsTest.getnumberOfVowels("Preena");
		assertEquals(3, actual);
		
	}

}
