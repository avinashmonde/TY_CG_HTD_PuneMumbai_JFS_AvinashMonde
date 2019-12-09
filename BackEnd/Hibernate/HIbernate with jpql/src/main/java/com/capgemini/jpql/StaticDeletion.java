package com.capgemini.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StaticDeletion {

	public static void main(String[] args) {

		EntityTransaction transaction =null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		String jpql="delete Movie where id =1";
		transaction = entityManager.getTransaction();
		transaction.begin();
		Query query=entityManager.createQuery(jpql);
		
		int result=query.executeUpdate();
		transaction.commit();
			System.out.println(result);
			entityManager.close();
	}

}
