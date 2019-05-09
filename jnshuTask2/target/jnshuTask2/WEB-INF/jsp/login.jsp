<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/4/28
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%--内容是text文本，html格式，排版是UTF-8,语言是java--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--不禁止jsp2.0中使用EL语言--%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login"method="post">
    <p>
        用户名：<input type="text" name="uname">
    </p>
    <p>
        密码：<input type="password" name="upwd">
    </p>
    <p>
        <input type="submit" value="登录">
    </p>
</form>
</body>
</html>

