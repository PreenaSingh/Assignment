package com.app.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ems.exception.EmployeeNotFoundException;
import com.app.ems.pojo.Employee;
import com.app.ems.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "EmployeeController", description = "Rest APIs to Employee Entity")

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@ApiOperation(value = "", response = Iterable.class, tags = "")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success|ok"),
			@ApiResponse(code = 401, message = "not Authorized"), @ApiResponse(code = 403, message = "forbidden!!"),
			@ApiResponse(code = 404, message = "not found") })
	
	
	@GetMapping(value = "/{empId}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Employee getEmployeeById(@PathVariable Integer empId) {
		Optional<Employee> employee = empService.getEmployeeById(empId);
		if (employee.isPresent())
			return employee.get();
		else
			throw new EmployeeNotFoundException("Employee Not found");

	}

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> employeeNotFoundHandler(EmployeeNotFoundException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ApiOperation(value = "For get mapping", response = Employee.class, tags = "getEmployee")
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> empList = (List<Employee>) empService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	}

	@ApiOperation(value = "For post mapping", response = Employee.class, tags = "postEmployee")
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = empService.saveEmployee(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
	@ApiOperation(value = "For post mapping", response = Employee.class, tags = "deleteEmployee")
	@DeleteMapping(value = "/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer empId) {

		return new ResponseEntity<String>(empService.deleteEmployeeById(empId), HttpStatus.NO_CONTENT);

	}
	@ApiOperation(value = "For post mapping", response = Employee.class, tags = "putEmployee")
	@PutMapping(value = "/{empId}", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Employee> updateEmployee(@PathVariable Integer employeeId,
			@RequestBody Employee newEmployee) {
		return new ResponseEntity<Employee>(empService.updateEmployee(employeeId, newEmployee), HttpStatus.OK);

	}

}
