package com.app.ems.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.app.ems.pojo.Employee;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

@RunWith(MockitoJUnitRunner.class)
public class TestEmployeePojo {
	@InjectMocks
	private Employee employee = new Employee();

	@Test
	public void testEmployeeToString() {
		Employee emp = new Employee("name", "email", "phoneNo", "address", "department", 1111);
		String str = emp.toString();
		assertEquals(emp.toString(), str);
	}

	@Test
	public void testEmployeeEqualsAndHashcode() {
		Employee e1 = new Employee(1, "name1", "email1", "phoneNo1", "address1", "department1", 1111);
		Employee e2 = new Employee(2, "name1", "email1", "phoneNo2", "address2", "department2", 2222);

		System.out.println("---------" + e1.hashCode());
		System.out.println("---------" + e2.hashCode());
		EqualsVerifier.forExamples(e1, e2).suppress(Warning.NONFINAL_FIELDS).usingGetClass().verify();
		
		// EqualsVerifier.forClass(Employee.class).suppress(Warning.NONFINAL_FIELDS)
		// .usingGetClass().verify();

		// EqualsVerifier.forRelaxedEqualExamples(e1, e2).andUnequalExamples(e1,
		// e2).suppress(Warning.NONFINAL_FIELDS)
		// .usingGetClass().verify();

	}

}
