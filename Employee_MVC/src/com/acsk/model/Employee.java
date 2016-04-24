package com.acsk.model;

public class Employee {
	private int Eid;
	private String Ename;
	private int salary;
	private String desig;
	
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, int salary, String desig) {
		super();
		Eid = eid;
		Ename = ename;
		this.salary = salary;
		this.desig = desig;
	}
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	
}
