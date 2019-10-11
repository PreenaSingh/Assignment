package com.app.ems.tests;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.jndi.ExpectedLookupTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.app.ems.controller.EmployeeController;
import com.app.ems.exception.EmployeeNotFoundException;
import com.app.ems.exception.ResourceNotFoundException;
import com.app.ems.pojo.Employee;
import com.app.ems.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EmployeeController.class)
public class TestEmployeeRestControllerApi {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmployeeService employeeService;
	@Rule
	public ExpectedException expectedEx= ExpectedException.none();
	@Test
	public void shouldReturnEmployeeByProvidingEmployeeId() throws Exception {
		Employee employee = new Employee(1, "name", "email", "phoneNo", "address", "department", 1111);

		Optional<Employee> mockEmployee = Optional.of(employee);

		when(employeeService.getEmployeeById(Mockito.anyInt())).thenReturn(mockEmployee);

		this.mockMvc.perform(get("/emp/1")).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.name").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.email").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.phoneNo").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.address").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.department").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.salary").exists());
	}

	@Test
	public void shouldReturnListOfEmployee() throws Exception {
		List<Employee> mockEmployees = new ArrayList<Employee>();
		mockEmployees.add(new Employee(1, "name", "email", "phoneNo", "address", "department", 1111));
		mockEmployees.add(new Employee(2, "name", "email", "phoneNo", "address", "department", 1111));

		when(employeeService.getAllEmployees()).thenReturn(mockEmployees);

		this.mockMvc.perform(get("/emp")).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].id").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].name").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].email").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].phoneNo").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].address").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].department").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$[0].salary").exists());
	}

	@Test
	public void shouldThrowExceptionWhenEmployeeNotFound() throws Exception {

		when(employeeService.getEmployeeById(3)).thenThrow(new EmployeeNotFoundException("Employee Not Found"));

		this.mockMvc.perform(get("/emp/1")).andExpect(status().isNotFound());

	}

	@Test
	public void shouldSaveEmployeeInDb() throws Exception {
		Employee emp = new Employee("name", "email", "phoneNo", "address", "department", 3333);
		ObjectMapper mapper = new ObjectMapper();
		String employeeRequestBody = mapper.writeValueAsString(emp);
		System.out.println("--------" + employeeRequestBody);
		when(employeeService.saveEmployee(emp)).thenReturn(emp);
		this.mockMvc.perform(post("/emp").content(employeeRequestBody).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));

	}

	@Test
	public void shouldUpdateEmployeeInDb() throws Exception {
		Employee emp = new Employee("preena", "email@email.com", "9082", "qtyu", "cs", 3333);
		Employee updateEmp = new Employee("preena", "email@email.com", "9082", "qtyu", "cs", 3333);
		ObjectMapper mapper = new ObjectMapper();
		String employeeRequestBody = mapper.writeValueAsString(emp);
		
		when(employeeService.updateEmployee(2, emp)).thenReturn(updateEmp);
		this.mockMvc.perform(put("/emp/{empId}",2).content(employeeRequestBody).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));
	}

	@Test
	public void shouldDeleteEmployeeOfgivenID() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.delete("/emp/{empId}", 1)).andExpect(status().isNoContent());
	}
	
	
}
