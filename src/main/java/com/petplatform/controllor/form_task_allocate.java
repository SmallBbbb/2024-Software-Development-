package com.petplatform.controllor;

import jakarta.servlet.http.HttpServlet;
import com.petplatform.POJO.Task;
import com.petplatform.dao.TaskDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

@WebServlet(name = "taskAllocate", value = "/taskAllocate")
public class form_task_allocate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stuffNumber=request.getParameter("stuffNumber");
        int taskNumber=request.getIntHeader("taskNumber");
        Task task=new Task();
        task.setTaskNumber(taskNumber);
        TaskDao.selectTaskByNumber(task).setCaptainNumber(stuffNumber);
    }
}
