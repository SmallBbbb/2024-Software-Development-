package com.petplatform.controllor;
import com.petplatform.POJO.Pet;
import com.petplatform.POJO.Stuff;
import com.petplatform.dao.AdoptionDao;
import com.petplatform.dao.PetDao;
import com.petplatform.dao.StuffDao;
import com.petplatform.dao.TaskDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "form_stuff_delete", value = "/form_stuff_delete/*")
public class form_stuff_delete extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if (pathInfo != null && pathInfo.startsWith("/")) {
            pathInfo = pathInfo.substring(1); // 移除开头的斜杠
            String[] parts = pathInfo.split("/");
            if (parts.length > 0) {
                String stuffIdNumber = parts[0];
                Stuff stuff = new Stuff();
                stuff.setStuffIdNumber(stuffIdNumber);
                TaskDao.deleteTaskByStuffIdNumber(stuff);
                StuffDao.deleteStuff(stuff);
            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
