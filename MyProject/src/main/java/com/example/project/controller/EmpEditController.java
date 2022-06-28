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
@RequestMapping(value="/emp")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpEditController {
	
	@Autowired 
	private EmpEditService services;
	
	//Add new employee
	@PostMapping("/addEmployee")
    public EmployeeEdit addEmployee(@RequestBody EmployeeEdit employee) {
        return services.addEmployee(employee);
    }

    // Add more than 1 employee
    @PostMapping("/addEmployees")
    public List<EmployeeEdit> addAllEmployees(@RequestBody List<EmployeeEdit> employees) {
        return services.addAllEmployees(employees);
    }
    
 // Get employee by Id
    @GetMapping("/getEmployeeByID/{id}")
    public EmployeeEdit getEmployeeById(@PathVariable long id) {
        return services.getEmployeeByID(id);
    }

    // Get employee by name
    @GetMapping("/getEmployeeByName/{name}")
    public  EmployeeEdit getEmployeeByName(@PathVariable String name) {
        return  services.getEmployeeByName(name);
    }

    // Update employee
    @PutMapping("/updateEmployee")
    public EmployeeEdit updateEmployee(@RequestBody EmployeeEdit employee) {
        return services.updateEmployee(employee);
    }

    // Delete employee
    @DeleteMapping("/deleteEmployeeById/{id}")
    public boolean deleteEmployeeByID(@PathVariable long id) {
        return services.deleteEmployeeByID(id);
    }

    // Get all employee
    @GetMapping("/getAll")
    public List<EmployeeEdit> getAllEmployee() {
        return services.getAllEmployees();
    }

}
