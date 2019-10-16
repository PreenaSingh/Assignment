package com.yash.assignment.Assignment2;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoubleTonTest {
	
	
	@Test
	public  void shouldChecktheatOnlytwoObjectsCanbecreated() {
	Doubleton obj1=	Doubleton.getInstance();
	Doubleton obj2=	Doubleton.getInstance();
	Doubleton obj3=	Doubleton.getInstance();
	assertThat(obj2.hashCode(), anyOf(is(obj1.hashCode()),is(obj3.hashCode())));
	}

}
