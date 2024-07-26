package com.petplatform.controllor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petplatform.POJO.User;
import com.petplatform.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "table_user_consult", value = "table_user_consult")
public class table_user_consult extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建一个示例数据列表
        List<User> list = new ArrayList<>(UserDao.selectUsers());


        // 使用Jackson的ObjectMapper将List对象序列化为JSON字符串
        ObjectMapper mapper = new ObjectMapper();
        String jsonResponse = mapper.writeValueAsString(list);

        // 设置响应的内容类型为JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // 将JSON字符串写入响应中
        response.getWriter().write(jsonResponse);
    }
}
