<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="i" begin="1" end="10">
	
	For loop <c:out value="${i}"></c:out><p>
	
	</c:forEach>
	
	<c:forTokens items="Rahul.Nakul.Rajesh.java" delims="." var="name">
	  
   <c:out value="${name}"/><p>  
</c:forTokens>  

<c:url value="/index1.jsp" var="fullname">  
 <c:param name="first" value="java"/>  
 <c:param name="last" value=" 1.8"/>  
 </c:url>
 
${fullname}  


	
</body>
</html>