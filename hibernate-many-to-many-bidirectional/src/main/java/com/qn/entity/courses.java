package com.qn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class courses {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;

@Column(name="title")
private String title;
 
@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
@JoinColumn(name="student_id")

private Student s;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}


public Student getS() {
	return s;
}

public void setS(Student s) {
	this.s = s;
}

@Override
public String toString() {
	return "courses [id=" + id + ", title=" + title + ", s=" + s + "]";
}

public courses(String title, Student s) {
	super();
	this.title = title;
	this.s = s;
}
public courses()
{
super();
}
}
