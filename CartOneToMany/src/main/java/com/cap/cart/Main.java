package com.cap.cart;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Items item1 = new Items();
		item1.setItemId("Laptop");
		item1.setItemTotal(100000.00);
		item1.setQuantity(5);
		
		Items item2 = new Items();
		item2.setItemId("Mobile");
		item2.setItemTotal(20000.50);
		item2.setQuantity(4);
		
		em.persist(item1);
		em.persist(item2);
		
		Set<Items> set1 = new HashSet<Items>();
		set1.add(item1);
		set1.add(item2);
		
		Cart cart1 = new Cart();
		cart1.setItems(set1);
		cart1.setName("C1000");
		cart1.setTotal(10000.50);
		
		em.persist(cart1);
		em.getTransaction().commit();
		em.close();
		
	}

}
