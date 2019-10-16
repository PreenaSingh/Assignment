package com.yash.assignment.Assignment2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class SortHashMapValuesTest {
	
	SortHashMapValues sortHashMapValuesObj=new SortHashMapValues();
	
	@Test
	public void shouldReturnSortedMapOnBasisofValues() {
		
		
		 Map<String, Integer> name = new HashMap<>();
		 name.put("Preena", 120); 
		 name.put("Sai", 150);
		 name.put("Piya", 1150); 
		 name.put("Priya", 100);
		 name.put("Piyu", 130);
		 name.put("Ashmi", 90);
		
		 Map<String, Integer> actualMap=
		 			sortHashMapValuesObj.toSortMaponbasisofValues(name);
		 //System.out.println(actualMap);
		 LinkedHashMap<String, Integer> expected=new LinkedHashMap<String, Integer>();
		 expected.put("Ashmi", 90);
		 expected.put("Priya", 100);
		 expected.put("Preena", 120); 
		 expected.put("Piyu", 130);
		 expected.put("Sai", 150);
		 expected.put("Piya", 1150); 
		 System.out.println(actualMap);
		 System.out.println(expected.toString());
		assertThat(expected.toString(), is(actualMap.toString()));
		
	}
	@Test
	public void shouldReturnSortedMapOnBasisoffalse() {
		
		
		 Map<String, Integer> name = new HashMap<>();
		 name.put("Preena", 120); 
		 name.put("Sai", 150);
		 name.put("Piya", 1150); 
		 name.put("Priya", 100);
		 name.put("Piyu", 130);
		 name.put("Ashmi", 90);
		
		 Map<String, Integer> actualMap=
		 			sortHashMapValuesObj.toSortMaponbasisofValues(name);
		 //System.out.println(actualMap);
		 Map<String, Integer> expected=new TreeMap<String, Integer>();
		 expected.put("Ashmi", 90);
		 expected.put("Priya", 100);
		 expected.put("Preena", 120); 
		 expected.put("Piyu", 130);
		 expected.put("Sai", 150);
		 expected.put("Piya", 1150); 
		assertNotEquals(actualMap, is(expected));
		
	}

}
