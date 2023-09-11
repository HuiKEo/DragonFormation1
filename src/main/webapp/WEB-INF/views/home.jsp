<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: p'c
  Date: 2023/9/11
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录成功！！！</h1>
<div style="align-content: center">
    <div style="height: 200px;width: 100%;background-color: red">
        <%@include file="head.jsp" %>
    </div>
    <div style="height: auto;width: 100%;background-color: skyblue">
        <div style="display: inline-block;height: auto;width: 20%;background-color: aquamarine">
            <%@include file="position.jsp" %>
        </div>
        <div style="display: inline-block;height: 800px;width: 70%;background-color: green">
            <iframe name="woc" frameborder="0"></iframe>
        </div>
    </div>
    <div style="height: 200px;width: 100%;background-color: orange">
        <%@include file="foot.jsp" %>
    </div>
</div>
</body>
</html>
