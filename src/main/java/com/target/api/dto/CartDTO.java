package com.target.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L; 
	
	private double totalPrice;
	private double discount;
	private double finalValue;
	private double quantidade;
	
	private List<ProductDTO> products = new ArrayList<>();
	
	
	

}
