package com.petplatform.controllor;
import com.petplatform.POJO.Stuff;
import com.petplatform.dao.StuffDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "stuffDelete", value = "/stuffDelete")
public class form_stuff_delete extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stuffIdNumber=request.getParameter("stuffIdNumber");
        Stuff stuff=new Stuff();
        stuff.setStuffIdNumber(stuffIdNumber);
        StuffDao.deleteStuff(StuffDao.selectByStuffIdNumber(stuff));
    }
}
