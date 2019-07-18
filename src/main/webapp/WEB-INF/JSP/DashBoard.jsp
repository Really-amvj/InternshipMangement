    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    	pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="ISO-8859-1">
        <title>DashBoard</title>
        <%
        String name = session.getAttribute("username");
        if(name==null)
           response.sendRedirect("/");
        %>
    </head>
    <body>
    <h1 align="center"><font size="4"> Welcome to Full Creative</font>
    <link href="dashboard.css" rel="stylesheet">
    <div class="container">
        <div class="row">
            <div class="col-md-offset-2 col-md-8 col-lg-offset-3 col-lg-6">
                <div class="well profile">
                    <div class="col-sm-12">
                        <div class="col-xs-12 col-sm-8">
                            <h2>
                            <%
                            out.println("Hi "+session.getAttribute("usrname").toString());
                            %>
                            </h2>
                            <p><strong>About: </strong> Java Developer </p>
                            <p><strong>Hobbies: </strong> Read, out with friends, listen to music, draw and learn new
                                things. </p>
                            <p><strong>Skills: </strong>
                                <span class="tags">html5</span>
                                <span class="tags">css3</span>
                                <span class="tags">jquery</span>
                                <span class="tags">bootstrap3</span>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <form class="box" action="https://my.yocoboard.com/hours">
        <input type="submit" value="Yocoboard">
    </form>

    <form class="box" action="https://typingtest.com">
        <input type="submit" value="Typing">
    </form>
    <form class="box" action="https://snacks.setmore.com/bookappointment">
        <input type="submit" value="Snacks">
    </form>
    <form class="box" action="Logout" method="post">
    	<input type="submit" value="logout">
    </form>
    </body>
    </html>