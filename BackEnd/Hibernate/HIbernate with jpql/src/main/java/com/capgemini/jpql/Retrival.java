package com.capgemini.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrival {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("test");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		String jpql="from Movie";
		Query query=entityManager.createQuery(jpql);
		List<Movie> data=query.getResultList();
		for(Movie movie:data)
		{
			System.out.println(movie.getId());
			/*
			 * System.out.println("Name is "+a.getName());
			 * System.out.println("Rating is "+a.getRating());
			 */
		}
		
	}

}
