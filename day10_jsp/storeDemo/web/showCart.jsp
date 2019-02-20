
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
         contentType="text/html;charset=UTF-8"%>
<%@ include file="/header.jsp" %>

<c:if test="${empty sessionScope.cart.items}">
    <img  src="${pageContext.request.contextPath }/images/emptyCart.jpg"/><br/>对不起，您没有购买任何商品
</c:if>
<c:if test="${!empty sessionScope.cart.items}">
    <h1>您购买的商品如下</h1>
    <table border="1" width="88%" style="text-align:center" align="center">
        <tr>
            <th>书名</th>
            <th>作者</th>
            <th>单价</th>
            <th>数量</th>
            <th>小计</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${ sessionScope.cart.items}" var="me">
            <tr>
                <td>${me.value.book.name}</td>
                <td>${me.value.book.author }</td>
                <td>${me.value.book.price }</td>
                <td>${me.value.num }</td>
                <td>${me.value.price}</td>
                <td>
                    <a href="#" >删除</a>
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6" align="right">
                总数量：${sessionScope.cart.num}  
                付款金额：${sessionScope.cart.price}  
                <a href="${pageContext.request.contextPath }/clientServlet?operation=genOrders">生成订单</a>
            </td>
        </tr>
    </table>
</c:if>
</body>
</html>
