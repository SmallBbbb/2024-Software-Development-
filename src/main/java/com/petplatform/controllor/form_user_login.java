package com.petplatform.controllor;

import com.petplatform.POJO.User;
import com.petplatform.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


@WebServlet(name = "form_user_login", value = "/form_user_login")
public class form_user_login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession lastSession = request.getSession(false);
        lastSession.invalidate();

        Map<String, String[]> parameterMap = request.getParameterMap();

        User user = new User();

        try {
            BeanUtils.populate(user, parameterMap);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        User selectedUser = UserDao.selectUserByUsername(user);
        String password = selectedUser.getUserPassword();

        //登陆成功，跳转到主界面
        if (user.getUserPassword() != null && user.getUserPassword().equals(password)) {
            HttpSession session = request.getSession();

            session.setAttribute("userName", selectedUser.getUserUsername());
            session.setAttribute("userPassword", selectedUser.getUserPassword());
            session.setAttribute("userIdNumber", selectedUser.getUserIdNumber());
            response.sendRedirect(request.getContextPath() + "/user_html/1_homepage.html");


        }

        //登陆失败，回到登陆界面
        else {
            response.sendRedirect(request.getContextPath() + "/user_html/5_login.html");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
