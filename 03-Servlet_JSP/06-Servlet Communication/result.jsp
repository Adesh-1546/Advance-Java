<%
    String user = request.getParameter("user");

    if (user == null) {
        user = (String) request.getAttribute("user");
    }
%>

<h2>Hello, <%= user %>!</h2>
