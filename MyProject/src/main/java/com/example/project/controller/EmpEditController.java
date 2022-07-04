package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Employee;
import com.example.project.model.EmployeeEdit;
import com.example.project.service.EmpEditService;

@RestController
//@RequestMapping(value="/emp")
@CrossOrigin
public class EmpEditController {
	
	@Autowired 
	private EmpEditService services;
	
	//get employees
	@GetMapping("/employees")
	public List<EmployeeEdit> getEmployees() {
        return services.getEmployees();
    }
	
	//add a new employee
	@PostMapping("/employees")
	public EmployeeEdit addEmployee(@RequestBody EmployeeEdit employee) {
        return services.addEmployee(employee);
    }

    // Update employee
    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable("id") Integer id, @RequestBody EmployeeEdit employee) {
        services.updateEmployee(employee);
    }

    // Delete employee
    @DeleteMapping("/employees/{id}/delete")
    public void deleteEmployee(@PathVariable("id") Integer id) {
        services.deleteEmployee(id);
    }

}
