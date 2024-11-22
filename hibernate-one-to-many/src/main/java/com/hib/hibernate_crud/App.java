package com.hib.hibernate_crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Student;
import com.qn.entity.StudentDetail;
import com.qn.entity.courses;

import org.hibernate.Session;


public class App 
{
    public static void main( String[] args ){
     SessionFactory factory=new Configuration().
    		 configure("hibernate.cfg.xml").
    		 addAnnotatedClass(Student.class).
    		 addAnnotatedClass(StudentDetail.class).
    		 addAnnotatedClass(courses.class).
    		 buildSessionFactory();
     Session session=factory.getCurrentSession();
     session.beginTransaction();
     
     Student s=session.get(Student.class, 2);
     StudentDetail sd=new StudentDetail("electronics","goods");
     courses c1=new courses("mysql",s);
     courses c2=new courses("java",s);
     courses c3=new courses("python",s);
     
     s.addCourse(c1);
     s.addCourse(c2);
     s.addCourse(c3);
     
     session.save(c1);
     session.save(c2);
     session.save(c3);
     
     session.getTransaction().commit();
    	
    }
}
