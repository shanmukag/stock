package com.eof.stock.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employee_id;
	
	@Column(name="emp_first_name")
	private String first_name;
		
	@Column(name="emp_middle_name")
	private String middle_name;
	
	@Column(name="emp_last_name")
	private String last_name;
	
	@Column(name="emp_dept_id")
	private int dept_id;
	
	@Column(name="emp_salary")
	private double salary;
	
	@Column(name="emp_designation_id")
	private int desg_id;
	
	@Column(name="emp_email_id")
	private String email_id;

	@Column(name="emp_mobile_number")
	private String mobile_number;
	
	@Column(name="emp_landline_number")
	private String landline_number;
	
	@Column(name="emp_dob")
	private String dob;
	
	@Column(name="emp_doj")
	private String doj;
	
	@Column(name="emp_joining_loc_id")
	private int joining_loc_id;
	
	@Column(name="emp_gender")
	private String gender;
	
	@Column(name="status_id")
	private int status_id;

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDesg_id() {
		return desg_id;
	}

	public void setDesg_id(int desg_id) {
		this.desg_id = desg_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getLandline_number() {
		return landline_number;
	}

	public void setLandline_number(String landline_number) {
		this.landline_number = landline_number;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int getJoining_loc_id() {
		return joining_loc_id;
	}

	public void setJoining_loc_id(int joining_loc_id) {
		this.joining_loc_id = joining_loc_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

}
