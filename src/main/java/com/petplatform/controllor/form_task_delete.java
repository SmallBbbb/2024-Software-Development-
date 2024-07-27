package com.petplatform.controllor;
import com.petplatform.POJO.Stuff;
import com.petplatform.POJO.Task;
import com.petplatform.dao.StuffDao;
import com.petplatform.dao.TaskDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;

@WebServlet(name = "form_task_delete", value = "/form_task_delete/*")
public class form_task_delete extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        if (pathInfo != null && pathInfo.startsWith("/")) {
            pathInfo = pathInfo.substring(1); // 移除开头的斜杠
            String[] parts = pathInfo.split("/");
            if (parts.length > 0) {
                String taskNumber = parts[0];
                Task task = new Task();
                task.setTaskNumber(Integer.parseInt(taskNumber));
                TaskDao.deleteTask(task);
            }
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}


