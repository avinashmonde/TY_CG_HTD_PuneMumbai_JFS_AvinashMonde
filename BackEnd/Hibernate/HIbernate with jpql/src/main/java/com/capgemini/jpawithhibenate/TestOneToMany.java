package com.capgemini.jpawithhibenate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.onetomany.Pencil;
import com.capgemini.onetomany.PencilBox;

public class TestOneToMany {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;

		PencilBox pb = new PencilBox();
		pb.setBox_id(1);
		pb.setName("Flora");
		

		Pencil p = new Pencil();
		p.setPid(111);
		p.setColor("Pink");
		p.setPencilbox(pb);

		Pencil p1 = new Pencil();
		p1.setPid(102);
		p1.setColor("Green");
		p1.setPencilbox(pb);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test"); // we need to
																										// create Entity
																										// Manager
																										// Factory
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			// entityManager.persist(pb);
			entityManager.persist(p);
			entityManager.persist(p1);

			PencilBox pencilbox = entityManager.find(PencilBox.class, 1);
			System.out.println("PencilBox id:" + pb.getBox_id());
			System.out.println("PencilBox is: " + pb.getName());
			System.out.println("Data displaced");
			Pencil pencil = entityManager.find(Pencil.class, 1);
			System.out.println("Pencil id: " + p.getPid());
			System.out.println("Pencil Color: " + p.getColor());
			// System.out.println("PencilBox id: "+p.getPencilbox());

			// System.out.println(p.get)
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		entityManager.close();
	}

}
