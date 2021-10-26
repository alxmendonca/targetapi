package com.target.api.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="TB_PRODUCT")
public class Product implements Serializable{
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;
	private double quantidade;
	
	
	
	
	
	
	
	@ManyToMany
	@JoinTable(
	name= "tb_product_category",
	joinColumns = @JoinColumn(name= "product_id"),
	inverseJoinColumns = @JoinColumn(name = "category_id"))
	
	
	Set<Category>categories = new HashSet<>();
	
	
	public  Product() {
		
		
		
	}


	public Product(Long id, String name, double price, double quantidade) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantidade = quantidade;
	}


	public double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Set<Category> getCategories() {
		return categories;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}


	
	
	
	
	

}


	
	