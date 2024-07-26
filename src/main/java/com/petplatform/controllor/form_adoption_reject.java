package com.petplatform.controllor;

import com.petplatform.POJO.Adoption;
import com.petplatform.dao.AdoptionDao;
import com.sun.tools.jconsole.JConsoleContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Console;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name="form_adoption_reject", value = "/form_adoption_reject/*")
public class form_adoption_reject extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if (pathInfo != null && pathInfo.startsWith("/")) {
            pathInfo = pathInfo.substring(1); // 移除开头的斜杠
            String[] parts = pathInfo.split("/");
            if (parts.length > 0) {
                String adoptionNumber = parts[0];
                Adoption adoption = new Adoption();
                adoption.setAdoptionNumber(Integer.parseInt(adoptionNumber));
                AdoptionDao.rejectAdoption(adoption);
            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
