package com.petplatform.controllor;
import com.petplatform.POJO.Adoption;
import com.petplatform.dao.AdoptionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "passAdopt", value = "/passAdopt")
public class form_adoption_pass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adoptionNumber=request.getParameter("adoptionNumber");
        Adoption adoption=new Adoption();
        adoption.setAdoptionNumber(adoptionNumber);
        AdoptionDao.selectAdoptionByNumber(adoption).setCheckState("通过");
    }
}
