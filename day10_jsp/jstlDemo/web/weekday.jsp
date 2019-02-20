<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/20
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="weekday" value="4" scope="page"></c:set>
<%--<c:choose>
    <c:when test="${weekday == 1}">
        星期一
    </c:when>
    <c:when test="${weekday == 2}">
        星期二
    </c:when>
    <c:when test="${weekday == 3}">
        星期三
    </c:when>
    <c:when test="${weekday == 4}">
        星期四
    </c:when>
</c:choose>--%>

<c:forEach var="i" begin="0" end="20" step="1" varStatus="s" >
  ${s.index}....  ${i}<br>
</c:forEach>
</body>
</html>
