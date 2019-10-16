package com.yash.assignment.Assignment2;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.Map.Entry.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharactersInString {

	public String toReturnCountOfCharactersInString(String value) {
		/*
		 * StringBuilder str = new StringBuilder(); 
		 * int count = 0;
		 * 
		 * StringBuilder sb = new StringBuilder();
		 *  value.chars().distinct().forEach(c ->
		 * sb.append((char) c)); 
		 * for (int i = 0; i < sb.length(); i++) {
		 *  count = 0;
		 * Character c1 = new Character(sb.charAt(i)); 
		 * for (int j = 0; j < value.length(); j++) { 
		 * Character c2 = new Character(value.charAt(j)); 
		 * if(c1.equals(c2)) { 
		 * count++;
		 *  } 
		 *  } if (count > 1)  { 
		 *  str.append(c1).append(count);
		 * } else { 
		 * str.append(c1);
		 *  }
		 *  }
		 */
		
		Map<Character, Integer> frequencies=value.chars().boxed()
        .collect(Collectors.toMap(k -> Character.valueOf((char) k.intValue()), v -> 1,Integer::sum,LinkedHashMap::new));
		
		//To convert a stream of primitives, you must first box the elements in their wrapper class 
		
		
		StringBuilder mapAsString = new StringBuilder("");
		frequencies.forEach((k,v)->mapAsString.append(k).append(v));
		return mapAsString.toString().replaceAll("1", "");
		/*
		 * for (Character key : frequencies.keySet()) {
		 * 
		 * if (frequencies.get(key) > 1) {
		 * mapAsString.append(key.charValue()).append(frequencies.get(key)); } else {
		 * mapAsString.append(key.charValue()); }
		 * 
		 * }
		 * 
		 * return mapAsString.toString();
		 */
	}

}
