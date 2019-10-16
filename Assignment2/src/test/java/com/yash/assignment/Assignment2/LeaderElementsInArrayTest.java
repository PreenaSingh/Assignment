package com.yash.assignment.Assignment2;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LeaderElementsInArrayTest {
	
	LeaderElementsInArray leaderElementsInArrayObj=new LeaderElementsInArray();
	
	@Test
	public void shouldReturnAllLeaderElemetsInArray() {
		int[] arr=new int[] {16, 17, 4, 3, 5, 2};
		List<Integer> actualObj = leaderElementsInArrayObj.toFindLeaderElementsofArray(arr);
		System.out.println(actualObj);
		List<Integer> expectedObj=new ArrayList<Integer>();
		expectedObj.add(2);
		expectedObj.add(5);
		expectedObj.add(17);
		assertThat(actualObj, hasItems(2,5,17));
		
		
		
	}
	

}
