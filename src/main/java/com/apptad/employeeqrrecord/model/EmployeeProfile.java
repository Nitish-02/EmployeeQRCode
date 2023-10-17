package com.apptad.employeeqrrecord.model;

public class EmployeeProfile {
	
	String name;
	String designation;
	String doj;
	String bloodgroup;
	String contact;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "EmployeeProfile [name=" + name + ", designation=" + designation + ", doj=" + doj + ", bloodgroup="
				+ bloodgroup + ", contact=" + contact + "]";
	}
	
	

}
