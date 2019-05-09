<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/5/1
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--允许jsp2.0使用EL语言--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>添加课程</title>
</head>
<body>
<h1>添加课程</h1>
<hr>
<form action="${pageContext.request.contextPath}/add" method="post">
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
        <input type="submit" value="提交">
    </p>
</form>
</body>
</html>
