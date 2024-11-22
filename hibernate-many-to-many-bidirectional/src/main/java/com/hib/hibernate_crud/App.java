package com.hib.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Instructor;
import com.qn.entity.Student;
import com.qn.entity.StudentDetail;
import com.qn.entity.courses;


public class App 
{
	 public static void main( String[] args ){
	     SessionFactory factory=new Configuration().
	    		 configure("hibernate.cfg.xml").
	    		 addAnnotatedClass(Student.class).
	    		 addAnnotatedClass(StudentDetail.class).
	    		 addAnnotatedClass(courses.class).		 
	    		 addAnnotatedClass(Instructor.class).
	    		 buildSessionFactory();
	     Session session=factory.getCurrentSession();
	     session.beginTransaction();
	     
	     courses c=session.get(courses.class, 15);
	     Instructor i1=new Instructor("sachin","tendulkar","sachin@gmail.com");
	     Instructor i2=new Instructor("raghul","dravid","raghul@gmail.com");
	     
	     i1.addCourse(c);
	     i2.addCourse(c);
	     
	     session.save(i1);
	     session.save(i2);
	     
	     System.out.println(c);
	     
	     session.getTransaction().commit();
	    	
	    }
}
