package com.petplatform.controllor;
import com.petplatform.POJO.Pet;
import com.petplatform.dao.PetDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "form_pet_delete", value = "/form_pet_delete")
public class form_pet_delete extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Pet pet=new Pet();
        Map<String, String[]> map=request.getParameterMap();
        try {
            BeanUtils.populate(pet,map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        PetDao.deletePet(pet);
    }
}
