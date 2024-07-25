package com.petplatform.controllor;
import com.petplatform.POJO.Administer;
import com.petplatform.dao.AdministerDao;

import com.petplatform.dao.AdoptionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(name = "form_ad_login", value = "/form_ad_login")
public class form_ad_login extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String adUsername=request.getParameter("adUsername");
         String adPassword=request.getParameter("adPassword");
         String target="0_ad_login.html";
         Administer administer = new Administer();
         administer.setAdministerUsername(adUsername);
         administer = AdministerDao.selectAdministerByUsername(administer);
         if(adPassword.equals(administer.getAdministerPassword())){
             response.setContentType("text/html");
             // 发送重定向响应
             response.sendRedirect(target);
         }

    }
}
