package com.yash.assignment.Assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImmutableTest {
	

	
	
	@Test
	public void shouldcheckIfClassIsImmutable() {
		Immutable actual=Immutable.create(5);
		assertEquals(5, actual.getI());
		
	}

}
