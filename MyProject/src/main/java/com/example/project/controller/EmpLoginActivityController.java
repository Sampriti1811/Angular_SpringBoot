package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.EmployeeLoginActivity;
import com.example.project.repository.EmpLoginActRepository;

@RestController
public class EmpLoginActivityController {
	
	@Autowired
	private EmpLoginActRepository empLoginActRepository;
	
	@RequestMapping(value = "/empLogin", method = RequestMethod.POST)
	//@CrossOrigin(origins = "http://localhost:4200")
	
	  public EmployeeLoginActivity save(@RequestBody EmployeeLoginActivity user){
	  
	  return empLoginActRepository.save(user);
	}

}
