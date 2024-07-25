package com.petplatform.controllor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petplatform.POJO.Pet;
import com.petplatform.dao.PetDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "table_pet_consult", value = "/table_pet_consult")
public class table_pet_consult extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建一个示例数据列表
        List<Pet> list = new ArrayList<>(PetDao.selectPets());


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
