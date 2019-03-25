<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/25
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>数据提交 </h1><br>
    <form action="${pageContext.request.contextPath}/requiredParam" enctype="multipart/form-data" method="post">

        id:<input type="text" name="id"><br>
        username:<input type="text" name="username"><br>
        password:<input type="text" name="password"><br>
        <input type="submit">

    </form><br>
    <h1>数据提交2 </h1><br>
    <form action="${pageContext.request.contextPath}/requiredParam/123456" enctype="multipart/form-data" method="post">

        id:<input type="text" name="id"><br>
        username:<input type="text" name="username"><br>
        <%--password:<input type="text" name="password"><br>--%>
        <input type="submit">

    </form><br>


</body>
</html>
