<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-08-22
  Time: 08:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>i8n-messages-test</title>
</head>
<body>

<c:set var="theLocale"
value="${not empty param.theLocale?param.theLocale:pageContext.request.locale}"
scope="session"/>

<fmt:setLocale value="${theLocale}"/>
<fmt:setBundle basename="com.sg.jsp.i8n.resources.myLabel"/>

<a href="i18n-messages-test.jsp?theLocale=en_US">English (US)</a>
|
<a href="i18n-messages-test.jsp?theLocale=es_ES">Spanish (ES)</a>
|
<a href="i18n-messages-test.jsp?theLocale=de_DE">German (DE)</a>
|
<br>
<hr>


    <fmt:message key="label.greeting"/><br><br>
    <fmt:message key="label.firsName"/> <i>John</i> <br><br>
    <fmt:message key="label.secondName"/><i>Doe</i><br><br>
    <fmt:message key="label.greetingMessage"/> <br>

<hr>
Selected Locale: ${theLocale}
</body>
</html>
