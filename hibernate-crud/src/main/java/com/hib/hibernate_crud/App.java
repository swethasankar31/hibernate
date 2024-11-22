package com.hib.hibernate_crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;

import org.hibernate.Session;


public class App 
{
    public static void main( String[] args ){
     SessionFactory factory=new Configuration().
    		 configure("hibernate.cfg.xml").
    		 addAnnotatedClass(Student.class).
    		 buildSessionFactory();
     Session session=factory.getCurrentSession();
     session.beginTransaction();
     Student s=new Student("sachin","tendulkar","sachin@gmail.com");
     session.save(s);
     session.getTransaction().commit();
    	
    }
}
