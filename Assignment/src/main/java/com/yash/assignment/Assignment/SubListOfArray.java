package com.yash.assignment.Assignment;

import java.util.ArrayList;
import java.util.List;

import com.yash.assignment.exception.SubListException;

public class SubListOfArray {

	public List findsubList(List actualList, int startIndex, int endIndex) {

		if (endIndex < actualList.size() && startIndex <= endIndex) {
			return actualList.subList(startIndex, endIndex);
		} else {
			throw new SubListException("Please pass the correct start and end index");
		}

	}

}
