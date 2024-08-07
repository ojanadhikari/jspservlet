package com.bo.jspservelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Ozads
 * @version v1.0
 * @project jspservelet
 * @since 2024-07-29
 **/

public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get the form data from the request
        String username = request.getParameter("username");
        String email = request.getParameter("email");

        // Process the data (e.g., save to a database, call a service, etc.)

        // Send response
        out.println("<html><body>");
        out.println("<h1>Form Submitted Successfully</h1>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
    }
}
