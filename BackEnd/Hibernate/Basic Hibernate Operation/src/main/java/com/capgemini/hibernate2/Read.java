package com.capgemini.hibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.movie1;

public class Read {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =null;
		EntityManager entityManager =null;
		
		entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		movie1 data = entityManager.find(movie1.class, 1);
		System.out.println("Movie ID: "+data.getMovie_ID());
		System.out.println("Movie Name: "+data.getMovie_Name());
		System.out.println("Movie Rating: "+data.getMovie_Rating());
		System.out.println("-----------------------------");
		
		
	}

}
