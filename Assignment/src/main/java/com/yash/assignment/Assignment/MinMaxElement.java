package com.yash.assignment.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxElement {
	
	


	public List getminAndMaxofArray(int[] arr) {
		int min=Arrays.stream(arr).min().getAsInt();
		int max=Arrays.stream(arr).max().getAsInt();
		List<Integer> minMaxNumber=new ArrayList<Integer>();
		minMaxNumber.add(min);
		minMaxNumber.add(max);

		return minMaxNumber;

	}

}
