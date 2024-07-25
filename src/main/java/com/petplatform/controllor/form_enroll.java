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
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "form_enroll", value = "/form_enroll")
public class form_enroll extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("userPhoneNumber");
//        String Phonenumber = request.getParameter("userPhoneNumber");
//        String password = request.getParameter("userPassword");
//        String realname = request.getParameter("userName");
//        String email = request.getParameter("userEmail");
//        String nickname = request.getParameter("userNickname");
//        String Idnumber = request.getParameter("userIdNumber");
//        int age = request.getIntHeader("userAge");
//        String gender = request.getParameter("userGender");
//
//        User user=new User();
////        user.setUserState("游客");
//        user.setUserPassword(password);
//        user.setUserGender(gender);
//        user.setUserPhoneNumber(Phonenumber);
//        user.setUserName(realname);
//        user.setUserUsername(username);
//        user.setUserEmail(email);
//        user.setUserNickname(nickname);
//        user.setUserIdNumber(Idnumber);
//        user.setUserAge(age);
//        user.setUserVolunteerQualification(true);
//        UserDao.insertUser(user);
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("申请已提交，请等待管理员审核");

        Map<String, String[]> parameterMap = request.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user, parameterMap);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        user.setUserIdNumber(user.getUserPhoneNumber());
        UserDao.insertUser(user);
    }
}
