package com.qn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")//table name in the database
public class Student {
   @Id //represents primary key
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")//column name in the table
   private int id;
   
   @Column(name="first_name")//column name in the table
   private String first_name;
   
   @Column(name="last_name")//column name in the table
   private String last_name;
   
   @Column(name="email")//column name in the table
   private String email;
   
  
public Student(String first_name, String last_name, String email) {
	super();
	this.first_name = first_name;
	this.last_name = last_name;
	this.email = email;
}
public Student() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="student_detail_id")
private StudentDetail sd;

 

public StudentDetail getSd() {
	return sd;
}
public void setSd(StudentDetail sd) {
	this.sd = sd;
}
@Override
public String toString() {
	return "Student [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + "]";
}
   

	
}
   
   
  
