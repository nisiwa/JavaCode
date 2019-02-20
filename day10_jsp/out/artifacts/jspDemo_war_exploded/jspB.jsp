<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp B</title>
</head>
<body>
jsp B
<%
    String name = request.getParameter("name");
    response.getWriter().println(name);
%>
</body>
</html>
