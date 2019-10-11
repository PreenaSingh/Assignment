package com.yash.assignment.Assignment;

import java.util.ArrayList;
import java.util.List;

public class FndNextNumberInSeries {

	public static int toFindNextNumberInSeries(List<Integer> lst) {
		int number = lst.get(0);

		for (int i = 0; i < lst.size(); i++) {
			if (i % 2 == 0) {
				number = number + 3;

			} else {
				number = number - 2;
			}

		}

		return number;
	}



}
