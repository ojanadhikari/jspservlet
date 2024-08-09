package com.bo.jspservelet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Ozads
 * @version v1.0
 * @project jspservelet
 * @since 2024-08-09
 **/
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        session.setAttribute("sessionKey","sessionValue");
        session.setAttribute("newSessionKey","newSessionValue");
       // session.setMaxInactiveInterval(10*60); //10 mins

        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("Session created");

    }
}
