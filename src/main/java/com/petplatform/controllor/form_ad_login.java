package com.petplatform.controllor;
import com.petplatform.POJO.Administer;
import com.petplatform.dao.AdministerDao;

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
import java.util.Objects;

@WebServlet(name = "form_ad_login", value = "form_ad_login")
public class form_ad_login extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();

        Administer admin = new Administer();

        try {
            BeanUtils.populate(admin, map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        //密码相符，登录成功
        if(Objects.equals(admin.getAdministerPassword(), AdministerDao.selectAdministerByUsername(admin).getAdministerPassword())){
            response.sendRedirect(request.getContextPath() + "/admin_html/1_ad_account.html");
        }
        else{
            response.sendRedirect(request.getContextPath() + "/admin_html/0_ad_login.html");
        }
    }
}
