<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- scriplet tag -->
        
        <%
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager
        		.getConnection("jdbc:mysql://localhost:3306/mph","root", "root@39");
        
        String sql = "insert into user_mla(mla_fname, mla_user, mla_pass ) values(?, ?, ?);";
        
        PreparedStatement pst = con.prepareStatement(sql);
        
        String fname = request.getParameter("fname");
        String uname = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        pst.setString(1, fname); 
        pst.setString(2, uname); 
        pst.setString(3, pass); 
        
        pst.execute();
        
        out.println("Store User Data..");
        
        %>
</body>
</html>