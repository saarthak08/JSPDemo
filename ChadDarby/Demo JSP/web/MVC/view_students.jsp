<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-08-23
  Time: 08:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><html>
<head>
    <title>Students</title>
</head>
<body>
    <h2>Students List Demo</h2>
    <hr>
    <br>
    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
        </tr>

    <c:forEach var="tempStudent" items="${students_list}">
        <tr>
               <td>${tempStudent.getFirstName()}</td>
                <td>${tempStudent.getLastName()}</td>
                <td>${tempStudent.getEmail()}</td>
        </tr>

    </c:forEach>

    </table>

</body>
</html>
