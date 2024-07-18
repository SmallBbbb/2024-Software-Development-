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
        #form{
            margin: 40px 0;
            padding: 30px 50px;
            background-color: #9ac9ea;
            border-radius: 15px;
        }
    </style>
    <title>发布任务</title>
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
    <div class="row">
        <div class="col-sm-3 col-md-3 col-xs-3 col-lg-3"></div>
        <div class="col-sm-6 col-md-6 col-xs-6 col-lg-6" id="form">
            <form>
                <div class="mb-3">
                    <label class="form-label">宠物种类</label>
                    <select class="form-select" aria-label="Default select example">
                        <option selected></option>
                        <option value="1">猫</option>
                        <option value="2">狗</option>
                        <option value="3">鱼</option>
                        <option value="4">鸟</option>
                        <option value="5">其他品种</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="myDate">时间：</label>
                    <input type="date" id="myDate">
                </div>
                <div class="mb-3">
                    <label for="location" class="form-label">地点</label>
                    <input type="text" class="form-control" id="location">
                </div>
                <div class="mb-3">
                    <label for="task" class="form-label">任务内容</label>
                    <textarea class="form-control" id="task" rows="3"></textarea>
                </div>
                <div class="mb-3" style="margin-bottom: 20px">
                    <label for="tool" class="form-label">所需工具</label>
                    <input type="text" class="form-control" id="tool">
                </div>
                <button type="submit" class="btn btn-primary"> 提交</button>
            </form>
        </div>
    </div>
</div>
</body>
