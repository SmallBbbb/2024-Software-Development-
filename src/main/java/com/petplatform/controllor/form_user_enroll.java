// 指定该Java类所在的包路径
package com.petplatform.controllor;

// 导入Jakarta Servlet相关的注解和HttpServlet类
// 注意：这里使用的是jakarta.servlet包，而不是旧的javax.servlet包，这反映了Servlet规范的更新
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

import java.util.Properties;

@WebServlet(name = "form_user_enroll", value = "/form_user_enroll")
public class form_user_enroll extends HttpServlet {
    @Override
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

        //注册账号已经存在，跳转到登录界面
        if(UserDao.selectUserById(user.getUserIdNumber()) != null){
            response.sendRedirect(request.getContextPath()+"/user_html/5_login.html");
        }
        //账号不存在，存入数据库，跳转到登陆界面
        else {
            user.setUserIdNumber(user.getUserPhoneNumber());
            UserDao.insertUser(user);
            response.sendRedirect(request.getContextPath()+"/user_html/5_login.html");

        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}