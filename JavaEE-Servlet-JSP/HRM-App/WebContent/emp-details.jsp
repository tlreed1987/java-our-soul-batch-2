<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.example.pojos.Employee"%>  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h1 align="center"> <u>Employee Details [ #${empid} ]</u> </h1>
	
	<c:if test="${emp}==null "> 
		<p>Employee with Id <b>${empid}</b> doesnt exist </p>	
	</c:if>
		<p><b>Employee Id : </b> ${emp.id} </p>
		<p><b>Name        : </b> ${emp.name} </p>
		<p><b>Salary      : </b> ${emp.salary} </p>
		<p><b>Dept Id      : </b>${emp.deptId} </p>

	<!--  //comment  -->
	
	<%
	     
		//	out.println("<p><b> Employee with Id "+ empid+" doesnt exist");
		
	%>
	
	
</body>
</html>