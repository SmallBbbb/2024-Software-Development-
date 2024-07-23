package com.petplatform.controllor;
import com.petplatform.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "userBan", value = "/userBan")
public class form_user_ban extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String banUserUsername=request.getParameter("banUserUsername");
//        UserDao.selectUserById(banUserUsername).setUserState("封禁中");
    }
}
