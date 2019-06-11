<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-06-11
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookies-Homepage</title>
</head>
<body>
    <h3>Training Portal</h3>
    <%
        String favlang="Java";
        Cookie[] cookies=request.getCookies();
        if(cookies!=null) {
            for (Cookie c : cookies) {
                if ("favouriteLanguageCookie".equals(c.getName()))
                {
                    favlang=c.getValue();
                    break;
                }
            }
        }

    %>
    <h4>Latest News report for: <%=favlang%></h4>
    <ul>
        <li>Blah.. Blah..</li>
        <li>Blah.. Blah..</li>
    </ul>
    <p><a href="cookies-personalize-form.html">Return to form</a></p>
</body>
</html>
