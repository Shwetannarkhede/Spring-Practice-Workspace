package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("123")
	int empId;
	@Value("ram")
	String empName;
	@Value("45LPA")
	String Salary;
	
	@Autowired
	Department dep;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + ", dep=" + dep + "]";
	}
	public Employee(int empId, String empName, String salary, Department dep) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
		this.dep = dep;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}