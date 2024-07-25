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
@WebServlet(name = "adLogin", value = "/adLogin")
public class form_ad_login extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         int adUsername=request.getIntHeader("adUsername");
//         String adPassword=request.getParameter("adPassword");
//         String target="0_ad_login.html";
//
//        //此处应将形参修改为管理员账号字段值，而非管理员对象,然后去掉注
//         Administer administer=AdministerDao.selectAdministerByUsername(adUsername);
//         if(adPassword.equals(administer.getAdministerPassword())){
//             response.setContentType("text/html");
//             // 发送重定向响应
//             response.sendRedirect(target);
//         }

    }
}
