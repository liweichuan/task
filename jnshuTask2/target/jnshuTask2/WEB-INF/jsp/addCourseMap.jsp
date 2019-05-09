<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/4/30
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
         <form action="mapType" method="post">
             <p>
                 课程1编号：<input type="text" name="courses['one'].id">
             </p>
             <p>
                 课程1名称：<input type="text" name="courses['one'].name">
             </p>
             <p>
                 课程1价格：<input type="text" name="courses['one'].price">
             </p>
             <p>
                 讲师姓名：<input type="text" name="courses['one'].author.name">
             </p>
             <hr>
             <p>
                 课程2编号：<input type="text" name="courses['two'].id">
             </p>
             <p>
                 课程2名称：<input type="text" name="courses['two'].name">
             </p>
             <p>
                 课程2价格：<input type="text" name="courses['two'].price">
             </p>
             <p>
                 讲师姓名：<input type="text" name="courses['two'].author.name">
             </p>
             <p>
                 <input type="submit" value="提交">
             </p>
         </form>

</body>
</html>
