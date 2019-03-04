package com.serviceproduct.app.service;

import java.util.List;

import com.serviceproduct.app.entity.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public Product getProduct(Long id);

}
