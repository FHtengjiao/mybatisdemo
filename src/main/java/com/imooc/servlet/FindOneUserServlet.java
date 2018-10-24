package com.imooc.servlet;

import com.imooc.dao.UserDao;
import com.imooc.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindOneUserServlet", urlPatterns = "/findOne")
public class FindOneUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserDao dao = new UserDao();
        User user = dao.findById(Integer.parseInt(id));
        request.setAttribute("user", user);
        request.getRequestDispatcher("detail.jsp").forward(request, response);
    }
}
