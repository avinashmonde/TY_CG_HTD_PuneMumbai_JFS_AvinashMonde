package com.capgemini.jpawithhibenate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie data = entityManager.find(Movie.class, 1);
		System.out.println("ID: " + data.getId());
		System.out.println("Name is: " + data.getName());
		System.out.println("Rating is: " + data.getRating());

	}

}
