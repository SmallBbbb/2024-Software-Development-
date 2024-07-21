<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap-theme.min.css">
    <script type="text/javascript" src="../bootstrap/jQuery-3.6.0/jquery.js"></script>
    <script type="text/javascript" src="user_js/3_pet_adopt.js"></script>
    <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="user_js/3_pet_adopt.js"></script>
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
    <title>宠物领养</title>
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
                <form action="adopt">
                    <div class="form-group">
                        <label for="petId">宠物编号</label>
                        <input type="number" class="form-control" id="petId" name="petId" placeholder="输入编号">
                    </div>
                    <div class="form-group">
                        <label for="adopter" class="form-label">领养人</label>
                        <input type="text" class="form-control" id="adopter" name="adopter" placeholder="请输入领养人姓名">
                    </div>
                    <div class="form-group">
                        <label for="homeAddress" class="form-label">家庭住址</label>
                        <input type="text" class="form-control" id="homeAddress" name="homeAddress" placeholder="请输入家庭住址">
                    </div>
                    <div class="form-group">
                        <label for="phoneNumber" class="form-label">手机号</label>
                        <input type="text" class="form-control" id="phoneNumber" name="phone-number" placeholder="请输入手机号">
                    </div>
                    <div class="form-group">
                        <label for="adoptionExperience" class="form-label">是否有领养经历</label>
                        <select class="form-select" id="adoptionExperience" name="adoption-before">
                            <option value="yes">是</option>
                            <option value="no">否</option>
                        </select>
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
    <!-- 触发模态框的按钮 -->
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
        我要领养
    </button>
    <div class="container mt-5">
        <h1 class="mb-4">宠物领养信息列表</h1>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col">宠物编号</th>
                <th scope="col">宠物类别</th>
                <th scope="col">品种</th>
                <th scope="col">年龄</th>
                <th scope="col">健康状况</th>
                <th scope="col">性格</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="pet" items="${pets}">
                <tr>
                    <th scope="row">${pet.id}</th>
                    <td>${pet.category}</td>
                    <td>${pet.breed}</td>
                    <td>${pet.age}</td>
                    <td>${pet.healthStatus}</td>
                    <td>${pet.temperament}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>