package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ProductDao;
import com.test.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao dao;
	
	
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	public Product createProd(Product p) {
		
		
		
		return dao.createProd(p);
	}
	
	public List<Product> readAll(){
		
		return dao.readAllProd();
	}
	
	public List<Product> update(Product p){
		dao.updateProd(p);
		
		return dao.readAllProd();
	}
	
	public List<Product> deleteProd(int id){
		
		dao.deleteProd(id);
		return dao.readAllProd();
	}
	
}
