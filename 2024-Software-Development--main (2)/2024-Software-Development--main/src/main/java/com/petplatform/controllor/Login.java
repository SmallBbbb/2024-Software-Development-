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

import java.io.IOException;


// 使用@WebServlet注解来声明这是一个Servlet，并指定其配置信息  
// name属性为该Servlet的名称，value属性为该Servlet的访问URL模式  
@WebServlet(name = "loginServlet", value = "/login-servlet")
public class Login extends HttpServlet {
    private UserDao userDao = new UserDao();
    // 这里是LoginController类的主体，继承自HttpServlet  
    // 在这个类中，你可以通过重写HttpServlet的doGet、doPost等方法来处理HTTP请求  
    // 例如，你可能想要重写doPost方法来处理登录表单的提交

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id= req.getParameter("id");
        String password= req.getParameter("password");
        User user=userDao.selectUserById(id);
        if (password ==user.getUserPassword()||user==null) {
            // 登录成功，重定向到另一个页面
            resp.sendRedirect("1_homepage.jsp");
        }
    }
}

    // 注意：虽然类名是LoginController，但实际上它继承自HttpServlet，  
    // 在MVC（Model-View-Controller）架构中，它扮演着Controller的角色，  
    // 负责处理用户的请求并调用相应的业务逻辑（Model），最后可能将结果转发到某个视图（View）进行显示。  
    // 但是，由于它直接继承自HttpServlet，并没有显式地遵循MVC的Controller接口或基类，  
    // 所以这里的命名（Controller）可能稍微有些误导性。  
