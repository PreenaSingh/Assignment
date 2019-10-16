package com.yash.assignment.Assignment2;

import java.util.Arrays;

public class SumOfEvenNumber {
	
	public int toFindSumofEvenNumber(int[] arr) {
		return Arrays.stream(arr).filter(i->i%2==0).reduce(0,Integer::sum);
	}

}
