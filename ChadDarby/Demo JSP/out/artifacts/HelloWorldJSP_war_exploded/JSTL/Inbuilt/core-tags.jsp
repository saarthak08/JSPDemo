<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-08-20
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Core JSTL Tags</title>
</head>
<body>
<c:set var="stuff" value="<%=new java.util.Date()%>"/>

Time on the server is ${stuff}

<br>
<%

    String[] cities={"Mumbai","New York", "New Delhi"};
    pageContext.setAttribute("cities",cities);
%>

<c:forEach var="tempCity" items="${cities}">
    ${tempCity}
    <br>
</c:forEach>

</body>
</html>
