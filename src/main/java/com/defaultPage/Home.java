package com.defaultPage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        //Handling Session
        try {
            if (session == null) {
                PrintWriter out = resp.getWriter();
                RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/Welcome.jsp");
                rd.forward(req,resp);
            } else
                resp.sendRedirect("DashBoard");
        } catch (Exception e) {
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/Welcome.jsp");
            rd.forward(req,resp);
        }
    }
}