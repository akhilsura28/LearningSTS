package com.akhilsura28CRUD.dao;

import java.util.List;

import com.akhilsura28CRUD.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
	
	
	
	
}
