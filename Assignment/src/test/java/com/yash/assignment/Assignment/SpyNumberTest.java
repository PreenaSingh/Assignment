package com.yash.assignment.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.yash.assignment.Assignment.*;

public class SpyNumberTest {
	
	SpyNumber spyNumberObj=new SpyNumber();
	
	@Test
	public void toTestwhetherNumberIsSpyAndReturnTrue() {
		boolean actual=spyNumberObj.checkSpyNumber(1124);
		assertEquals(true, actual);
		
	}
	@Test
	public void toTestwhetherNumberIsSpyAndReturnFalse() {
		boolean actual=spyNumberObj.checkSpyNumber(114);
		assertEquals(false, actual);
		
	}

}
