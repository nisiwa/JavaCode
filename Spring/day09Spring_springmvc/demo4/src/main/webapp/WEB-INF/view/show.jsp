<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/22
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

${user.id}|${user.username}|${user.password}|${user.age}<br><hr>
${queryvo.param1}|${queryvo.param2}|${queryvo.param3}|${queryvo.age}|${queryvo.user.id}|${queryvo.user.username}|${queryvo.user.password}
</body>
</html>