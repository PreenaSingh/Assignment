package com.app.ems.service;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.ems.pojo.Employee;
import com.app.ems.repository.EmployeeRepository;
import com.app.ems.exception.ResourceNotFoundException;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Optional<Employee> getEmployeeById(Integer empId) {
		return empRepo.findById(empId);

	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
	 List<Employee>empList = (List<Employee>) empRepo.findAll();
		return empList;
	}

	@Override
	public String deleteEmployeeById(Integer empId) {
		empRepo.deleteById(empId);
			return "Deleted";
	}

	@Override
	public Employee updateEmployee(Integer empId, Employee newEmployee) {
	
		return empRepo.findById(empId).map(emp -> {
			emp.setName(newEmployee.getName());
			emp.setAddress(newEmployee.getAddress());
			emp.setPhoneNo(newEmployee.getPhoneNo());
			emp.setDepartment(newEmployee.getDepartment());
			emp.setEmail(newEmployee.getEmail());
			return empRepo.save(emp);
			
		}).orElseThrow(() -> new ResourceNotFoundException("Employee [empId=" + empId + "] can't be found"));

	}

}
