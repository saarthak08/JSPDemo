<%--
  Created by IntelliJ IDEA.
  User: saarthak08
  Date: 2019-06-09
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declaration-Test</title>
</head>
<body>

    <!-- All the declaration code goes to the declartion part of the servlet created of the jsp page.-->
<%! String toLowerCase(String data)
{
    return data.toLowerCase();
}
%>
<h3>Declarations in JSP</h3>
'Helloooooo I am Declarations in JSP...' in lower case : <%=toLowerCase("Helloooooo I am Declarations in JSP...")%>

</body>
</html>
