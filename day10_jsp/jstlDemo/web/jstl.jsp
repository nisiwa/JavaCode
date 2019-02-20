<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/20
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute("age",17);
%>
<body>
<c:if test="${age >= 18 }" var="test1" scope="page">
    成年人
</c:if>
<c:if test="${age < 18 }">
    未成年人
</c:if>
${pageScope.test1}

<c:choose>
    <c:when test="${age > 18}">
        成年人
    </c:when>
    <c:otherwise>
        未成年人
    </c:otherwise>
</c:choose>
</body>
</html>
