<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-08-21
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*,com.sg.jsp.Student" %>
<html>
<head>
    <title>ForEach Student Test</title>
</head>
<body>
<%
    List<Student> students=new ArrayList<>();

    students.add(new Student("Saarthak","Gupta",true));
    students.add(new Student("John","Doe",true));
    students.add(new Student("Taral","Gupta",false));
    students.add(new Student("Bertram","Gilfoyle",true));

    pageContext.setAttribute("myStudents",students);
%>

<table border="1">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Gold Customer</th>
    </tr>

<c:forEach var="tempStudent" items="${myStudents}">

    <tr>
        <td>${tempStudent.firstName}</td>
        <td>${tempStudent.secondName}</td>
        <td>${tempStudent.goldCustomer}</td>
    </tr>

</c:forEach>

</table>





</body>
</html>
