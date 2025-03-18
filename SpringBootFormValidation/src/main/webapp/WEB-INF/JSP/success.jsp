<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
           <h1>user data sumbitted with validations</h1>
           
           FirstName : ${user.firstName}<br><br>
           LastName : ${user.lastName}<br><br>
           Gender : ${user.gender}<br><br>
           
           Food:
           <ul>
           <c:forEach var = "food" items ="${user.food}">
                <li>${food}</li>
           </c:forEach>
           </ul><br><br>
           Leaving From : ${user.cityFrom}<br><br>
           Going To : ${user.cityTo}<br><br>
           Journey Date : ${user.jDate}<br><br>
           Email : ${user.email}<br><br>
           
           Seat No:
           <ul>
           <c:forEach var = "seat" items ="${user.seat}">
                <li>${seat}</li>
           </c:forEach>
           </ul><br><br>
           
           <a href="userfrom">Click here to register</a>
           >
</body>
</html>