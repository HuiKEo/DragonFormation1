<%--
  Created by IntelliJ IDEA.
  User: p'c
  Date: 2023/9/11
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login Page</h1>
<form action="index" method="post">
    <label for="username">用户名:</label>
    <input type="text" id="username" name="username"><br><br>
    <label for="password">密码:</label>
    <input type="password" id="password" name="password"><br><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
