<%--
  Created by IntelliJ IDEA.
  User: p'c
  Date: 2023/9/11
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:if test="${list.position==1}">
    我是运营厂商管理人员
    <ul>
        <li><a href="https://www.baidu.com" target="woc">管理员业务一</a></li>
        <li>管理员业务二</li>
    </ul>
</c:if>
<c:if test="${list.position==2}">
    我是车间管理人员
    <ul>
        <li>库房业务</li>
    </ul>
</c:if>
<c:if test="${list.position==3}">
    我是库房管理人员
    <ul>
        <li>1</li>
        <li>2</li>
        <li>3</li>
        <li>4</li>
    </ul>
</c:if>
<c:if test="${list.position==4}">
    我是司机
    <ul>
        <li>1</li>
        <li>2</li>
        <li>3</li>
        <li>4</li>
    </ul>
</c:if>
