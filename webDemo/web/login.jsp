<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/7/25
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <div>
        <form action="/login.do" method="post">
            用户名:<input type="text" name="username" placeholder="请输入账户名称">
            <br>
            密码：<input type="password" name="password" placeholder="请输入密码">
            <br>
            <input type="submit" value=" 登录">
        </form>

    </div>
</body>
</html>
