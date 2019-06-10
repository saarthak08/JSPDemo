<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-06-10
  Time: 09:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Response</title>
</head>
<body>
The student is confirmed: ${param.firstName} ${param.lastName}
<br>
The student's country: ${param.country}
<br>
The student's favourite programming language: ${param.favouriteLanguage}
<br>
The student's favourite food: <%String[] langs=request.getParameterValues("favouriteFood");
                                if(langs!=null)
                                {
                                for(String s:langs)
                                {
                                    out.println("<li>"+s+"</li>");
                                }}
                                %>
</body>
</html>
