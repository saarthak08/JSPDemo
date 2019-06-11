<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ToDoList</title>
</head>
<body>
<form action="session-tracking.jsp">
    <p>Add New Item <input type="text" name="todolistitem"> <input type="submit" ></p></form>
    <hr>
    <p>Item Entered: <%=request.getParameter("todolistitem")%></p>
    <%
        List<String> todolistitems=(List<String>)session.getAttribute("mytodolistitem");
        if(todolistitems==null)
        {
            todolistitems=new ArrayList<String>();
            session.setAttribute("mytodolistitem",todolistitems);
        }
        String myItem=request.getParameter("todolistitem");
        if(myItem!=null)
        {
            todolistitems.add(myItem);
        }
    %>
    <ol>
        <%
            for(String s: todolistitems)
            {
                out.println("<li>"+s+"</li>");
            }
        %>
    </ol>
</body>
</html>