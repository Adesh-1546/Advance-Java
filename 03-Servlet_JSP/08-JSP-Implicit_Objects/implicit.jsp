<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Implicit Objects</title>
</head>
<body>

<h2>JSP Implicit Objects Example</h2>

<%
    //  request object (get parameter)
    String name = request.getParameter("username");

    if (name == null) {
        name = "Guest";
    }

    //  session object (store data)
    session.setAttribute("user", name);

    //  application object (global context)
    application.setAttribute("appName", "MediConnect");
%>

<p>Request Name: <%= name %></p>

<p>Session User: <%= session.getAttribute("user") %></p>

<p>Application Name: <%= application.getAttribute("appName") %></p>

<p>Server Info: <%= application.getServerInfo() %></p>

<%
    //  out object
    out.println("<p>This is printed using out object</p>");
%>

</body>
</html>
