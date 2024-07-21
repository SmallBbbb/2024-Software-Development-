<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="admin_js/2_ad_pet.js"></script>
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
    <title>宠物管理</title>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-12 col-md-12 col-xs-12 col-lg-12" style="height: 80px;">
            <h1><em>宠物领养与救助管理系统</em></h1>
        </div>
    </div>
    <%--    标题--%>
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
                    <form class="form"><b style="font-size: large;">类别</b>
                        <input type="text" class="textinput" placeholder="请输入查询宠物类别" />
                        <input type="submit" class="consult" value="查询"/>
                        <input type="button" class="consult2" value="新增"/>
                    </form>
                </div></div>
                <%--    账户动态表格--%>
                <div class="row">
                    <div class="col-sm-11 col-md-11 col-xs-11 col-lg-11">
                        <%--     动态表格块--%>
                            <div class="container mt-5" id="table">
                                <h2>宠物信息</h2>
                                <table class="table table-bordered">
                                    <thead>
                                    <tr>
                                        <th>编号</th>
                                        <th>品种</th>
                                        <th>年龄</th>
                                        <th>主任编号</th>
                                        <th>健康状态</th>
                                        <th>是否领养</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
<%--                                    <tbody>--%>
<%--                                    <%--%>
<%--                                        // 假设request中已经有一个名为"pets"的属性，包含了从数据库获取的宠物信息列表--%>
<%--                                        List<Map<String, Object>> pets = (List<Map<String, Object>>) request.getAttribute("pets");--%>
<%--                                        if (pets != null) {--%>
<%--                                            for (Map<String, Object> pet : pets) {--%>
<%--                                    %>--%>
<%--                                    <tr>--%>
<%--                                        <td><%= pet.get("id") %></td>--%>
<%--                                        <td><%= pet.get("breed") %></td>--%>
<%--                                        <td><%= pet.get("age") %></td>--%>
<%--                                        <td><%= pet.get("owner_id") %></td>--%>
<%--                                        <td><%= pet.get("health_status") %></td>--%>
<%--                                        <td><%= pet.get("is_adopted") ? "Yes" : "No" %></td>--%>
<%--                                        <td>--%>
<%--                                            <button class="btn btn-primary btn-sm" onclick="editPet(<%= pet.get("id") %>)">Edit</button>--%>
<%--                                            <!-- 注意：这里的editPet函数是未定义的，你需要在JavaScript中定义它，或者通过表单提交来编辑 -->--%>
<%--                                            <button class="btn btn-danger btn-sm" onclick="deletePet(<%= pet.get("id") %>)">Delete</button>--%>
<%--                                        </td>--%>
<%--                                    </tr>--%>
<%--                                    <%--%>
<%--                                        }--%>
<%--                                    } else {--%>
<%--                                    %>--%>
<%--                                    <tr>--%>
<%--                                        <td colspan="7" class="text-center">No pets found.</td>--%>
<%--                                    </tr>--%>
<%--                                    <%--%>
<%--                                        }--%>
<%--                                    %>--%>
<%--                                    </tbody>--%>
                                </table>
                            </div>
                    </div>
                </div>
        </div>
    </div>
</body>