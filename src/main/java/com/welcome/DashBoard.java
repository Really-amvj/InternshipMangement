package com.welcome;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class DashBoard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session!= null && session.getAttribute("username")!=null){
            /*PrintWriter out= resp.getWriter();
            out.println("Hi");*/
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/JSP/DashBoard.jsp");
            rd.forward(req,resp);
        }
        else {
            resp.sendRedirect("/");
        }
    }

}

