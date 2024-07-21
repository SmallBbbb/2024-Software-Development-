<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="user_js/2_team_show.js"></script>
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
    <title>团队展示</title>
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
    <div class="container mt-5">
        <div class="team-section">
            <h1 class="text-center mb-4">我们的团队</h1>

            <div class="row justify-content-center">
                <!-- 团队成员卡片，每个成员卡片保持不变，但添加了:hover效果 -->
                <!-- ...（之前定义的三个团队成员卡片）... -->
                <div class="row justify-content-center">
                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <img src="path_to_photo1.jpg" class="card-img-top" alt="詹豪鑫">
                            <div class="card-body">
                                <h5 class="card-title">詹豪鑫</h5>
                                <p class="card-text">南京理工大学二年级学生，团队核心成员之一。</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <img src="path_to_photo2.jpg" class="card-img-top" alt="张洪鸣">
                            <div class="card-body">
                                <h5 class="card-title">张洪鸣</h5>
                                <p class="card-text">南京理工大学二年级学生，专注于后端开发。</p>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <img src="path_to_photo3.jpg" class="card-img-top" alt="郑力泽">
                            <div class="card-body">
                                <h5 class="card-title">郑力泽</h5>
                                <p class="card-text">南京理工大学二年级学生，前端设计与用户体验专家。</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- 可以添加更多内容，如团队介绍、联系方式等 -->
            <div class="text-center mt-4">
                <p>我们是一群热爱动物、致力于宠物领养与救助事业的南京理工大学学生。</p>
                <a href="#contact" class="btn btn-primary">联系我们</a>
            </div>
        </div>
    </div>

    <!-- 假设有一个联系方式的锚点部分 -->
    <div id="contact" class="container mt-5">
        <h2 class="text-center mb-4">联系方式</h2>
        <!-- 联系方式内容 -->
    </div>
</div>
</body>
