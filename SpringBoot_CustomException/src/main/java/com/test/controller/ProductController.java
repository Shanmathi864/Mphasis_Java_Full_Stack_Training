package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Product;
import com.test.service.ProductService;




@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	public void setService(ProductService service) {
		this.service = service;
	}
	
	
	

	@PostMapping("/create")
	public ResponseEntity<Product> createProduct(@RequestBody Product p) {
		Product prObj = service.createProd(p);
		
		return new ResponseEntity<>(prObj,HttpStatus.OK);
	}
	
	@GetMapping("/readAll")
	public ResponseEntity<List<Product>> readAll() {
		List<Product> prObj = service.readAll();
		
		return new ResponseEntity<>(prObj,HttpStatus.OK);
	}
	
	@PutMapping("update/{id}")
	public  ResponseEntity<List<Product>> Update(@PathVariable("id") int id, @RequestBody Product p) {
		
		p.setId(id);
		List<Product> prObj = service.update(p);
		
		return new ResponseEntity<>(prObj,HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<List<Product>> delete(@PathVariable("id") int id){
		
List<Product> prObj = service.deleteProd(id);
		
		return new ResponseEntity<>(prObj,HttpStatus.OK);
	}
	
}
