package com.petplatform.controllor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "userPass", value = "/userPass")
public class form_user_pass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String passUserUsername=request.getParameter("passUserUsername");
//        UserDao.selectUserById(passUserUsername).setUserState("正式用户");
    }
}
