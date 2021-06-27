package com.akhilsura28CRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akhilsura28CRUD.entity.Employee;

@RepositoryRestResource//(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
