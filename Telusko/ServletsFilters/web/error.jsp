<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-08-02
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
    isErrorPage="true" isELIgnored="false" %>
<html>
<head>
    <title>Error</title>

</head>
<h1>Error</h1>
<br>
<body>
<%=
    exception.getMessage()
%>
</body>
</html>
