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
import java.sql.SQLException;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fname");
		String uname = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		String url = "jdbc:mysql://localhost:3306/mphintern";
		String username = "root";
		String password = "root@39";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url ,username ,password);
			
			String sql = "insert into user_mla(mla_fname, mls_user, mla_pas)values(?, ?, ?)";
					
			PreparedStatement pst = con.prepareStatement(sql);
			User obj = new User();
			pst.setString(1, obj.getFullName());
			pst.setString(2, obj.getUserName());
			pst.setString(3, obj.getPassword());
			
			int x = pst.executeUpdate();
			
			if(x > 0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("HomePage.html");
				
				rd.forward(request, response);
			}
			else
			{
				out.println("<center> <h3><font color = 'red'> Registration failed.</font></h3></center>");
				
				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				
				rd.include(request, response);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
