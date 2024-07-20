<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="admin_js/6_ad_task.js"></script>
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <style>
        h1{
            background-color: #8c8c8c;
            font-size: larger;
            height: 60px;
            padding: 15px;
            margin-bottom: 10px;
        }
        .nav-item{
            border-radius: 3px;
            background-color: #fffbee;
        }
        .container{
            /*background-color: #9ac9ea;*/
            height: 800px;
        }
        #container1{
            background-color: #2b669a;
        }
        #container2{
            background-color: rgba(62, 142, 44, 0.59);
        }
        /* 覆盖所有屏幕尺寸下的container宽度 */
        #table{
            background-color: #67b168;
            max-width: 100%; /* 或者你想要的任何宽度 */
            margin-right: auto;
            margin-left: auto;
            padding-right: 15px;
            padding-left: 15px;
            width: 100%;
        }
    </style>
    <title>救助任务管理</title>
</head>
<body>
<!-- 模态框 -->
<div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="myModalLabel">宠物领养与救助管理系统</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="stuff_number">工作人员编号</label>
                        <input type="number" class="form-control" id="stuff_number" placeholder="输入编号">
                    </div>
                    <div class="form-group">
                        <label for="task_number">任务编号</label>
                        <input type="number" class="form-control" id="task_number" placeholder="输入编号">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">提交</button>
            </div>
        </div>
    </div>
</div>
<div class="container-fluid">
    <%--    标题--%>
    <div class="row">
        <div class="col-sm-12 col-md-12 col-xs-12 col-lg-12" style="height: 80px;">
            <h1><em>宠物领养与救助管理系统</em></h1>
        </div>
    </div>
    <%--   标题下部主体--%>
    <div class="row">
        <%--        容器1，存放左导航条--%>
        <div class="col-sm-2 col-md-2 col-xs-2 col-lg-2" id="container1">
            <div class="container">
                <div class="row">
                    <div class="col-sm-2 col-md-2 col-xs-2 col-lg-2">
                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="1_ad_account.jsp">账户管理</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="2_ad_pet.jsp">宠物管理</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="3_ad_volunteer.jsp">志愿者管理</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link disabled" href="4_ad_stuff.jsp" tabindex="-1" aria-disabled="true">工作人员管理</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="5_ad_adopt.jsp">领养管理</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="6_ad_task.jsp">救助任务管理</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../user_html/1_homepage.jsp">返回</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <%--        容器2，存放查询框和表格--%>
        <div class="col-sm-10 col-md-10 col-xs-10 col-lg-10" id="container2">
            <div class="row">
                <div class="col-sm-12 col-md-12 col-xs-12 col-lg-12">
                    <form class="form"><b style="font-size: large;">任务编号</b>
                        <input type="text" class="textinput" placeholder="请输入任务编号" />
                        <input type="submit" class="consult" value="查询"/>
                        <input type="button" class="consult2" value="新增"/>
                        <!-- 触发模态框的按钮 -->
                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                            分配
                        </button>
                    </form>
                </div>
            </div>
            <%--    账户动态表格--%>
            <div class="row">
                <div class="col-sm-11 col-md-11 col-xs-11 col-lg-11">
                    <div class="container mt-5" id="table">
                        <h2>救助任务管理</h2>
                        <table class="table table-bordered" style="text-align: center;">
                            <thead>
                            <tr>
                                <th>任务编号</th>
                                <th>宠物种类</th>
                                <th>时间</th>
                                <th>地点</th>
                                <th>任务简述</th>
                                <th>任务状态</th>
                                <th>操作</th>
                            </tr>
                            </thead></table>
                    </div>
                </div>
            <%--导航条--%>
            <div class="row">
                <div class="col-sm-12 col-md-12 col-xs-12 col-lg-12" id="search">
                    <nav aria-label="...">
                        <ul class="pagination">
                            <li class="page-item disabled">
                                <a class="page-link" href="#" tabindex="-1" aria-disabled="true"><<</a>
                            </li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item active" aria-current="page">
                                <a class="page-link" href="#">2</a>
                            </li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item">
                                <a class="page-link" href="#">>></a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
