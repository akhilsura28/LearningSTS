package com.akhilsura28CRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilsura28CRUD.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
