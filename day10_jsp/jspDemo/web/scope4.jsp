<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    System.out.println((String)pageContext.getAttribute("text"));
    System.out.println((String)request.getAttribute("text")); //重定向之后request获取不到
    System.out.println((String)session.getAttribute("text"));
    System.out.println((String)application.getAttribute("text"));

%>
</body>
</html>
