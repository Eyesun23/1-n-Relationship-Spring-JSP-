<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	
	<title>Dojos and Ninjas</title>
</head>
<style>
h1 {
text-align: center;
margin-top: 100px;
}

.container {
text-align: center;
margin-top: 80px;

}
</style>
<body>
	<h1>New Dojo</h1>
	<div class="container">
	<form:form method="POST" action="/dojos/new" modelAttribute="dojo">
	    <form:label path="name">Name: 
	    <form:errors path="name"/>
	    <form:input path="name"/></form:label>
	    
	    <br><br>
	    <input type="submit" value="Create"/>
	</form:form>
	</div>
</body>
</html>