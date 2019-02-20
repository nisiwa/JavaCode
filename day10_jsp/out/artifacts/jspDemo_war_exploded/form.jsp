<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/servlet1" method="get">
    <input type="text" value="${name}" name="name"><br>
    <input type="password" value="" name="password"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
