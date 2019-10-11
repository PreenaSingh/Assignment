package com.yash.assignment.Assignment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.assignment.Assignment.*;
import com.yash.assignment.exception.SubListException;

public class SubListTest {

	SubListOfArray subListObj = new SubListOfArray();
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	@Test
	public void shouldReturnFindtheSublistOfgivenIndexOfArrayList() {

		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ls.add(i);
		}
		List<Integer> actualSublist = subListObj.findsubList(ls, 5, 9);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);

		assertThat(actualSublist, is(expected));

	}
	@Test
	public void shouldReturnExceptionwhenstartIndexisgreatorthanEndIndex() {

		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ls.add(i);
		}
		expectedEx.expect(SubListException.class);
		expectedEx.expectMessage("Please pass the correct start and end index");
		List<Integer> actualSublist = subListObj.findsubList(ls, 9, 8);

	}
	@Test
	public void shouldReturnExceptionwhenEndIndexisgreatorthanSize() {

		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ls.add(i);
		}
		expectedEx.expect(SubListException.class);
		expectedEx.expectMessage("Please pass the correct start and end index");
		List<Integer> actualSublist = subListObj.findsubList(ls, 2, 10);

	}

}
