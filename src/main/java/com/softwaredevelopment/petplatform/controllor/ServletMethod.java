package com.softwaredevelopment.petplatform.controllor;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//本文件仅用于记录Servlet方法

/**
 * Servlet方法
 */
@WebServlet(name = "servletMethod", value = "/servlet-method")

public class ServletMethod extends HttpServlet {
    /**
     * 初始化方法
     * 在Servlet被创建时执行，仅执行一次
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("ServletMethod init");

    }

    /**提供服务方法
     *每次Servlet被访问时都会执行
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println("ServletMethod service");
    }

    /**
     * 销毁方法
     * 服务器正常关闭时执行
     */
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("ServletMethod destroy");
    }

    /**
     * 用于获取ServletConfig对象
     * ServletConfig：Servlet配置对象
     * 需要自己实现
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return super.getServletConfig();
    }

    /**
     * 获取Servlet的一些信息，如版本、作者等
     * @return
     */
    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }
}
