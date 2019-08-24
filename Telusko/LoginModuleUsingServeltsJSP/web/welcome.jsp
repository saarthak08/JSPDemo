<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-08-23
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <%
        if(session.getAttribute("uname")==null){
            response.sendRedirect("login.jsp");
        }
    %>
    <h2>Welcome</h2>
    <hr>
        Hey! <%=session.getAttribute("uname")%> Welcome to the Login Module
    <br>
    <br>
    <a href="videos.jsp">Go to Videos!</a>
    <br>
    <br>
    <a href="about-us.jsp">About us</a>
    <br>
    <br>
    <br>
    <br>
    <form action="Logout" method="get">
        <input type="submit" value="Log Out">
    </form>
</body>
</html>
