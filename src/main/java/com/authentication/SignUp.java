package com.authentication;

import com.serialization.Data;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SignUp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/HTML/SignUp.jsp");
            rd.forward(req, resp);
        } catch (Exception e) {
            PrintWriter out = resp.getWriter();
            out.println("Something Went wrong in forwarding request To Signup");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        String emailId = req.getParameter("Email-Id");
        if (!(new Login().isUserNameValid(new File("C:\\Users\\User.FULL479-WIN.003\\Downloads\\Database\\"+userName + "Data.txt"), userName))) {
            new Data().intoTextFile(userName, password, emailId);
            HttpSession createSession = req.getSession();
            createSession.setAttribute("username", userName);
            resp.sendRedirect("DashBoard");
        }
        else {
            PrintWriter out = resp.getWriter();
            out.print("UserName is Already Picked By Some One");
        }
    }
}
