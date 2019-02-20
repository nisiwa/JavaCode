<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("text","pageContext"); //作用域：当前页面
    request.setAttribute("text","request");
    session.setAttribute("text","session");
    application.setAttribute("text","application");
    //request.getRequestDispatcher("scope3.jsp").forward(request,response);
    response.sendRedirect("/jsp/scope4.jsp");
%>
</body>
</html>
