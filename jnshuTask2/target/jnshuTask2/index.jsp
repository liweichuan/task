<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<body>
<h2>访问查询所有</h2>
<td><form action="${pageContext.request.contextPath}/findAllStudent" method="get">
    <input TYPE="submit" value="查询所有"></form>
</td>
</body>
</html>
