package com.petplatform.controllor;
import com.petplatform.POJO.Pet;
import com.petplatform.dao.PetDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.ibatis.jdbc.Null;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "form_pet_edit", value = "/form_pet_edit")
public class form_pet_edit extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Pet pet = new Pet();
        pet.setPetNumber(Integer.parseInt(request.getParameter("editPetNumber")));
        pet.setPetName(request.getParameter("editPetName"));
        pet.setPetGender(request.getParameter("editPetGender"));
        pet.setPetBreed(request.getParameter("editPetBreed"));
        pet.setPetAge(Integer.parseInt(request.getParameter("editPetAge")));
        pet.setPetAdopterId(request.getParameter("editPetAdopterId"));
        pet.setPetHealthCondition(request.getParameter("editPetHealthCondition"));
        pet.setPetDisposition(request.getParameter("editPetDisposition"));

        System.out.println(pet);

        PetDao.updatePet(pet);

        response.sendRedirect(request.getContextPath() + "/admin_html/2_ad_pet.html");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}