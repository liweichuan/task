<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<table border="1" width="80%">
    <tr>
        <th>课程编号</th>
        <th>课程名称</th>
        <th>课程价格</th>
        <th>编辑</th>
    </tr>
    <c:forEach items="${courses}" var="course">
        <tr>
            <td>${course.id}</td>
            <td>${course.name}</td>
            <td>${course.price}</td>
            <td>
                <form action="${pageContext.request.contextPath}/getById/${course.id}" method="get">
                    <input type="submit" value="编辑">
                </form>
                &nbsp;&nbsp;
                <form action="${pageContext.request.contextPath}/delete/${course.id}" method="post">
                    <input type="hidden" name="_method" value="DELETE">
                    <input type="submit" value="删除">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
