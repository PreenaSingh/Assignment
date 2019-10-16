package com.yash.assignment.Assignment2;

import java.io.Serializable;

public class Singelton implements Serializable {

	private static Singelton object;

	private Singelton() {

	}

	public static Singelton getInstance() {

		if (object == null) {
			synchronized (Singelton.class) {
				if (object == null)
					object = new Singelton();
			}
		}
		return object;

	}

	protected Object readResolve() {
		return object;
	}

}
