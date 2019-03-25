package com.cskaoyan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by little Stone
 * Date 2019/3/22 Time 16:43
 */
public class OrderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.setCharacterEncoding("utf-8");
		String op = req.getParameter("op");
		switch (op){
			case "addOrder":
				addOrder(req,resp);
				break;
			case "deleteOrder":
				deleteOrder(req,resp);
				break;
			default:
				printError(req,resp);
				break;
		}
	}

	private void printError(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.getWriter().append("unknown operation");
	}

	private void deleteOrder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.getWriter().append("delete order");

	}

	private void addOrder(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.getWriter().append("add order");
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}
