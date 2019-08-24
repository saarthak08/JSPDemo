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
    <title>Videos</title>
</head>
<body>
<%
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
    if(session.getAttribute("uname")==null){
        response.sendRedirect("login.jsp");
    }
%>

<h2>Videos</h2>
<hr>
<p>Hey <%=session.getAttribute("uname")%>! Here are your videos.</p>
<br>
<iframe width="560" height="315" src="https://www.youtube.com/embed/S-ezhTXPVGU" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
<br>
<br>
<br>
<br>
<br>
<a href="about-us.jsp">About us</a>
<br>
<br>
<br>
<form action="Logout" method="get">
    <input type="submit" value="Log Out">
</form>

</body>
</html>
