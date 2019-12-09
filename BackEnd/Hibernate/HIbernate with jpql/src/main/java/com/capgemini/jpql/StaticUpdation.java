package com.capgemini.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernate.dto.Movie;

public class StaticUpdation {
	
	public static void main(String[] args) {
		EntityTransaction transaction =null;
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			EntityManager entityManager= entityManagerFactory.createEntityManager();
			
			String jpql="update Movie set name='Batla House' where id=2";
			transaction = entityManager.getTransaction();
			transaction.begin();
			Query query=entityManager.createQuery(jpql); //common in all jpql query
			int result=query.executeUpdate();
			transaction.commit();
				System.out.println("Result "+result);
				entityManager.close();
			}
	}


