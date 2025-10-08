package com.entities;

public class Student {
	int id;
	String name;
	String email;
	long mobileNo;
	Teacher tec;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public Teacher getTec() {
		return tec;
	}
	public void setTec(Teacher tec) {
		this.tec = tec;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", tec=" + tec
				+ "]";
	}
	public Student(int id, String name, String email, long mobileNo, Teacher tec) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.tec = tec;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
