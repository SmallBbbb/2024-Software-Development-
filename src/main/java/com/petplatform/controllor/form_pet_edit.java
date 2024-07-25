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
//        int petNumberEdit=request.getIntHeader("petNumberEdit");
//        String petName=request.getParameter("petName");
//        String petBreed=request.getParameter("petBreed");
//        String petGender=request.getParameter("petGender");
//        int petAge=request.getIntHeader("petAge");
//        String petAdopterId=request.getParameter("petAdopterId");
//        String petDeposition=request.getParameter("petDeposition");
//        Pet pet=new Pet();
//        pet.setPetNumber(petNumberEdit);
//        pet=PetDao.selectByPetNumber(pet);
//        //如果查不到对象说明需要插入
//        if(pet==null){
//            PetDao.insertPet(pet);
//        }
//        //插入后赋值&修改属性值
//        pet.setPetAdopterId(petAdopterId);
//        pet.setPetAge(petAge);
//        pet.setPetBreed(petBreed);
//        pet.setPetDisposition(petDeposition);
//        pet.setPetName(petName);
//        pet.setPetGender(petGender);
//        pet.setPetNumber(petNumberEdit);
        Map<String, String[]> parameterMap = request.getParameterMap();
        Pet pet = new Pet();
        try {
            BeanUtils.populate(pet, parameterMap);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        PetDao.updatePet(pet);
    }
}
