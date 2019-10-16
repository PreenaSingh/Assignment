package com.yash.assignment.Assignment2;

public class Doubleton {

	private static Doubleton object;
	public static int objCount = 0;

	private Doubleton() {
		
	}

	public static Doubleton getInstance() {
		if (objCount < 2) {
			objCount++;
			object = new Doubleton();
		}
		return object;

	}

}
