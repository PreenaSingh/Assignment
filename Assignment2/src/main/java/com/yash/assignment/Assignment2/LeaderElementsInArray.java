package com.yash.assignment.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class LeaderElementsInArray {
	
	
	public List<Integer> toFindLeaderElementsofArray(int[] arr){
		List<Integer> leaderElements = new ArrayList<Integer>();
		leaderElements.add(arr[arr.length-1]);
		int flag=arr[arr.length-1];
		for (int i=arr.length-2;i>=0;i--) {
			if(arr[i]>flag) {
				leaderElements.add(arr[i]);
				flag=arr[i];
			}
		}
		return leaderElements;
	}

}
