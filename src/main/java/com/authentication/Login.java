package com.authentication;

import com.serialization.UserData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("loginusername");
        String password = req.getParameter("loginpassword");

        if(isUserNameValid(new File(userName+"Data.txt"),userName) && isPasswordValid(new File(userName+"Data.txt"),password)){
            HttpSession createSession = req.getSession();
            createSession.setAttribute("username", userName);
            resp.sendRedirect("DashBoard");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        try {
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/HTML/Login.jsp");
            rd.forward(req, resp);
        }catch (Exception e){
            PrintWriter out = resp.getWriter();
            out.println("Unable to Fetch Login Portal INfo");
        }
    }

    public boolean isUserNameValid(File file, String loginUserName) throws IOException{
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            UserData userData = (UserData) objectInputStream.readObject();
            String userName = (String) userData.getUserName();
            if(loginUserName.equals(userName))
                return true;

        }catch (Exception e){
            return false;
        }
        return false;
    }
    public boolean isPasswordValid(File file,String loginEmailID){
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            UserData userData = (UserData) objectInputStream.readObject();
            String password = (String) userData.getPassword();
            if(loginEmailID.equals(password))
                return true;

        }catch (Exception e){
            System.out.println("Something Wrong in Retrieving Data");
            return false;
        }
        return false;
    }
}
