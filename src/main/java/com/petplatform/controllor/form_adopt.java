package com.petplatform.controllor;
import com.petplatform.POJO.Adoption;
import com.petplatform.dao.AdoptionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.Map;

@WebServlet(name = "adopt", value = "/adopt")
public class form_adopt extends HttpServlet  {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         response.setContentType("text/html");
//         int adoptionNumber=request.getIntHeader("adoptionNumber");
//         int adoptionPetNumber=request.getIntHeader("adoptionPetNumber");
//         String adopterNumber=request.getParameter("adopterNumber");
//         Timestamp adoptionTime= Timestamp.valueOf(request.getParameter("adoptionTime"));
//         String adoptionSketch=request.getParameter("adoptionSketch");
//
//        Adoption adoption=new Adoption();
//
//        adoption.setAdoptionNumber(adoptionNumber);
//        adoption.setAdoptionSketch(adoptionSketch);
//        adoption.setAdoptionTime(adoptionTime);
//        adoption.setAdopterNumber(adopterNumber);
//        adoption.setAdoptionPetNumber(adoptionPetNumber);
//        adoption.setAdoptionSketch(adoptionSketch);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Map<String, String[]> map = request.getParameterMap();
        Adoption ad = new Adoption();
        try {
            BeanUtils.populate(ad, map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        AdoptionDao.insertAdoption(ad);
    }
}
