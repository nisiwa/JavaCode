package com.cskaoyan.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/servlet1")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        response.setContentType("text/html;charset=utf-8");
        if("zhangsan".equals(name) && "123".equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("name","zhangsan");
            response.getWriter().println("登录成功");
        }
    }
}
