package com.hib.hibernate_crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;
import com.qn.entity.StudentDetail;

import org.hibernate.Session;


public class App 
{
    public static void main( String[] args ){
     SessionFactory factory=new Configuration().
    		 configure("hibernate.cfg.xml").
    		 addAnnotatedClass(Student.class).
    		 addAnnotatedClass(StudentDetail.class).
    		 buildSessionFactory();
     Session session=factory.getCurrentSession();
     session.beginTransaction();
     
     Student s=new Student("virat","kohil","virat@gmail.com");
     StudentDetail sd=new StudentDetail("electronics","goods");
//     s.setS(s);
     s.setSd(sd);
//     s.setS(s);
     session.save(s);
     session.getTransaction().commit();
    	
    }
}
