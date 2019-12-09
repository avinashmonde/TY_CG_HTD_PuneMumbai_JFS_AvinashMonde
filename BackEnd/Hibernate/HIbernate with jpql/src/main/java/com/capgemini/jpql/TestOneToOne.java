package com.capgemini.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;
import com.capgemini.onetoone.Person;
import com.capgemini.onetoone.Votercard;

public class TestOneToOne {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;

		Person p = new Person();
		p.setPid(12);
		p.setPname("Avinash");
		
		
		Votercard v = new Votercard();
		v.setvaddress("Mumbai");
		p.setVotercard(v);
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); //we need to create Entity Manager Factory
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(p);
			Votercard cardDetails =entityManager.find(Votercard.class, 0);
			System.out.println(cardDetails.getVoter_id());
			System.out.println(cardDetails.getvaddress());
			System.out.println(cardDetails.getPerson().getPid());
			System.out.println(cardDetails.getPerson().getPname());
			System.out.println("Record saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}
