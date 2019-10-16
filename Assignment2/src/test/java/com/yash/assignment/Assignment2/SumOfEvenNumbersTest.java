package com.yash.assignment.Assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfEvenNumbersTest {
	SumOfEvenNumber sumOfEvenNumberObj=new SumOfEvenNumber();
	@Test
	public void shouldreturnsumOfEenNumber() {
		int[] arr=new int[] {2,6,8,1,9,6,17,12};
		
		int actual=sumOfEvenNumberObj.toFindSumofEvenNumber(arr);
		assertEquals(34, actual);
	}

}
