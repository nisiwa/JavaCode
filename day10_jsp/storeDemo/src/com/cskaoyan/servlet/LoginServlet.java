package com.cskaoyan.servlet;

import com.cskaoyan.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if("admin".equals(username) && "admin".equals(password)){
            response.getWriter().println("登录成功，即将跳转");
            User user = new User();
            user.setUsername(username);
            request.getSession().setAttribute("user",user);
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
