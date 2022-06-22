package com.example.project.dto;

import java.sql.Timestamp;
import java.lang.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class EmployeeResponse {
	
	private String name;
	private int log_id;
	private Timestamp accessTime;
	private String activity;
	
	
	public EmployeeResponse(String name, int log_id, Timestamp accessTime, String activity) {
		this.name = name;
		this.log_id = log_id;
		this.accessTime = accessTime;
		this.activity = activity;
	}

}
