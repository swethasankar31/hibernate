package com.qn.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {
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
	   
	   @ManyToMany(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	   @JoinTable(name="course_instructor",
			   joinColumns=@JoinColumn(name="instructor_id"),
	               inverseJoinColumns=@JoinColumn(name="course_id"))
	   private List<courses>c;
	   
	   
	public Instructor(String first_name, String last_name, String email) {
		// TODO Auto-generated constructor stub
	}
	public void addCourse(courses tempCourse) {
	   	if(c==null) {
	   		c=new ArrayList<courses>();
	   		
	   	}
	   	c.add(tempCourse);
	   }
	   	public List<courses> getC() {
	   		return c;
	   	}
	   	public void  setC(List<courses>c) {
	   		 this.c=c;
	   	 }
	   	
	   }

	    
	   
	   
	   
	   
	   
	   

