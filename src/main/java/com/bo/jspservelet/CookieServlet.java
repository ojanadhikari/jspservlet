package com.bo.jspservelet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Ozads
 * @version v1.0
 * @project jspservelet
 * @since 2024-08-09
 **/
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("myCookie", "cookieValue");
        cookie.setMaxAge(86400);
        resp.addCookie(cookie);
        resp.getWriter().println("Cookie created successfully");
    }
}
