<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="user_js/4_pet_task_pose.js"></script>
    <style>
        .nav-item{
            background-color: rgba(234, 223, 154, 0.64);
            width:16%;
            margin-left: 2%;
            margin-right: 2%;
            text-align: center;
            border-radius:10px;
            font-size: larger;
        }
        .container-fluid{
            background-color: #e4b9c0;
            height: 1000px;
        }
    </style>
    <title>主页</title>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-12 col-md-12 col-xs-12 col-lg-12">
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="1_homepage.jsp">主页</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="2_team_show.jsp">团队展示</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="3_pet_adopt.jsp">宠物领养</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="4_pet_help.jsp">宠物救助</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="5_login.jsp" tabindex="-1" aria-disabled="true">登录</a>
                </li>
            </ul>
        </div>
    </div>
    <%--宠物领养信息的动态列表--%>
    <div class="container mt-5">
        <h1 class="mb-4">救助任务信息列表</h1>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col">任务编号</th>
                <th scope="col">救助对象</th>
                <th scope="col">领队编号</th>
                <th scope="col">发布时间</th>
                <th scope="col">任务地点</th>
                <th scope="col">任务描述</th>
                <th scope="col">任务状态</th>
            </tr>
            </thead>
<%--            <tbody>--%>
<%--            <c:forEach var="pet" items="${pets}">--%>
<%--                <tr>--%>
<%--                    <th scope="row">${pet.id}</th>--%>
<%--                    <td>${pet.category}</td>--%>
<%--                    <td>${pet.breed}</td>--%>
<%--                    <td>${pet.age}</td>--%>
<%--                    <td>${pet.healthStatus}</td>--%>
<%--                    <td>${pet.temperament}</td>--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>
<%--            </tbody>--%>
        </table>
    </div>
</div>
</body>
