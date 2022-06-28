package com.example.project.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="logId")
	private int logId;
	
	@Column(name="accessTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date accessTime = new Date(System.currentTimeMillis());
	
	@Column(name="activity")
	private String activity;
	
	
	
	public EmployeeLoginActivity(int logId, String activity,int emp_id) {
		super();
		this.logId = logId;
		this.activity = activity;
		
	}

	public int getLogId() {
		return logId;
	}
	
	public void setLogId(int logId) {
		this.logId = logId;
	}
	
	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}


	

}
