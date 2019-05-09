<%--
  Created by IntelliJ IDEA.
  User: liweichuan
  Date: 2019/4/30
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>绑定JSON数据</title>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(function() {
            var course = {
                "id": "8",
                "name": "SSM框架整合",
                "price": "200"
            };
            $.ajax({
                url:"jsonType",
                data:JSON.stringify(course),
                type:"post",
                contentType:"application/json;charset=UTF-8",
                dataType:"json",
                success:function (data) {
                    alert(data.name+"---"+data.price);
                }
            })
        });
    </script>
</head>
<body>

</body>
</html>
