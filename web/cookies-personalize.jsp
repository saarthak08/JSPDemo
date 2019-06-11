<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-06-11
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personalized</title>
</head>
<body>
    <%
        String favLang=request.getParameter("favouriteLanguage");
        Cookie cookie=new Cookie("favouriteLanguageCookie",favLang);
        cookie.setMaxAge(60*60*24*365);
        response.addCookie(cookie);
    %>
    Thanks! we set your Favourite Language: <%=request.getParameter("favouriteLanguage")%>
    <br>
    <a href="cookies-homepage.jsp">Go to Homepage</a>

</body>
</html>
