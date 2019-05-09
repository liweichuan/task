<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/4/29
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%--不禁止在jsp2.0中使用EL语言--%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示数据</title>
</head>
<body>

        <table border="1" width="50%">
            <tr>
                <th>课程编号</th>
                <th>课程名称</th>
                <th>课程价格</th>
                <th>讲师姓名</th>
            </tr>
            <c:forEach var="course" items="${courses}">
                <tr>
                    <td>${course.id}</td>
                    <td>${course.name}</td>
                    <td>${course.price}</td>
                    <td>${course.author.name}</td>
                </tr>
            </c:forEach>
        </table>

</body>
</html>
