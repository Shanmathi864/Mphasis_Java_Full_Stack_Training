package com.test.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> 
{
	
	
}
