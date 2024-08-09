package com.bo.jspservelet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReadCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Get all cookies from the request
        Cookie[] cookies = request.getCookies();

        // Check if cookies exist
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                // Get the cookie name and value
                String name = cookie.getName();
                String value = cookie.getValue();

                // Write the cookie information to the response
                response.getWriter().println("Cookie Name: " + name + ", Value: " + value);
            }
        } else {
            response.getWriter().println("No cookies found");
        }
    }
}
