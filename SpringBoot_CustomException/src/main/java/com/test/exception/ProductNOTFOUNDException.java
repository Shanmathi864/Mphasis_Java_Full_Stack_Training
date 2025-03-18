package com.test.exception;

public class ProductNOTFOUNDException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ProductNOTFOUNDException(String msg) { 
		super(msg);
	}
}
