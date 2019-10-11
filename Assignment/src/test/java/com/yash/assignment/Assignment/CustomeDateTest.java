package com.yash.assignment.Assignment;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;


import com.yash.assignment.Assignment.CustomeDate;

public class CustomeDateTest {
	
	CustomeDate customeDateObj=new CustomeDate();
	
	@Test
	public void shouldReturnTheDateafteraddingNumbertoCurrentDate() {
		
		LocalDate actual=customeDateObj.tofindDateafterAddigNumberToCurrentDate(7);
		
		assertEquals(LocalDate.of(2019, 10, 16), actual);
	}

}
