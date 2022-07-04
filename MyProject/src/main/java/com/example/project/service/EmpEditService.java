package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Employee;
import com.example.project.model.EmployeeEdit;
import com.example.project.repository.EmpEditRepository;
import com.example.project.repository.EmployeeRepository;

@Service
public class EmpEditService {
	
	@Autowired
	private EmpEditRepository repos;
	
	public List<EmployeeEdit> getEmployees() {
		return repos.findAll();
	}
	
	public EmployeeEdit addEmployee(EmployeeEdit employee) {
        return repos.save(employee);
    }

    public EmployeeEdit updateEmployee(EmployeeEdit employee) {
        EmployeeEdit existingEMP = repos.findById(employee.getId()).orElse(null);
        System.out.println(employee);
        if(existingEMP == null) {
            System.out.println("Emp not found");
            return  repos.save(employee);
        }else  {
            //existingEMP.setName(employee.getName());
            existingEMP.setEmail(employee.getEmail());
            //existingEMP.setSalary(employee.getSalary());
            repos.save(existingEMP);
        }
        return employee;
    }

    public boolean deleteEmployee(Integer id) {
        EmployeeEdit existingEMP = repos.getById(id);
        if(existingEMP != null) {
            repos.deleteById(id);
            return true;
        }
        return false;
    }



	

	
}
