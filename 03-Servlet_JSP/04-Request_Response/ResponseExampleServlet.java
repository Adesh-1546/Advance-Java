package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class ResponseExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = (String) request.getAttribute("user");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h2>Hello, " + name + "!</h2>");
    }
}
