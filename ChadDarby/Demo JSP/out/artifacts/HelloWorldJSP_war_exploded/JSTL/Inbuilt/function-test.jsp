<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-08-22
  Time: 00:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Inbuilt JST Function Testing</title>
</head>
<body>
    <c:set var="myString" value="Hello! I am the best"/>

Length of the String ${myString}: ${fn:length(myString)}

<br><br>

String in Uppercase: ${myString}: ${fn:toUpperCase(myString)}

<br><br>

<c:set var="cities" value="Singapore,Mumbai,Tokyo,London"/>

Original String : ${cities}

    <br><br>
<c:set var="arrayCities" value="${fn:split(cities,',')}"/>

<c:set var="citiesChanged" value="${fn:join(arrayCities, '*')}"/>

Changed String: ${citiesChanged}
<br>

</body>
</html>
