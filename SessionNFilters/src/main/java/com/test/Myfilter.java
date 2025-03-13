package com.test;

import jakarta.servlet.Filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;


@WebFilter("/Myfilter")
public class Myfilter extends HttpFilter implements Filter {
       
   
    
	public void destroy() {
		
		System.out.println("destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("before servlent execute");
		
		chain.doFilter(request, response);
		
		System.out.println("after servlet execute");
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
		

		
	}

}
