<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name","pageContext");
    request.setAttribute("name","request");
    session.setAttribute("name","session");
    application.setAttribute("name","application");
    request.setAttribute("number",5);
    request.setAttribute("text","2");
%>
${name} 从低范围到高范围，依次查找，找到则结束
${pageScope.name} 制定特定的范围
${requestScope.name}
${sessionScope.name}
${applicationScope.name}

${number gt 6}
${empty text}
${number > 6? 0:1}
</body>
</html>
