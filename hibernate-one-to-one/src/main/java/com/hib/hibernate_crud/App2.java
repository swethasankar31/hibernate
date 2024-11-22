package com.hib.hibernate_crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;
import com.qn.entity.StudentDetail;

import org.hibernate.Session;


public class App2 
{
    public static void main( String[] args ){
     SessionFactory factory=new Configuration().
    		 configure("hibernate.cfg.xml").
    		 addAnnotatedClass(Student.class).
    		 addAnnotatedClass(StudentDetail.class).
    		 buildSessionFactory();
     Session session=factory.getCurrentSession();
     session.beginTransaction();
     Student s=(Student)session.get(Student.class, 3);
     System.out.println(s);
     StudentDetail sd=s.getSd();
     System.out.println(sd);
     session.getTransaction().commit();
    	
    }
}
