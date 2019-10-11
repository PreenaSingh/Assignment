package com.yash.assignment.Assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.assignment.Assignment.*;


public class LoopInLinkListTest {
	
	LoopInLinkList loopInLinkListObj=new LoopInLinkList();
	@Test
	public void shouldReturntheCountofNodesInLoopInLinkedList() {
		
		
	int actualCount=loopInLinkListObj.tofindIfloopExitstinLinkedList();
	assertEquals(5, actualCount);
	}

}
