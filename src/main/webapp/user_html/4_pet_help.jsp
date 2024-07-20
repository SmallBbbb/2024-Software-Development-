<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="user_js/4_pet_help.js.js"></script>
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
<!-- 模态框 -->
<div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="taskModalLabel">救助任务发布</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <!-- 宠物种类 -->
                    <div class="form-group">
                        <label for="petType" class="form-label">宠物种类</label>
                        <select class="form-select" id="petType" aria-label="Default select example">
                            <option selected>请选择...</option>
                            <option value="cat">猫</option>
                            <option value="dog">狗</option>
                            <option value="fish">鱼</option>
                            <option value="bird">鸟类</option>
                            <option value="other">其他动物</option>
                        </select>
                    </div>
                    <!-- 时间 -->
                    <div class="form-group">
                        <label for="dateTime" class="form-label">时间</label>
                        <input type="datetime-local" class="form-control" id="dateTime">
                    </div>

                    <!-- 地点 -->
                    <div class="form-group">
                        <label for="location" class="form-label">地点</label>
                        <input type="text" class="form-control" id="location" placeholder="请输入地点">
                    </div>

                    <!-- 任务简述 -->
                    <div class="form-group">
                        <label for="taskDescription" class="form-label">任务简述</label>
                        <textarea class="form-control" id="taskDescription" rows="3"></textarea>
                    </div>

                    <!-- 所需工具类型 -->
                    <div class="form-group">
                        <label for="tools" class="form-label">所需工具类型</label>
                        <input type="text" class="form-control" id="tools" placeholder="请输入所需工具类型">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary">发布</button>
            </div>
        </div>
    </div>
</div>
<%--主体--%>
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
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
        <!-- 触发模态框的按钮 -->
        发布救助任务
    </button>
    <div class="row align-items-center" style="text-align: center">
        <div class="col-sm-10 col-md-10 col-xs-10 col-lg-10" style="margin: 20px auto;">
            <button type="button" class="btn btn-info" onclick="location.href='4_pet_task_pose.jsp'">浏览救助任务</button>
        </div>
    </div>
</div>
</body>
