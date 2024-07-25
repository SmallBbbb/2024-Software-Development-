package com.petplatform.controllor;

import com.petplatform.POJO.Pet;
import com.petplatform.dao.PetDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "form_pet_add", value = "/form_pet_add")
public class form_pet_add extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Pet pet = new Pet();
            Map<String, String[]> parameterMap = request.getParameterMap();
            BeanUtils.populate(pet, parameterMap);

            // 数据验证示例：确保必填字段不为空
            if (pet.getPetName() == null || pet.getPetName().trim().isEmpty()) {
                throw new IllegalArgumentException("宠物名不能为空");
            }

            // 将宠物信息插入到数据库
            PetDao.insertPet(pet);

            // 重定向到成功页面或者主页面
            response.sendRedirect(request.getContextPath() + "/admin_html/2_ad_pet.html");

        } catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            // 数据验证失败或者其他异常，将错误信息打印到控制台
            e.printStackTrace();

            // 返回错误信息给客户端
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().println("保存宠物信息失败: " + e.getMessage());
        }
    }
}
