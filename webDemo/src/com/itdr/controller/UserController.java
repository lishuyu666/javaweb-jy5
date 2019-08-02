package com.itdr.controller;

import com.itdr.pojo.Users;
import com.itdr.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/manage/user/list.do")
public class UserController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String pageSize = request.getParameter("pageSize");
        String pageNum = request.getParameter("pageNum");
        UserService uc = new  UserService();
        List<Users> li = uc.selectAll(pageSize,pageNum);
        response.getWriter().write(li.toString());
    }
}
