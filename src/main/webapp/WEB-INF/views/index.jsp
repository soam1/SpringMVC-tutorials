<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic JSP Page</title>
</head>
<body>
    <h1>Welcome to the Basic JSP Page!(HOME page)</h1>
    <H2>we came here from the controller</H2>
    <p>This is a simple JSP page.</p>
    <!-- <% %> these are script tags in jsp, also called jsp scriptlets, used to include java statements and expressions in jsp -->
    <%@ page import ="java.util.ArrayList"%>
    <%@ page import ="java.util.List"%>
    <%
    String name = (String) request.getAttribute("name");
    List<String> friends = (List<String>) request.getAttribute("f");
    %>
    <p> My name is <%=name%></p>

    <h3>My friends are:</h3>
    <ul>
        <% for(String f: friends) { %>
        <li><%=f%></li>
        <% } %>
</body>
</html>