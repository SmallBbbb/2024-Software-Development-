package com.petplatform.controllor;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitFormData")
public class SubmitFormDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 获取表单数据
        String petType = request.getParameter("petType");
        String time = request.getParameter("time");
        String location = request.getParameter("location");
        String taskDescription = request.getParameter("taskDescription");
        String requiredTools = request.getParameter("requiredTools");

        // 数据库连接参数
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";

        // SQL 插入语句
        String sql = "INSERT INTO tasks (pet_type, time, location, task_description, required_tools) VALUES (?, ?, ?, ?, ?)";

        try {
            // 加载 MySQL JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");
            
            // 建立数据库连接
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                
                // 设置参数
                stmt.setString(1, petType);
                stmt.setString(2, time);
                stmt.setString(3, location);
                stmt.setString(4, taskDescription);
                stmt.setString(5, requiredTools);
                
                // 执行插入操作
                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("数据插入成功！");
                    // 可以根据需要设置成功保存后的跳转或其他操作
                    response.sendRedirect("success.jsp");
                } else {
                    System.out.println("数据插入失败！");
                    // 可以根据需要设置失败时的跳转或其他操作
                    response.sendRedirect("error.jsp");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // 可以根据异常设置错误处理逻辑
            response.sendRedirect("error.jsp");
        }
    }
}
