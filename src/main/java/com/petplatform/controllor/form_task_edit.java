package com.petplatform.controllor;

import jakarta.servlet.http.HttpServlet;
import com.petplatform.POJO.Task;
import com.petplatform.dao.TaskDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "form_task_edit", value = "/form_task_edit")
public class form_task_edit extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Task task = new Task();

        task.setTaskNumber(Integer.parseInt(request.getParameter("editTaskNumber")));
        task.setTaskSubject(request.getParameter("editTaskSubject"));
        task.setCaptainNumber(request.getParameter("editCaptainNumber"));
        task.setTaskLocation(request.getParameter("editTaskLocation"));
        task.setTaskDescription(request.getParameter("editTaskDescription"));
        task.setTaskState(request.getParameter("editTaskState"));
        TaskDao.updateTask(task);

        response.sendRedirect(request.getContextPath() + "/admin_html/6_ad_task.html");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
