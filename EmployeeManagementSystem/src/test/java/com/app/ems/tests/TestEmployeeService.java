package com.app.ems.tests;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.app.ems.exception.ResourceNotFoundException;
import com.app.ems.pojo.Employee;
import com.app.ems.repository.EmployeeRepository;
import com.app.ems.service.EmployeeServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeService {
	@InjectMocks
	private EmployeeServiceImpl employeeService;

	@Mock
	private EmployeeRepository mockEmployeeRepository;
	@Rule
	public ExpectedException expectedEx= ExpectedException.none();
	@Test
	public void shouldReturnEmployeeObjectByProvidingEmployeeIdFromService() {
		Optional<Employee> mockEmp = this.getEmployee();

		when(mockEmployeeRepository.findById(1)).thenReturn(mockEmp);

		employeeService.getEmployeeById(1);

		verify(mockEmployeeRepository, times(1)).findById(1);
	}

	public Optional<Employee> getEmployee() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("nikhil");
		emp.setEmail("nikhil.bhoyar@yash.com");
		emp.setPhoneNo("9604167833");
		emp.setAddress("Nagpur");
		emp.setSalary(2000);
		emp.setDepartment("FWF");
		Optional<Employee> optEmp = Optional.of(emp);
		return optEmp;
	}

	@Test
	public void shouldReturnAllEmployeeObjectsFromService() {
		List<Employee> mockEmpList = this.getAllEmployees();

		when(mockEmployeeRepository.findAll()).thenReturn(mockEmpList);

		employeeService.getAllEmployees();


		verify(mockEmployeeRepository, times(1)).findAll();
	}

	public List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee());
		empList.add(new Employee());
		return empList;
	}

	@Test
	public void shouldSaveEmployeeInDbFrmService() {

		Employee mockEmployee = new Employee();

		when(mockEmployeeRepository.save(mockEmployee)).thenReturn(mockEmployee);

		employeeService.saveEmployee(mockEmployee);

		verify(mockEmployeeRepository,times(1)).save(mockEmployee);
	}



	@Test public void shouldUpdateEmployeeInDb() { 
		Employee updateEmployee=new Employee(2,"Priya","pp@pp","aa","2345","jj", 10.00);
		Employee toBeUpdate = new Employee(2,"Priya1","pp@pp1","aa1","23451","jj1", 101.00);
		Optional<Employee> optEmp = Optional.of(toBeUpdate);
		when(mockEmployeeRepository.findById(2)).thenReturn(optEmp);
		when(mockEmployeeRepository.save(toBeUpdate)).thenReturn(updateEmployee);
		employeeService.updateEmployee(2, updateEmployee);
		verify(mockEmployeeRepository,times(1)).findById(2);

	}


	@Test
	public void shoulDeleteDetailsOfGivenEmployee() {
		doNothing().when(mockEmployeeRepository).deleteById(1);
		employeeService.deleteEmployeeById(1);
		verify(mockEmployeeRepository, times(1)).deleteById(1);
	}
	

		@Test
		public void shouldThrowExceptionwhenEmployeeNotFound() {
			expectedEx.expect(ResourceNotFoundException.class);
			employeeService.updateEmployee(6, new  Employee(2,"Priya","pp@pp","aa","2345","jj", 10.00));
			
			
		}

	

}
