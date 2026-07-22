<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Basics</title>
</head>
<body>

<h2>JSP Example</h2>

<%
    String name = "Adesh";
    int age = 20;
%>

<p>Name: <%= name %></p>
<p>Age: <%= age %></p>

</body>
</html>
