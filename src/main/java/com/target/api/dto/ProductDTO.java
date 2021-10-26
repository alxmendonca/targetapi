package com.target.api.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.target.api.entities.Category;
import com.target.api.entities.Product;

public class ProductDTO {
	
	private Long id;
	private String name;
	private double price;
	private double quantidade;
	
	private List<CategoryDTO> categories = new ArrayList<>();
	
	public ProductDTO() {
		
	}

	public ProductDTO(Long id, String name, double price, double quantidade) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantidade = quantidade;
	}
public ProductDTO(Product entity) {
		
		this.id = entity.getId();
		this.name = entity.getName();
		this.price = entity.getPrice();
		this.quantidade = entity.getQuantidade();
	

}
	public ProductDTO(Product entity, Set<Category>categories) {
		this(entity);
		categories.forEach(cat -> this.categories.add(new CategoryDTO(cat)));
		
		
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

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}

}
