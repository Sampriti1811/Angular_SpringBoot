package com.example.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Employee;
import com.example.project.model.EmployeeEdit;

public interface EmpEditRepository extends JpaRepository<EmployeeEdit, Integer>{
	
	//public EmployeeEdit getByName(String name);
	
	//public EmployeeEdit findByName(String name);

	public Optional<EmployeeEdit> findById(Integer id);

	public void deleteById(Integer id);

	public EmployeeEdit getById(Integer id);

}
