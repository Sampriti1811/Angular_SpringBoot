package com.example.project.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="employee_login_activity" , schema = "emp")
public class EmployeeLoginActivity {
	
	@Id
	private int log_id;
	
	@Column(name = "access_time")
	private Timestamp accessTime;
	
	@Column(name="activity")
	private String activity;
	
	
	
	public EmployeeLoginActivity(int log_id, Timestamp accessTime, String activity) {
		super();
		this.log_id = log_id;
		this.accessTime = accessTime;
		this.activity = activity;
	}

	public int getLog_id() {
		return log_id;
	}
	
	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
	
	public Timestamp getAccessTime() {
		return accessTime;
	}
	
	public void setAccessTime(Timestamp accessTime) {
		this.accessTime = accessTime;
	}
	
	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}


	

}
