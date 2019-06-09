<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Scriplet-Test</title>
</head>
<body>
<h3>Hello I am Scriplet</h3>
<%
    for(int i=1;i<=5;i++)
    {
        out.println("<br> I love to code..."+i);
    }
%>
</body>
</html>