package com.eof.stock.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_contact")
public class Employee_Contact implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emp_contact_id;

	@Column(name = "emp_id")
	private long emp_id;

	@Column(name = "emp_door_number")
	private String door_number;

	@Column(name = "emp_flat_number")
	private String flat_number;

	@Column(name = "emp_street_name")
	private String street_name;

	@Column(name = "emp_land_mark")
	private String land_mark;

	@Column(name = "emp_country_id")
	private int country_id;

	@Column(name = "emp_state_id")
	private int state_id;

	@Column(name = "emp_district_id")
	private int district_id;

	@Column(name = "emp_pincode")
	private String pincode;

	@Column(name = "status_id")
	private int status_id;

	public long getEmp_contact_id() {
		return emp_contact_id;
	}

	public void setEmp_contact_id(long emp_contact_id) {
		this.emp_contact_id = emp_contact_id;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getDoor_number() {
		return door_number;
	}

	public void setDoor_number(String door_number) {
		this.door_number = door_number;
	}

	public String getFlat_number() {
		return flat_number;
	}

	public void setFlat_number(String flat_number) {
		this.flat_number = flat_number;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getLand_mark() {
		return land_mark;
	}

	public void setLand_mark(String land_mark) {
		this.land_mark = land_mark;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public int getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
}
