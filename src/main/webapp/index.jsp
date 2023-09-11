<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="ThemeBucket">
    <link rel="shortcut icon" href="#" type="image/png">

    <title>登陆</title>

    <link href="css/style.css" rel="stylesheet">
    <!-- 响应式样式 -->
    <link href="css/style-responsive.css" rel="stylesheet">
</head>

<body class="login-body">

<div class="container">

    <form class="form-signin" action="index" method="post">
        <div class="form-signin-heading text-center">
            <h1 class="sign-title">登录</h1>
            <img src="images/login-logo.png" alt=""/>
        </div>
        <div class="login-wrap">
            <input type="text" id="username" name="username" class="form-control" placeholder="用户名" autofocus>
            <input type="password" id="password" name="password" class="form-control" placeholder="密码">

            <button class="btn btn-lg btn-login btn-block" type="submit">
                <i class="fa fa-check"></i>
            </button>

            <div class="registration">
                还没有账号?
                <a class="" href="registration.jsp">
                    去注册
                </a>
            </div>
        </div>
    </form>
</div>



<!-- Placed js at the end of the document so the pages load faster -->

<!-- Placed js at the end of the document so the pages load faster -->
<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/modernizr.min.js"></script>

</body>
</html>

