package com.thupham.dto;

public class DeptEmpDto {
	private String emplDept;
	private String empName;
	private String empEmail;
	private String empAddress;
	public String getEmplDept() {
		return emplDept;
	}
	public void setEmplDept(String emplDept) {
		this.emplDept = emplDept;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public DeptEmpDto(String emplDept, String empName, String empEmail, String empAddress) {
		super();
		this.emplDept = emplDept;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empAddress = empAddress;
	}
	
	
}
