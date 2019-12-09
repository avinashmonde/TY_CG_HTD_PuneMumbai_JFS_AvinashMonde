package com.capgemini.jpawithhibenate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;
import javax.persistence.EntityManager;
public class Reattaching {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); // we need to create Entity Manager Factory
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie data = entityManager.find(Movie.class, 2);
			System.out.println(entityManager.contains(data));
			entityManager.detach(data);
			System.out.println(entityManager.contains(data));
			Movie movie1= entityManager.merge(data);
			movie1.setName("querty");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

}
