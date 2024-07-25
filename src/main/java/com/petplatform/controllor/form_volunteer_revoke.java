package com.petplatform.controllor;
import com.petplatform.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "volunteerRevoke", value = "/volunteerRevoke")
public class form_volunteer_revoke extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userNamePassVolunteer=request.getParameter("userNamePassVolunteer");
        UserDao.selectUserById(userNamePassVolunteer).setUserVolunteerQualification(false);
    }
}
