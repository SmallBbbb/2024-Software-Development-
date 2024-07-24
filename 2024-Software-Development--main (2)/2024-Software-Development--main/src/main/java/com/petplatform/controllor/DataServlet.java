package com.petplatform.controllor;


import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/data")
public class DataServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MyData> dataList = new ArrayList<>();
        dataList.add(new MyData("Item 1", 1));
        dataList.add(new MyData("Item 2", 2));

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(dataList);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(jsonString);
    }

    static class MyData {
        public String name;
        public int id;

        public MyData(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }
}