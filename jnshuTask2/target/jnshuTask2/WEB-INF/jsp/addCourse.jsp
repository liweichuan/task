<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/4/29
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/ html; charset=utf-8">
    <title>添加课程</title>
</head>
<body>
<form action="pojoType" method="post">
    <p>
        课程编号：<input type="text" name="id">
    </p>
    <p>
        课程名称：<input type="text" name="name">
    </p>
    <p>
        课程价格：<input type="text" name="price">
    </p>
    <p>
        讲师姓名：<input type="text" name="author.name">
    </p>
    <p>
        <input type="submit" value="提交">
    </p>
</form>
</body>
</html>
