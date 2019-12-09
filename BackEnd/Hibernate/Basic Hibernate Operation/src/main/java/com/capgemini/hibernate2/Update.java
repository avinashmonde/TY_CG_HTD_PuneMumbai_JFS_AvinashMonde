package com.capgemini.hibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.movie1;

public class Update {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory =null;
		EntityTransaction transaction =null; 
		try {
			
			
			entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			movie1 data =entityManager.find(movie1.class, 1);
			data.setMovie_Name("Batla House");
			System.out.println("Data Updated");
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
