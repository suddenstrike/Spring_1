<%-- 
    Document   : nameView
    Created on : 2017.06.08., 14:26:07
    Author     : Loczka_Andras
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Name</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <spring:nestedPath path="name">
	    <form action="" method="post">
		Name:
		<spring:bind path="value">
		    <input type="text" name="${status.expression}" value="${status.value}">
		</spring:bind>
		<input type="submit" value="OK">
	    </form>
	</spring:nestedPath>
    </body>
</html>
