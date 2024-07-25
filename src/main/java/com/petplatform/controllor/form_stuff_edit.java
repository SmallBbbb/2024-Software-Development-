package com.petplatform.controllor;
import com.petplatform.POJO.Stuff;
import com.petplatform.dao.StuffDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "stuffEdit", value = "/stuffEdit")
public class form_stuff_edit extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String stuffIdNumberEdit=request.getParameter("stuffIdNumberEdit");
//        String stuffPhoneNumber=request.getParameter("stuffPhoneNumber");
//        String stuffName=request.getParameter("stuffName");
//        String stuffGender=request.getParameter("stuffGender");
//        int stuffAge=request.getIntHeader("stuffAge");
//        String stuffEmail=request.getParameter("stuffEmail");
//        String stuffJob=request.getParameter("stuffJob");
//        Stuff stuff=new Stuff();
//        stuff.setStuffIdNumber(stuffIdNumberEdit);
//        stuff=StuffDao.selectByStuffIdNumber(stuff);
//        //如果查不到对象说明需要插入
//        if(stuff==null){
//            StuffDao.insertStuff(stuff);
//        }
//        //插入后赋值&修改属性值
//        stuff.setStuffIdNumber(stuffIdNumberEdit);
//        stuff.setStuffPhoneNumber(stuffPhoneNumber);
//        stuff.setStuffName(stuffName);
//        stuff.setStuffGender(stuffGender);
//        stuff.setStuffAge(stuffAge);
//        stuff.setStuffEmail(stuffEmail);
//        stuff.setStuffJob(stuffJob);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Map<String, String[]> map = request.getParameterMap();
        Stuff stuff = new Stuff();
        try {
            BeanUtils.populate(stuff, map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        StuffDao.updateStuff(stuff);
    }
}
