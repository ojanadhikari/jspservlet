package com.bo.jspservelet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Ozads
 * @version v1.0
 * @project jspservelet
 * @since 2024-07-29
 **/
public class CustomServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String  name = "bca";
//        req.setAttribute("name", name);
//        req.getRequestDispatcher("/form.jsp").forward(req, resp);
        req.getRequestDispatcher("/myhhh.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
