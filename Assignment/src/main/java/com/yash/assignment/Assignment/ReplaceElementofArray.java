package com.yash.assignment.Assignment;

import java.util.stream.IntStream;

import com.yash.assignment.exception.NoElementFoundException;

public class ReplaceElementofArray {

	public int[] toreplaceElementofArray(int[] arr, int element, int toReplaceValue) {
		int index = IntStream.range(0, arr.length).filter(i -> element == arr[i]).findFirst().orElse(-1);
		if (index == -1) {
			throw new NoElementFoundException("Element not found in array to replace");
		}
		arr[index] = toReplaceValue;

		return arr;

	}

}
