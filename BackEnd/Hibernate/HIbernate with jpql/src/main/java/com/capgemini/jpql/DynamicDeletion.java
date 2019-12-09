package com.capgemini.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeletion 
{

	public static void main(String[] args)
	{
		EntityTransaction transaction =null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		String jpql="delete Movie where id =:mid";
		transaction = entityManager.getTransaction();
		transaction.begin();
		Query query=entityManager.createQuery(jpql);
		query.setParameter("mid", 2);
		
		int result=query.executeUpdate();
		transaction.commit();
			System.out.println(result);
			entityManager.close();
	}

}
