package com.akhilsura28CRUD.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilsura28CRUD.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
	//search by name
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lname);
	
}
