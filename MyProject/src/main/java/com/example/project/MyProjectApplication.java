package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.controller.EmployeeController;


@SpringBootApplication
public class MyProjectApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

}
