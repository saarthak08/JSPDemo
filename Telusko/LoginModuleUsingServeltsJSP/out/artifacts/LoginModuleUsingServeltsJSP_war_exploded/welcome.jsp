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
        Welcome! <%=session.getAttribute("uname")%>
</body>
</html>
