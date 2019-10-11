package com.app.ems.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.ems.pojo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> 
{

}
