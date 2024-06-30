
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
    <h1>Form Submission Successful!</h1>
    <h2> Getting using EL</h2>
    <h3> ${Header}</h3>
    <p>Your form has been successfully submitted.</p>
    <p>Full Name: ${user.name}</p>
    <p>Email: ${user.email}</p>
    <p>Password: ${user.password}</p>
    <p> try to secure your password bruh</p>
</body>
</html>