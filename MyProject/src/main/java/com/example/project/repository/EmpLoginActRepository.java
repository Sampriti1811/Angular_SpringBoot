package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.EmployeeLoginActivity;

public interface EmpLoginActRepository extends JpaRepository<EmployeeLoginActivity, Integer>{

}
