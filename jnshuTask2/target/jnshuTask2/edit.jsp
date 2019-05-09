<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/5/1
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <form action="${pageContext.request.contextPath}/update" method="post">
           <p>
               课程编号：<input type="text" name="id" value="${course.id}">
           </p>
           <p>
               课程名称：<input type="text" name="name" value="${course.name}">
           </p>
           <p>
               课程价格：<input type="text" name="price" value="${course.price}">
           </p>
           <p>
               <input type="hidden" name="_method" value="PUT">
               <input type="submit" value="提交">
           </p>
       </form>
</body>
</html>
