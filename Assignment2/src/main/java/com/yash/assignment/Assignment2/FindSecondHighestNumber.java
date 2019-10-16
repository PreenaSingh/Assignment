package com.yash.assignment.Assignment2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSecondHighestNumber {

	
	public int toFindSecondHighestNumber(int[] arr) {
		IntStream arrayOfDistinctElem=Arrays.stream(arr).distinct().sorted();
		arr=arrayOfDistinctElem.toArray();
		return arr[arr.length-2];
		
	}
}
