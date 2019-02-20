<%@ page import="java.awt.print.Pageable" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    if(int i ==1){
//        //pageContext.setAttribute
//    }else if( == 2){
        //request
   // pageContext.getRequest().setAttribute();
    pageContext.setAttribute("name","pageContext", PageContext.PAGE_SCOPE);
    pageContext.setAttribute("name","request",PageContext.REQUEST_SCOPE);
    pageContext.setAttribute("name","session",PageContext.SESSION_SCOPE);
    pageContext.setAttribute("name","application",PageContext.APPLICATION_SCOPE);
//    pageContext.setAttribute("name","pageContext");
//    pageContext.setAttribute("name","request");
//    pageContext.setAttribute("name","session");
//    pageContext.setAttribute("name","application");
%>
<%
    String name =(String) pageContext.findAttribute("name");
    System.out.println(name);
    pageContext.removeAttribute("name",PageContext.PAGE_SCOPE);
    String name1 =(String) pageContext.findAttribute("name");
    System.out.println(name1);
    pageContext.removeAttribute("name",PageContext.REQUEST_SCOPE);
    String name2 =(String) pageContext.findAttribute("name"); //从最小作用域开始，依次向上查找，找到为止，找不到就是null
    System.out.println(name2);
    pageContext.removeAttribute("name",PageContext.SESSION_SCOPE);
    String name3 =(String) pageContext.findAttribute("name");
    System.out.println(name3);
    pageContext.removeAttribute("name",PageContext.APPLICATION_SCOPE);
    String name4 =(String) pageContext.findAttribute("name");
    System.out.println(name4);
%>
<%
//    String pageContextName =(String) pageContext.getAttribute("name");
//    String requestName =(String) request.getAttribute("name");
//    String sessionName =(String) session.getAttribute("name");
//    String applicationName =(String) application.getAttribute("name");
//    System.out.println(pageContextName);
//    System.out.println(requestName);
//    System.out.println(sessionName);
//    System.out.println(applicationName);
%>

</body>
</html>
