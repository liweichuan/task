<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/5/4
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<% String path=request.getContextPath();
   String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<%--这里要导入jstl包和standard包--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>学生列表</title>
</head>
<body>
<%--添加用户直接访问toadd方法--%>
<h2><a href="${pageContext.request.contextPath}/toAddStudent">添加用户</a> </h2>
<%--${pageContext.request.contextPath}是绝对路径--%>
<form action="${pageContext.request.contextPath }/findStudent" method="GET">
    <label for="student_id">id：</label>
    <input id="student_id" name="student_id">
    <input type="submit" value="查询"/>
</form>
<table width="100%" border="1">
    <tbody>
    <tr>
        <th>姓名</th>
        <th>QQ</th>
        <th>学习类型</th>
        <th>入学时间</th>
        <th>毕业院校</th>
        <th>学号</th>
        <th>日报链接</th>
        <th>愿望</th>
        <th>师兄</th>
        <th>方式</th>
        <th>表格创建时间</th>
        <th>表格更新时间</th>
    </tr>
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.qq}</td>
            <td>${student.type}</td>
            <td>${student.start_time}</td>
            <td>${student.school}</td>
            <td>${student.student_id}</td>
            <td>${student.link}</td>
            <td>${student.wish}</td>
            <td>${student.bro}</td>
            <td>${student.way}</td>
            <td>${student.create_time}</td>
            <td>${student.update_time}</td>
            <td><a href="${pageContext.request.contextPath}/toUpdateStudent/${student.student_id}">编辑</a></td>
            <td><form action="${pageContext.request.contextPath}/deleteStudent/${student.name}" method="post">
                <input type="hidden" name="_method" value="DELETE">
                <input TYPE="submit" value="删除"></form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
