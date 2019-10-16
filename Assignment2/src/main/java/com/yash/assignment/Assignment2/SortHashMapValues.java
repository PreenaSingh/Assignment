package com.yash.assignment.Assignment2;

import static java.util.Map.Entry.comparingByValue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapValues {

	public Map<String, Integer> toSortMaponbasisofValues(Map<String, Integer> mapOfValues) {

		Map<String, Integer> sorted = mapOfValues.entrySet().stream().sorted(comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		return sorted;

	}

}
