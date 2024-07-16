package com.softwaredevelopment.petplatform.controllor;

import com.softwaredevelopment.petplatform.POJO.User;
import com.softwaredevelopment.petplatform.dao.UserDao;
import com.softwaredevelopment.petplatform.utils.JDBCUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

@WebServlet(name = "registerServlet" ,value = "/register-servlet")
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        //Map<String, String[]> parameterMap = request.getParameterMap();
        User loginUser = new User();
        loginUser.setUsername(request.getParameter("username"));
        loginUser.setPassword(request.getParameter("password"));
        //userdao.insertUser(loginUser);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //Map<String, String[]> parameterMap = request.getParameterMap();
        User loginUser = new User();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        UserDao.insertUser(loginUser);

    }
}