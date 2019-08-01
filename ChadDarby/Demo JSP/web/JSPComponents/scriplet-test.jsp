<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- This is the directive part of the JSP which includes the Import statements of the Servlet code to which the
JSP page is ultimately converted.-->


<html>
<head>
    <title>Scriplet-Test</title>
</head>
<body>

        <!-- All the JSP code is ultimately converted to Servlet & the Scriplet code goes to the service method in the
          Servlet created & the name of the servlet is the JSP name + "jsp"-->
<h3>Hello I am Scriplet</h3>
<%
    for(int i=1;i<=5;i++)
    {
        out.println("<br> I love to code..."+i);
    }
%>
</body>
</html>