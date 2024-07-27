package com.petplatform.controllor;

import com.petplatform.POJO.Adoption;
import com.petplatform.POJO.Pet;
import com.petplatform.dao.AdoptionDao;
import com.petplatform.dao.PetDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "form_adoption_pass", value = "/form_adoption_pass")
public class form_adoption_pass extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if (pathInfo != null && pathInfo.startsWith("/")) {
            pathInfo = pathInfo.substring(1); // 移除开头的斜杠
            String[] parts = pathInfo.split("/");
            if (parts.length > 0) {
                String adoptionNumber = parts[0];

                Adoption adoption = new Adoption();

                adoption.setAdoptionNumber(Integer.parseInt(adoptionNumber));

                AdoptionDao.passAdoption(adoption);

                Adoption ad = AdoptionDao.selectAdoptionByNumber(adoption);

                Pet pet = new Pet();

                pet.setPetNumber(ad.getAdoptionPetNumber());
                PetDao.updatePet(pet);


            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
