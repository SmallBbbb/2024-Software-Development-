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

import java.io.IOException;
@WebServlet(name = "enroll", value = "/enroll")
public class form_enroll extends HttpServlet {
    private UserDao userDao = new UserDao();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nickname = request.getParameter("nickname");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String phone_number = request.getParameter("phone_number");
        String gender = request.getParameter("gender");
        User user = new User();
        //用户初始化
        user.setUserVolunteerQualification(true);
        user.setUserGender(gender);
        user.setUserPhoneNumber(phone_number);
//        user.setUserIdNumber();//设置唯一id
        user.setUserNickname(nickname);
        user.setUserPassword(password);
    }

}
