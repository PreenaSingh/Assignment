package com.yash.assignment.Assignment;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.yash.assignment.exception.NoElementFoundException;

public class ToReplaceElementOfArrayTest {
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	ReplaceElementofArray replaceElementOfArrayObj=new ReplaceElementofArray();
	@Test
	public void shouldReturnArrayAfterReplacingGivenElement() {
		int[] arr=new int[] {4,5,1,6};
		int[]actual=replaceElementOfArrayObj.toreplaceElementofArray(arr, 1, 7);
		int[] expected=new int[] {4,5,7,6};
		assertArrayEquals(expected, actual);
		
	}
	@Test
	public void shouldReturnExceptionwhenstartIndexisgreatorthanEndIndex() {

		int[] arr=new int[] {4,5,1,6};
		expectedEx.expect(NoElementFoundException.class);
		expectedEx.expectMessage("Element not found in array to replace");
		replaceElementOfArrayObj.toreplaceElementofArray(arr, 9, 7);

	}

}
