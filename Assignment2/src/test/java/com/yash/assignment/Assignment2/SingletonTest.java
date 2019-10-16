package com.yash.assignment.Assignment2;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void shouldReturnSingleObject() {
		Singelton instance1 = Singelton.getInstance();
		String filename = "file.ser";

		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();

			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
			Singelton instance2 = (Singelton) in.readObject();
			in.close();

			assertEquals(instance1.hashCode(), instance2.hashCode());
		} catch (Exception e) {
			System.out.println("exception");
		}

	}

}
