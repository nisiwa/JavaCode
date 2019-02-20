<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/19
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" errorPage="error.jsp" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        alert(new Date())
    </script>
</head>
<body>
<h1>1.jsp</h1>
当前时间为：<%= new Date() %> 表达式里面不可以写注释
JSP脚本片段： <!-- html注释-->  <%--ctrl + shift + / jsp注释，翻译过程不予理会--%>
<%
    //可以写注释，java代码注释,普通java代码注释，同样不会发回客户端
    /*java注释*/
    System.out.println("hello, jsp");
%>
<%
 for(int i = 0;i<10;i++){
     System.out.println("hello");
%>
<h3>for循环</h3>
<%
    }
%>
<%!
 private String name = "zhangsan";
%>
<%!
    public void jspInit() {
        System.out.println("jsp init");
    }

    public void jspDestroy() {
        System.out.println("jsp destroy");
    }
%>
<%
int i = 1/0;
%>
</body>
</html>
