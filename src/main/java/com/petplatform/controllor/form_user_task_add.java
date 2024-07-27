package com.petplatform.controllor;
import com.petplatform.POJO.Task;
import com.petplatform.dao.TaskDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

@WebServlet(name = "form_user_task_add", value = "/form_user_task_add")
public class form_user_task_add extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();

        Task task = new Task();

        try {
            BeanUtils.populate(task, parameterMap);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        task.setTaskState("unchecked");
        TaskDao.insertTask(task);
        response.sendRedirect(request.getContextPath() + "/user_html/4_pet_help.html");
    }
}