package com.capgemini.jpawithhibenate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reference {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie data = entityManager.find(Movie.class, 5);
		//Movie data1=entityManager.getReference(Movie.class,5);
		System.out.println(data.getName());
		/*
		 * System.out.println("Name is: " + data1.getName());
		 * System.out.println("Rating is: " + data1.getRating());
		 */
	}

	

}
