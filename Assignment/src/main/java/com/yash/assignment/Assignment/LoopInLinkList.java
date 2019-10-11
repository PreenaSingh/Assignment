package com.yash.assignment.Assignment;



public class LoopInLinkList {

	Node head;

	 static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public  int tofindIfloopExitstinLinkedList() {
		LoopInLinkList linkedList=createLinkList();
		boolean flag = false;
		Node head = linkedList.head;
		Node slow = head;
		Node fast = head;
		int count=0;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			count++;

			if (slow == fast) {
				flag = true;
				count++;
				break;

			}

		}
		
		if(flag) {
			return count;
		}
		else {
			return 0;
		}

	}
	private LoopInLinkList createLinkList() {
		LoopInLinkList loopInLinkListObj = new LoopInLinkList();

		loopInLinkListObj.head = new Node(1);
		Node node =loopInLinkListObj.head.next = new Node(2);
		loopInLinkListObj.head.next.next = new Node(3);
		loopInLinkListObj.head.next.next.next = new Node(4);
		loopInLinkListObj.head.next.next.next.next = new Node(5);
		loopInLinkListObj.head.next.next.next.next.next = node;
		
		return loopInLinkListObj;
				
	}

	
}
