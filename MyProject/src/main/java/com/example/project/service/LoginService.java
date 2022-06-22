package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Employee;
import com.example.project.repository.EmployeeRepository;


@Service
public class LoginService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public Employee saveUser(Employee user) {
		
		return repo.save(user);
	}
	
	public Employee fetchUserByName(String name) {
		return repo.findByName(name);
	}

	public Employee fetchUserByNameAndPassword(String name, String password) {
		return repo.findByNameAndPassword(name,password);
	}
}
