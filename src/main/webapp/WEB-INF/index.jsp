<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	
	<title>Dojo Page</title>
	<style>
		h1 {
		margin-top: 50px;
		text-align: center;
		
		}
		table {
		    border-collapse: collapse;
		    width: 80%;
		    margin-top: 50px;
		    margin-left: 120px;
		}
		
		td, th {
		    border: 2px solid black;
		    text-align: left;
		    padding: 8px;
		}
		
		
	</style>
</head>
<body>
	<h1><c:out value="${dojo.name}"/> Location Ninjas</h1>
	<c:if test="${!empty ninjas}">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<c:forEach items="${ninjas}" var="ninja">
			<tr>    
			    <td><c:out value="${ninja.firstName}"/></td>
			    <td><c:out value="${ninja.lastName}"/></td>
			    <td><c:out value="${ninja.age}"/></td>
			</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>