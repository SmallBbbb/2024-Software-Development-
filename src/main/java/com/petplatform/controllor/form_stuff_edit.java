package com.petplatform.controllor;
import com.petplatform.POJO.Stuff;
import com.petplatform.dao.StuffDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "form_stuff_edit", value = "/form_stuff_edit")
public class form_stuff_edit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Stuff stuff = new Stuff();
        stuff.setStuffIdNumber(request.getParameter("editStuffIdNumber"));
        stuff.setStuffName(request.getParameter("editStuffName"));
        stuff.setStuffGender(request.getParameter("editStuffGender"));
        stuff.setStuffAge(Integer.parseInt(request.getParameter("editStuffAge")));
        stuff.setStuffPhoneNumber(request.getParameter("editStuffPhoneNumber"));
        stuff.setStuffJob(request.getParameter("editStuffJob"));
        stuff.setStuffEmail(request.getParameter("editStuffEmail"));
        System.out.println(stuff);
        StuffDao.updateStuff(stuff);
        response.sendRedirect(request.getContextPath() + "/admin_html/4_ad_stuff.html");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
