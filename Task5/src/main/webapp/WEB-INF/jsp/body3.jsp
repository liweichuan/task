<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<center>
<div class="container-fluid">
    <div class="row cb-slideshow-text-container ">
        <div class="tm-content col-xl-6 col-sm-8 col-xs-8 ml-auto section">
            <header class="mb-5"><h1 style="color:red">登录</h1></header>


            <form action="${pageContext.request.contextPath}/login" method="post" class="subscribe-form">
                <div class="row form-section">

                    <table border="0">
                        <tr>
                            <td>用户名：</td>
                            <td>
                                <label>
                                <input type="text" name="userName" />
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td>密码：</td>
                            <td>
                                <label>
                                   <input type="password" name="passWord" />
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <br>
                                <div align="center">
                                <input type="submit"  value="登录" style="color:#BC8F8F"/>
                                <input type="submit" value="注册" href="${pageContext.request.contextPath}/login/1" style="color:#BC8F8F">
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>
            </form>
        </div>
    </div>
</div>
</center>