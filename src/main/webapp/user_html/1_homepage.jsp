<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="user_js/1_homepage.js"></script>
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <style>
        .container-fluid{
            background-color: #e4b9c0;
            height: 1000px;
        }
        .nav-item{
            background-color: rgba(234, 223, 154, 0.64);
            width:16%;
            margin-left: 2%;
            margin-right: 2%;
            text-align: center;
            border-radius:10px;
            font-size: larger;
        }
    </style>
    <title>主页</title>
</head>
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
    <div class="row">
    <div class="col-sm-12 col-md-12 col-xs-12 col-lg-12">
        <img src="../image/2.jpg" alt="" style="width: 20%;"><img src="../image/3.jpg" alt="" style="width: 20%;">
        <img src="../image/4.jpg" alt="" style="width: 20%;">
        <img src="../image/5.jpg" alt="" style="width: 20%;">
        <img src="../image/6.jpg" alt="" style="width: 20%;">
        <img src="../image/7.jpg" alt="" style="width: 20%;">
        <img src="../image/9.jpg" alt="" style="width: 20%;">
        <img src="../image/10.jpg" alt="" style="width: 20%;">
        </div>
    </div></div>
</body>
