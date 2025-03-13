package Ad_java;

import jakarta.servlet.ServletException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		PrintWriter out  = response.getWriter();
		
		String name = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		if(name.equals("admin") && pass.equals("a123"))
		{
			out.println("login Success");
		}
		else
		{
			out.println("login Failed");
		}
		
	}

}
