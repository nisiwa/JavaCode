<%@ page import="com.cskaoyan.entity.User" %>
<%@ page import="com.cskaoyan.entity.Address" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    user.setName("zhangsan");
    user.setPassword("1234");
    Address address = new Address();
    address.setCity("beijing");
    address.setDistinct("dongcheng");
    address.setStreet("no 1 street");
    user.setAddress(address);
    ArrayList<String> list = new ArrayList<>();
    list.add("1");
    list.add("2");
    user.setList(list);
    Map<String,String> map = new HashMap<>();
    map.put("name","zhangsan");
    map.put("age","24");
    pageContext.setAttribute("map",map);
    pageContext.setAttribute("user1",user);

%>

  查找user：  ${user1}
<%
    User user1 =(User) pageContext.getAttribute("user1");
    String city = user1.getAddress1().getCity();
    System.out.println(city);
%>
<%=((User) pageContext.getAttribute("user1")).getAddress1().getCity() %>
${user1.address1.city} EL表达式相较于JSP表达式，它的优点
${user1.list[0]}
查找map:${map.name}

</body>
</html>
