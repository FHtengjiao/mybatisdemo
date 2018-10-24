package com.imooc.servlet;

import com.imooc.dao.UserDao;
import com.imooc.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindAllUserServlet", urlPatterns = "/index")
public class FindAllUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao dao = new UserDao();
        List<User> users = dao.findAll();
//        for (User user:users
//             ) {
//            System.out.println(user);
//        }
        request.setAttribute("usersList", users);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
