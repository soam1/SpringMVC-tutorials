<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
    <%@ page import ="java.util.ArrayList"%>
    <%
        String name = (String) request.getAttribute("name");
        Integer rollno = (Integer) request.getAttribute("roll");
    %>
    <h1>Welcome to the Help Page!</h1>
    <p>This is the help page of our website.</p>
    <p> The name is: <%= name %></p>
    <p> The roll is: <%= rollno %></p>
</body>
</html>