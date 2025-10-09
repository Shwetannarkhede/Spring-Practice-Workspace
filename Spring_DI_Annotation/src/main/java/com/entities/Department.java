package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Department {


	@Value("12")
	int Dept_id;
	@Value("HR")
	String name;
	
	
	
	public int getDept_id() {
		return Dept_id;
	}
	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Department(int dept_id, String name) {
		super();
		Dept_id = dept_id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [Dept_id=" + Dept_id + ", name=" + name + "]";
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
