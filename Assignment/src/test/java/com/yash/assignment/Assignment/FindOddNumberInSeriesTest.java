package com.yash.assignment.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.assignment.Assignment.*;

public class FindOddNumberInSeriesTest {
	 FindOddNumberInSeries fndOddNumberInSeriesObj=new FindOddNumberInSeries();
	
	@Test
	public void shouldReturntheWrongNumberInSeriesEven() {
		
		int[] arr = new int[] { 3, 12, 8, 22, 15, 18, 42, 23, 52 };
		int actualNum=fndOddNumberInSeriesObj.toFindtheWrongNumber(arr);
		assertEquals(15, actualNum);
	}
	@Test
	public void shouldReturntheWrongNumberInSeriesOdd() {
		
		int[] arr = new int[] { 3, 12, 8, 19, 13, 18, 42, 23, 52 };
		int actualNum=fndOddNumberInSeriesObj.toFindtheWrongNumber(arr);
		assertEquals(19, actualNum);
	}

}
