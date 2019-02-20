package com.cskaoyan.servlet;

import com.cskaoyan.entity.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "OrderServlet", urlPatterns = "/orderServlet")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //订单在正常业务下是根据每个用户从数据库内读取，接下来封装成前台页面所需要的格式
        List<Order> orderList = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            Order order = new Order();
            order.setOrdernum(UUID.randomUUID().toString());
            order.setPrice(Math.random()*100);
            int i1 = (int) (Math.random() * 4);
            order.setState(i1);
            orderList.add(order);
        }
        request.setAttribute("os",orderList);
        //接下来如何跳转到jsp页面
        //重定向可不可以？？？？？ request
        request.getRequestDispatcher("/orderList.jsp").forward(request,response);
    }
}
