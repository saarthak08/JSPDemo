<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-06-10
  Time: 08:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Builtin-Test</title>
</head>
    <!-- These are the built-in tags created in JSP-->
<body>
Request User Agents:<%=request.getHeader("User-Agent")%>
<br>
Request Language: <%=request.getLocale()%> <br>
Request Cookies: <%=request.getCookies()%> <br>
Request URL: <%=request.getRequestURI()%> <br>
</body>
</html>
