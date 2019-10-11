package com.yash.assignment.Assignment;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.yash.assignment.Assignment.*;

public class FindNextNumberInSeriesTest {
	FndNextNumberInSeries findNextNumberInSeriesObj=new FndNextNumberInSeries();
	
	@Test
	public void shouldReturnNextElementOfSeries() {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(7);
		lst.add(10);
		lst.add(8);
		lst.add(11);
		lst.add(9);
		lst.add(12);
		int actualNum=findNextNumberInSeriesObj.toFindNextNumberInSeries(lst);
		assertEquals(10, actualNum);
		
		
	}

}
