package com.petplatform.controllor;
import com.petplatform.POJO.Pet;
import com.petplatform.dao.PetDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.ibatis.jdbc.Null;

import java.io.IOException;
@WebServlet(name = "petEdit", value = "/petEdit")
public class form_pet_edit extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String petNumberEdit=request.getParameter("petNumberEdit");
        String petName=request.getParameter("petName");
        String petBreed=request.getParameter("petBreed");
        String petGender=request.getParameter("petGender");
        int petAge=request.getIntHeader("petAge");
        int petAdopterId=request.getIntHeader("petAdopterId");
        String petDeposition=request.getParameter("petDeposition");
        Pet pet=new Pet();
        pet.setPetNumber(petNumberEdit);
        pet=PetDao.selectByPetNumber(pet);
        //如果查不到对象说明需要插入
        if(pet==null){
            PetDao.insertPet(pet);
        }
        //插入后赋值&修改属性值
        pet.setPetAdopterId(petAdopterId);
        pet.setPetAge(petAge);
        pet.setPetBreed(petBreed);
        pet.setPetDisposition(petDeposition);
        pet.setPetName(petName);
        pet.setPetGender(petGender);
        pet.setPetNumber(petNumberEdit);
    }
}
