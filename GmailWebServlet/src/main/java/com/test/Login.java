package com.test;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out  = response.getWriter();
		
		String name = request.getParameter("user");
		String pass = request.getParameter("pwd");

		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mphintern";
		String username = "root";
		String password = "root@39";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url ,username ,password);
			
			String sql = "select mla_user, mla_pas from user_mla where mla_user = ? and mla_pass = ?";
					
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, name);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
			
			if(rs.getString(1).equals(name))
			{
				RequestDispatcher rd = request.getRequestDispatcher("HomePage.html");
				
				rd.forward(request, response);
			}
			break;
			}
			
			if(true)
			{
				out.println("<center> <h3><font color = 'red'> Login failed.</font></h3></center>");
				
				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				
				rd.include(request, response);
			}
			
			
		    }
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
	}     
	

}
