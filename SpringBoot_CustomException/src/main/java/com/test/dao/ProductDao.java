package com.test.dao;

import java.lang.annotation.Repeatable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.Product;
import com.test.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	private ProductRepository repository;
	

	public void setRepository(ProductRepository repository) {
		this.repository = repository;
	}

	public Product createProd(Product p) {
		
		return repository.save(p);
		
	}
	
	public List<Product> readAllProd() {
		
		return repository.findAll();
	}
	
	public String updateProd(Product p) {
		repository.save(p);
		
		return "Product updated successfully";
	}
	
	public String deleteProd(int id) {
		repository.deleteById(id);
		
		return "Product deleted successfully...";
	}
}
