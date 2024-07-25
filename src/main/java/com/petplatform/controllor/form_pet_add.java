package com.petplatform.controllor;

import com.petplatform.POJO.Pet;
import com.petplatform.dao.PetDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "form_pet_add", value = "/form_pet_add")
public class form_pet_add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Map<String, String[]> parameterMap = request.getParameterMap();
       Pet pet = new Pet();
        try {
            BeanUtils.populate(pet,parameterMap);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        PetDao.insertPet(pet);
    }

}
