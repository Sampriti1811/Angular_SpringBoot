package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.dto.EmployeeResponse;
import com.example.project.model.Employee;
import com.example.project.model.EmployeeLoginActivity;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query("SELECT name FROM Employee e")
	public List<EmployeeResponse> getJoinedInfo();
	
	public Employee findByName(String name);
	
	public Employee findByNameAndPassword(String name, String password);



	

}
//, emp.log_id, emp.accessTime, emp.activity 
// INNER JOIN e.emplog ON e.id