<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="admin_js/1_ad_account.js"></script>
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
             background-color: rgba(28, 118, 140, 0.59);
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
    <title>账号管理</title>
</head>
<body>

<!-- 模态框1 -->
<div class="modal fade" id="pass" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="myModalLabel">通过注册申请</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="userPass">
                    <div class="form-group">
                        <label for="passUserIdNumber">申请用户身份证号</label>
                        <input type="number" class="form-control" id="passUserIdNumber" name="passUserIdNumber" placeholder="输入用户身份证号">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                <input type="submit" class="btn btn-primary" value="提交">
            </div>
        </div>
    </div>
</div>

<!-- 模态框2 -->
<div class="modal fade" id="ban" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="editLabel">封禁用户账号</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="userBan">
                    <div class="form-group">
                        <label for="banUserIdNumber">用户身份证号</label>
                        <input type="number" class="form-control" id="banUserIdNumber" name="banUserIdNumber" placeholder="输入用户身份证号">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                <input type="submit" class="btn btn-primary" value="提交">
            </div>
        </div>
    </div>
</div>
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
                    <form class="form" action="userConsult"><b style="font-size: large;">账号</b>
                        <label>
                            <input type="text" id="userConsult" name="userConsult" placeholder="请输入查询用户账号" />
                        </label>
                        <input type="submit" class="btn btn-primary" value="查询">
                        <!-- 触发模态框的按钮 -->
                        <button type="button" class="btn" data-toggle="modal" data-target="#pass">
                            通过
                        </button>
                        <!-- 触发模态框的按钮 -->
                        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#ban">
                            封禁
                        </button>
                    </form>
                </div></div>
 <%--    账户动态表格--%>
                <div class="row">
                    <div class="col-sm-11 col-md-11 col-xs-11 col-lg-11">
<%--     动态表格块--%>
    <div class="container mt-5" id="table">
        <h2>账户信息表</h2>
        <table class="table table-bordered" style="text-align: center;">
            <thead>
            <tr>
                <th>用户名</th>
                <th>密码</th>
                <th>真实姓名</th>
                <th>性别</th>
                <th>身份证号</th>
                <th>电话号码</th>
                <th>邮箱</th>
                <th>昵称</th>
                <th>年龄</th>
                <th>是否为志愿者</th>
            </tr>
            </thead>
<%--            <tbody>--%>
<%--            <c:forEach var="account" items="${accounts}">--%>
<%--                <tr>--%>
<%--                    <th scope="row">${account.account_id}</th>--%>
<%--                    <td>${account.nickname}</td>--%>
<%--                    <td>${account.real_name}</td>--%>
<%--                    <td>${account.phone}</td>--%>
<%--                    <td>${account.is_volunteer ? '是' : '否'}</td>--%>
<%--                    <td>${account.account_status}</td>--%>
<%--                    <td>${account.gender == 'M' ? '男' : (account.gender == 'F' ? '女' : '未知')}</td>--%>
<%--                    <td>--%>
<%--                        <!-- 查看按钮 -->--%>
<%--                        <button type="button" class="btn btn-info btn-sm">通过</button>--%>
<%--                        <!-- 删除按钮，这里可能需要一个表单或Ajax调用来实现删除操作 -->--%>
<%--                        <form action="banAccount" method="post" style="display:inline;">--%>
<%--                            <input type="hidden" name="accountId" value="${account.account_id}">--%>
<%--                            <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('确定要封禁这个账户吗？');">删除</button>--%>
<%--                        </form>--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>
            </tbody>
        </table>
    </div>
                    </div>
            </div>
        </div>
    </div>
</body>