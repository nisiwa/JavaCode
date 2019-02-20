<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
         contentType="text/html;charset=UTF-8"%>
<%@ include file="header.jsp" %>
<h1>您近期的订单如下：</h1>
<table border="1" width="88%" style="text-align:center" align="center">
    <tr>
        <th>订单号</th>
        <th>金额</th>
        <th>订单状态</th>
        <th>明细</th>

    </tr>
    <c:forEach items="${ os}" var="o">
        <tr>
            <td>${o.ordernum}</td>
            <td>￥${o.price }元</td>
            <c:choose>
                <c:when test="${o.state == 0}">
                    <td>未付款</td>
                </c:when>
                <c:when test="${o.state == 1}">
                    <td>待发货</td>
                </c:when>
                <c:when test="${o.state == 2}">
                    <td>待签收</td>
                </c:when>
                <c:when test="${o.state == 3}">
                    <td>待评价</td>
                </c:when>
            </c:choose>

            <td>
                <a href="${pageContext.request.contextPath}/clientServlet?operation=showOrdersDetail&ordersId=${o.ordernum}">订单详情</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

