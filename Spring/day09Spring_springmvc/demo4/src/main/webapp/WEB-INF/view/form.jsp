<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/25
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Request </h1><br>
    <form action="${pageContext.request.contextPath}/parameter/hello" method="post">
        id:<input type="text" name="id"><br>
        username:<input type="text" name="username"><br>
        password:<input type="text" name="password"><br>
        <input type="submit">

    </form><br>
    <h1>基本数据类型 </h1><br>
    <form action="${pageContext.request.contextPath}/parameter/baseType" method="get">
        id:<input type="text" name="id"><br>
        username:<input type="text" name="username"><br>
        password:<input type="text" name="password"><br>
        age:<input type="text" name="age"><br>
        <input type="submit">

    </form><br>
    <h1>javabean类型 </h1><br>
    <form action="${pageContext.request.contextPath}/parameter/javabean" method="post">
        id:<input type="text" name="param1"><br>
        id:<input type="text" name="param2"><br>
        id:<input type="text" name="param3"><br>

        age:<input type="text" name="age"><br>
        <input type="submit">
    </form><br>
    <h1>嵌套javabean类型 </h1><br>
    <form action="${pageContext.request.contextPath}/parameter/javabean" method="post">
        id:<input type="text" name="param1"><br>
        id:<input type="text" name="param2"><br>
        id:<input type="text" name="param3"><br>
        age:<input type="text" name="age"><br>
        <%--多了一个user--%>
        id:<input type="text" name="user.id"><br>
        username:<input type="text" name="user.username"><br>
        password:<input type="text" name="user.password"><br>

        <input type="submit">
    </form><br>
    <h1>convertor </h1><br>
    <form action="${pageContext.request.contextPath}/parameter/convertor" method="post">
        id:<input type="text" name="id"><br>
        username:<input type="text" name="username"><br>
        password:<input type="text" name="password"><br>
        age:<input type="text" name="age"><br>
        birthday:<input type="text" name="birthday"><br>
        <input type="submit">

    </form><br>
    <h1>数组Array </h1><br>
    <form action="${pageContext.request.contextPath}/parameter/array" method="post">
        id1:<input type="text" name="ids"><br>
        id2:<input type="text" name="ids"><br>
        id3:<input type="text" name="ids"><br>

        <input type="submit">

    </form><br>
    <%--<h1>bean数组Array </h1><br>
    <form action="${pageContext.request.contextPath}/parameter/userArray" method="post">
        id1:<input type="text" name="id[0]"><br>
        username1:<input type="text" name="username[0]"><br>
        password1:<input type="text" name="password[0]"><br>
        id1:<input type="text" name="id[1]"><br>
        username1:<input type="text" name="username[1]"><br>
        password1:<input type="text" name="password[1]"><br>



        <input type="submit">

    </form><br>--%>
    <h1>List </h1><br>
    <form action="${pageContext.request.contextPath}/parameter/list" method="post">
        id1:<input type="text" name="userList[0].id"><br>
        username1:<input type="text" name="userList[0].username"><br>
        password1:<input type="text" name="userList[0].password"><br>

        id2:<input type="text" name="userList[1].id"><br>
        username2:<input type="text" name="userList[1].username"><br>
        password2:<input type="text" name="userList[1].password"><br>

        id3:<input type="text" name="userList[2].id"><br>
        username3:<input type="text" name="userList[2].username"><br>
        password3:<input type="text" name="userList[2].password"><br>

        <input type="submit">

    </form><br>
</body>
</html>
