package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.dto.EmployeeResponse;
import com.example.project.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query("SELECT e.name, emp.log_id, emp.accessTime, emp.activity FROM employee e INNER JOIN e.emplog ON e.id")
	public List<EmployeeResponse> getJoinedInfo();
	
	public Employee findByName(String name);
	
	public Employee findByNameAndPassword(String name, String password);

	

}
