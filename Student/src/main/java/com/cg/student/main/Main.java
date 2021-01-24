package com.cg.student.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.student.Address;
import com.cg.student.Student;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
//		student.setName("Deepak Patil");
//		Address homeAddress = new Address();
//		homeAddress.setStreet("MG Road");
//		homeAddress.setCity("Pune");
//		homeAddress.setState("Maharashtra");
//		homeAddress.setZipCode("411 017");
//		//inject address into student
//		student.setAddress(homeAddress);
//		//persist only student, no need to persist Address explicitly
//		em.persist(student);
//		
//		
//		
		Student student1 = new Student();
		student1.setName("Manoj");
		Address homeAddress = new Address();
		homeAddress.setStreet("GK MARG");
		homeAddress.setCity("MUMBAI");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("411 017");
		//inject address into student
		student1.setAddress(homeAddress);
		//persist only student, no need to persist Address explicitly
		em.persist(student1);
		
		em.getTransaction().commit();
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();


	}

}
