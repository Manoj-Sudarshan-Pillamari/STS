package com.cap.cart;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private long id;
	
	@Column(name = "cart_name")
	private String name;
	
	@Column(name = "total")
	private double total;
	
	@OneToMany(targetEntity = Items.class, cascade = CascadeType.ALL)
	private Set <Items> items = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}
	
	
	
	
}
