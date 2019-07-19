    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    	pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="ISO-8859-1">
        <title>DashBoard</title>
        <link rel="stylesheet" href="CSS/WelcomeStyle.css">
        <link rel="stylesheet" href="CSS/dashboard.css">
    </head>
    <body>
    <h1 align="center"><font size="4"> Welcome to Full Creative</font>

    <div class="container">
        <div class="row">
            <div class="col-md-offset-2 col-md-8 col-lg-offset-3 col-lg-6">
                <div class="well profile">
                    <div class="col-sm-12">
                        <div class="col-xs-12 col-sm-8">
                            <h2>
                            <%
                            out.println("Hi "+session.getAttribute("username").toString());
                            %>
                            </h2>
                            <p><strong>About: </strong> Java Developer </p>
                            <p><strong>Hobbies: </strong> Read, out with friends, listen to music, draw and learn new
                                things. </p>
                            <p><strong>Skills: </strong>
                                <span class="tags">java</span>
                                <span class="tags">css</span>
                                <span class="tags">Html</span>
                                <span class="tags">Javascript</span>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <a href="https://my.yocoboard.com/" class= "button">YocoBoard</a>

    <a href="https://typingtest.com" class= "button">Typing</a>

    <a href="https://snacks.setmore.com/bookappointment" class= "button">Snacks</a>

    <a href="Logout" class= "button">Logout</a>

    </body>
    </html>