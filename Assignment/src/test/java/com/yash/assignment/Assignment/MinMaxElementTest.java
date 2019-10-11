package com.yash.assignment.Assignment;

import com.yash.assignment.Assignment.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class MinMaxElementTest {
	
	
	MinMaxElement minMaxElementObj=new MinMaxElement();
	@Test
	public void shouldReturnMinimumAndMaximumNumberinArray() {
		int[] integers = new int[] { 20, 98, 12, 7, 35 };
		List actual=minMaxElementObj.getminAndMaxofArray(integers);
		List<Integer> expected=new ArrayList<Integer>();
		expected.add(7);
		expected.add(98);
		assertEquals(expected, actual);

		

		
		
	}

}
