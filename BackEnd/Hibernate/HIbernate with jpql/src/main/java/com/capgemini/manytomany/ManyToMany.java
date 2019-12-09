package com.capgemini.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.capgemini.onetoone.Votercard;

public class ManyToMany {

	public static void main(String[] args) {
		
		Course c = new Course();
		c.setCid(105);
		c.setCname("BTECH");
		
		
		  Course c1 = new Course(); 
		  c1.setCid(666); 
		  c1.setCname("DR");
		 
		
		ArrayList<Course> Listal= new ArrayList<Course>();
		Listal.add(c);
		Listal.add(c1);
		
		Student s= new Student();
		s.setSid(9);
		s.setSname("Avinash");
		s.setCourse(Listal);
		
		
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			
			
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(c);
			//entityManager.persist(s);
			Course course2 =entityManager.find(Course.class, 1);
		    course2.getStudent().get(105).getSid();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			
		}
	
	}

}
