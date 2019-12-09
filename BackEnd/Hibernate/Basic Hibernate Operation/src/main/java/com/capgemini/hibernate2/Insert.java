package com.capgemini.hibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.movie1;

public class Insert {

	public static void main(String[] args) {
movie1 m = new movie1();
m.setMovie_ID(20);
m.setMovie_Name("Batla House");
m.setMovie_Rating("Good");
EntityTransaction transaction=null;
EntityManager entityManager =null;

try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	entityManager = entityManagerFactory.createEntityManager();
	transaction = entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(m);
	System.out.println("ID is: "+m.getMovie_ID());
	System.out.println("Name is: "+m.getMovie_Name());
	System.out.println("Rating is: "+m.getMovie_Rating());
	transaction.commit();
} catch (Exception e) {
	transaction.rollback();
	e.printStackTrace();
}
entityManager.close();

	}

}
