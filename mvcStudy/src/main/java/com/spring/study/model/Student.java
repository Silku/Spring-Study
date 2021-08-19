package com.spring.study.model;

public class Student {
	private int seq; //순번
	private String id; //학번
	private String name; //이름
	private String phone; //전화번호
	private String pwd;
	
public Student() {
	// TODO Auto-generated constructor stub
}


public Student(int seq, String id, String name, String phone, String pwd) {
	super();
	this.seq = seq;
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.pwd = pwd;
}


public int getSeq() {
	return seq;
}

public void setSeq(int seq) {
	this.seq = seq;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

@Override
public String toString() {
	return "Student [seq=" + seq + ", id=" + id + ", name=" + name + ", phone=" + phone + ", pwd=" + pwd + "]";
}
 

	
}
