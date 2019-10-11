package com.app.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.app.ems.pojo.Employee;

public interface EmployeeService {
	public Optional<Employee> getEmployeeById(Integer empId);

	public Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public String deleteEmployeeById(Integer customerId);

	
	public Employee updateEmployee(Integer empId, Employee newEmployee);
}
