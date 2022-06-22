package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dto.EmployeeRequest;
import com.example.project.dto.EmployeeResponse;
import com.example.project.model.Employee;
import com.example.project.repository.EmpLoginActRepository;
import com.example.project.repository.EmployeeRepository;
import com.example.project.service.LoginService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmpLoginActRepository empLoginActRepository;
	
	@PostMapping("/empLog")
	public Employee empLog (@RequestBody EmployeeRequest request) {
		return employeeRepository.save(request.getEmployee());
	}
	
	@GetMapping("/findAllEmps")
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<EmployeeResponse> getJoinedInfo(){
		return employeeRepository.getJoinedInfo();
	}
	
	@Autowired 
	private LoginService service;
	  
	@GetMapping("/") 
	public String getWelcomeMsg() { 
		return "Welcome to Employee Service"; 
	}
	  
	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	
	  public Employee registerUser(@RequestBody Employee user) throws Exception {
	  
	  String tempName = user.getName(); if(tempName != null && !"".equals(tempName)) {
	  
	  Employee userobj = service.fetchUserByName(tempName);
	  
	  if(userobj !=null) { throw new Exception("user with "+tempName+
	  " is already exist"); } } Employee userObj = null; userObj =
	  service.saveUser(user); return userObj; }
	  
	  @PostMapping("/login")
	  
	  @CrossOrigin(origins = "http://localhost:4200") 
	  public Employee loginUser(@RequestBody Employee user) throws Exception { String tempName =
	  user.getName(); String tempPass = user.getPassword();
	  
	  Employee userObj = null;
	  
	  if(tempName != null && tempPass != null) { 
		  userObj = service.fetchUserByNameAndPassword(tempName, tempPass); }
	  
	  if(userObj == null) { 
		  throw new Exception("Bad credentials");
		 } 
	     return userObj; }
	 
	

}
