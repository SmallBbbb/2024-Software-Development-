package com.petplatform.controllor;
import com.petplatform.POJO.Adoption;
import com.petplatform.dao.AdoptionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;

@WebServlet(name = "adopt", value = "/adopt")
public class form_adopt extends HttpServlet  {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html");
         String adoptionNumber=request.getParameter("adoptionNumber");
         int adoptionPetNumber=request.getIntHeader("adoptionPetNumber");
         String adopterNumber=request.getParameter("adopterNumber");
         Timestamp adoptionTime= Timestamp.valueOf(request.getParameter("adoptionTime"));
         String adoptionSketch=request.getParameter("adoptionSketch");

        Adoption adoption=new Adoption();

        adoption.setAdoptionNumber(adoptionNumber);
        adoption.setAdoptionSketch(adoptionSketch);
        adoption.setAdoptionTime(adoptionTime);
        adoption.setAdopterNumber(adopterNumber);
        adoption.setAdoptionPetNumber(adoptionPetNumber);
        adoption.setAdoptionSketch(adoptionSketch);
        adoption.setCheckState("待审核");

        AdoptionDao.insertAdoption(adoption);
    }
}
