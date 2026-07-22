package Servlet;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SendRedirectExample extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        //  Redirect (new request)
        response.sendRedirect("result.jsp?user=" + name);
    }
}
