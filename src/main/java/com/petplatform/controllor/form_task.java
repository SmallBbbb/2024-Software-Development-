package com.petplatform.controllor;
import com.petplatform.POJO.Task;
import com.petplatform.dao.TaskDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.Date;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
@WebServlet(name = "task", value = "/task")
public class form_task extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String taskSubject = request.getParameter("taskSubject");
        int taskNumber = request.getIntHeader("taskNumber");
        String captainNumber = request.getParameter("captainNumber");
        String time = request.getParameter("time");
        String taskLocation = request.getParameter("taskLocation");
        String taskDescription = request.getParameter("taskDescription");
        Date taskDate = new Date();

        Task task = new Task();
        task.setTaskSubject(taskSubject);
        task.setTaskDescription(taskDescription);
        task.setTaskLocation(taskLocation);
        task.setTaskNumber(taskNumber);
        task.setTaskState("待接取");
        task.setCaptainNumber(captainNumber);
        //task.setTaskReleaseTime(Timestamp.valueOf(taskDate.toString()));
        TaskDao.insertTask(task);
        // 重定向到成功页面或者主页面
        //response.sendRedirect(request.getContextPath() + "/admin_html/6_ad_task.html");

    }
        }


