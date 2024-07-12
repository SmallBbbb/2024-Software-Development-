<%--
  Created by IntelliJ IDEA.
  User: starfrost
  Date: 2024/7/11
  Time: 下午10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <div class = "container" id = "container">
        <div class="login" id = "login">
            <form name="logIn" action="${pageContext.request.contextPath}/login-servlet">
                <input type="text" value="username" placeholder="用户名">
                <input type="password" value="password" placeholder="密码">
                <input type="submit">
            </form>
        </div>
        <div>
            <form name="register" action="${pageContext.request.contextPath}/register-servlet" >
                <input type="text" value="username" placeholder="用户名">
                <input type="password" value="password" placeholder="密码">
                <input type="password" value="repeatPassword" placeholder="确认密码">
                <input type="submit">
            </form>
        </div>
    </div>
</body>
</html>
