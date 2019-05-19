<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/5/6
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<% String path=request.getContextPath();
   String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Date" %>
<html>
<head>
    <title>编辑学生</title>
</head>
<body>
<h1>修改用户</h1>
<%--<!-- REST-----PUT -->--%>
<form name="studentForm" action="<%=basePath%>updateStudent" method="post">

    <input type="hidden" name="id" value="${student.id}"><br>
    姓名：<input type="text" name="name" value="${student.name}"><br>
    QQ:<input type="text" name="qq" value="${student.qq}"><br>
    学习类型：<input type="text" name="type" value="${student.type}"><br>
    入学时间：<input type="text" name="start_time" value="${student.start_time}"><br>
    毕业院校：<input type="text" name="school" value="${student.school}"><br>
    ID：<input type="text" name="student_id" value="${student.student_id}"><br>
    日报链接：<input type="text" name="link" value="${student.link}"><br>
    愿望：<input type="text" name="wish" value="${student.wish}"><br>
    师兄：<input type="text" name="bro" value="${student.bro}"><br>
    方式：<input type="text" name="way" value="${student.way}"><br>
    更新时间：<input type="text" name="update_time" value="<%=new Date()%>"><br>
    <input type="submit" value="编辑"/>
</form>
</body>
</html>
