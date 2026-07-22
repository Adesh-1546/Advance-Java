<%@ page contentType="text/html; charset=UTF-8" %>

<h3>This is included JSP</h3>

<%
    String name = request.getParameter("name");
    if (name != null) {
%>
    <p>Hello, <%= name %></p>
<%
    }
%>
