package com.petplatform.controllor;

import com.petplatform.POJO.Adoption;
import com.petplatform.POJO.Stuff;
import com.petplatform.dao.AdoptionDao;
import com.petplatform.dao.StuffDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "form_adoption_add", value = "/form_adoption_add")
public class form_adoption_add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Map<String, String[]> map = request.getParameterMap();
        Adoption adoption = new Adoption();

        try {
            BeanUtils.populate(adoption, map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        AdoptionDao.insertAdoption(adoption);
        response.sendRedirect(request.getContextPath() + "/admin_html/5_ad_adopt.html");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
