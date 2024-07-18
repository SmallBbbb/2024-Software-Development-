<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
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
    <title>宠物救助</title>
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
    <div class="row align-items-center" style="text-align: center">
        <div class="col-sm-10 col-md-10 col-xs-10 col-lg-10" style="margin: 20px auto;">
            <button type="button" class="btn btn-primary" onclick="location.href='4_pet_task_submit.jsp'">发布救助任务</button>
        </div>
        <div class="col-sm-10 col-md-10 col-xs-10 col-lg-10" style="margin: 20px auto;">
            <button type="button" class="btn btn-info" onclick="location.href='4_pet_task_pose.jsp'">浏览救助任务</button>
        </div>
    </div>
</div>
</body>
