<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.cskaoyan.entity.User.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/20
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<User> userList = new ArrayList<>();
    for(int i = 0;i< 10;i++){
        User user = new User();
        user.setName(UUID.randomUUID().toString());
        user.setPassword(UUID.randomUUID().toString());
        userList.add(user);
    }
    request.setAttribute("list",userList);
    Map<String,String> map = new HashMap<>();
    map.put("1","tom");
    map.put("2","jimmy");

    request.setAttribute("map1", map);
%>
<c:forEach var="user1" items="${list}" varStatus="userIndex">
   ${userIndex.index}.....  ${user1.name} ============== ${user1.password}<br>
</c:forEach>
<c:forEach var="student" items="${map1}" varStatus="mapIndex">
    ${mapIndex.count}..... ${student.key}  ${student.value}
</c:forEach>
</body>
</html>
