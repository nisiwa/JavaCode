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
    <h1>文件上传 </h1><br>
    <form action="${pageContext.request.contextPath}/fileUpload" enctype="multipart/form-data" method="post">

        文件上传:<input type="file" name="myfile"><br>
        <input type="submit">

    </form><br>
    <h1>文件上传2 </h1><br>
    <form action="${pageContext.request.contextPath}/filesUpload" enctype="multipart/form-data" method="post">

        文件上传:<input type="file"  name="myfiles" multiple ><br>
        <input type="submit">

    </form><br>

</body>
</html>
