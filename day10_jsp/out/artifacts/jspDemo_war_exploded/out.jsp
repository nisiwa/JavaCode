<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page buffer="none" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
 out.write("out输出内容");
    out.write("out输出内容2");
    out.write("out输出内容3");
    out.write("out输出内容4");

%>

<%
    response.getWriter().println("response输出内容");
%>
</body>
</html>
