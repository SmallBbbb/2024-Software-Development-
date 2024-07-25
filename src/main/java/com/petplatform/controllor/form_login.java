// 指定该Java类所在的包路径  
package com.petplatform.controllor;

// 导入Jakarta Servlet相关的注解和HttpServlet类  
// 注意：这里使用的是jakarta.servlet包，而不是旧的javax.servlet包，这反映了Servlet规范的更新  
import com.petplatform.POJO.User;
import com.petplatform.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


// 使用@WebServlet注解来声明这是一个Servlet，并指定其配置信息  
// name属性为该Servlet的名称，value属性为该Servlet的访问URL模式  
@WebServlet(name = "login", value = "/login")
public class form_login extends HttpServlet {
    // 这里是LoginController类的主体，继承自HttpServlet  
    // 在这个类中，你可以通过重写HttpServlet的doGet、doPost等方法来处理HTTP请求  
    // 例如，你可能想要重写doPost方法来处理登录表单的提交
    String target="1_ad_account.html";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userUsername");
        String password = req.getParameter("userPassword");
        PrintWriter out = resp.getWriter();
//        //测试方法
//        if (password.equals("1234")) {
//            out.println("html");
//        }
        //
        if (password.equals(UserDao.selectUserById(username).getUserPassword())) {
            HttpSession session = req.getSession();
            resp.setContentType("text/html");
            // 发送重定向响应
            resp.sendRedirect(target);
        }

}
}

    // 注意：虽然类名是LoginController，但实际上它继承自HttpServlet，  
    // 在MVC（Model-View-Controller）架构中，它扮演着Controller的角色，  
    // 负责处理用户的请求并调用相应的业务逻辑（Model），最后可能将结果转发到某个视图（View）进行显示。  
    // 但是，由于它直接继承自HttpServlet，并没有显式地遵循MVC的Controller接口或基类，  
    // 所以这里的命名（Controller）可能稍微有些误导性。  
