package com.petplatform.controllor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petplatform.POJO.Stuff;
import com.petplatform.dao.StuffDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "table_stuff_consult", value = "/table_stuff_consult")
public class table_stuff_consult extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<Stuff> list = new ArrayList<>(StuffDao.selectStuffs());



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
