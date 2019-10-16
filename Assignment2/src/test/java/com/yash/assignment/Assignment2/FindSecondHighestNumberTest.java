package com.yash.assignment.Assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSecondHighestNumberTest {
	
	
	FindSecondHighestNumber findSecondHighestNumberObj=new FindSecondHighestNumber();
	@Test
	public void shouldReturnSecondHighestNumberOfArray() {
		int[] arr=new int[] {7,2,1,6,19,3,42,11,99,99};
		int actual=findSecondHighestNumberObj.toFindSecondHighestNumber(arr);
		assertEquals(42, actual);
		
	}

}
