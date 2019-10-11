package com.yash.assignment.Assignment;

public class FindOddNumberInSeries {

	public static int toFindtheWrongNumber(int[] arr) {
		
		int num = arr[0];
		for (int i = 0, j = 1; i < arr.length; i = i + 2, j = j + 2) {

			if (i + 2 <= arr.length && arr[i] + 5 != arr[i + 2]) {
				num = arr[i + 2];
				break;

			}
			if (j + 2 <= arr.length && arr[j] + 10 != arr[j + 2]) {
				num = arr[j + 2];
				break;

			}

		}

		return num;
	}

	

}
