// 指定该Java类所在的包路径
package com.petplatform.controllor;

// 导入Jakarta Servlet相关的注解和HttpServlet类
// 注意：这里使用的是jakarta.servlet包，而不是旧的javax.servlet包，这反映了Servlet规范的更新
import com.petplatform.dao.AdoptionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "adopt", value = "/adopt")
public class example_pet_adopt extends HttpServlet {
    private AdoptionDao adoptionDao = new AdoptionDao();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String  = request.getParameter("nickname");
//        String password = request.getParameter("password");
//        String name = request.getParameter("name");
//        String phone_number = request.getParameter("phone_number");
//        String gender = request.getParameter("gender");
//        Adoption adoption = new Adoption();
//        adoption.setAdopterNumber(request.getParameter("adopter_number"));
//        adoption.setAdoptionNumber();
//        adoption.setAdoptionPetNumber();
//        adoption.setAdoptionTime();
//        adoption.setCheckState();
//        adoption.setAdoptionSketch();
    }
}