package com.petplatform.controllor;
import com.petplatform.POJO.Stuff;
import com.petplatform.dao.StuffDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "form_stuff_delete", value = "/form_stuff_delete")
public class form_stuff_delete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Map<String, String[]> map = request.getParameterMap();
        Stuff stuff = new Stuff();

        try {
            BeanUtils.populate(stuff, map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        StuffDao.deleteStuff(stuff);
    }
}
