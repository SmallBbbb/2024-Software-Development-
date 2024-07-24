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

@WebServlet(name = "JsonDataServlet", value = "/data")
public class JsonDataServlet extends HttpServlet {

    // 处理GET请求的方法
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建一个示例数据列表
        List<MyObject> list = new ArrayList<>();
        list.add(new MyObject("Alice", 25, "Engineer"));
        list.add(new MyObject("Bob", 30, "Designer"));

        // 使用Jackson的ObjectMapper将List对象序列化为JSON字符串
        ObjectMapper mapper = new ObjectMapper();
        String jsonResponse = mapper.writeValueAsString(list);

        // 设置响应的内容类型为JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // 将JSON字符串写入响应中
        response.getWriter().write(jsonResponse);
    }

    // 定义一个简单的内部类来表示数据对象
    static class MyObject {
        public String name;
        public int age;
        public String job;

        // 构造函数
        public MyObject(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        }
    }
}