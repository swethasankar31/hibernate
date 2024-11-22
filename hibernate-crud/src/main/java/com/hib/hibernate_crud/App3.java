package com.hib.hibernate_crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;

import org.hibernate.Session;


public class App3 
{
    public static void main( String[] args ){
     SessionFactory factory=new Configuration().
    		 configure("hibernate.cfg.xml").
    		 addAnnotatedClass(Student.class).
    		 buildSessionFactory();
     Session session=factory.getCurrentSession();
     session.beginTransaction();
     Student s=(Student)session.get(Student.class, 1);
     s.setLast_name("tendukalar");
     session.update(s);
     session.getTransaction().commit();
    	
    }
}
