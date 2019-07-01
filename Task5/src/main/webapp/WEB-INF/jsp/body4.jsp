<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<center>
<div class="container-fluid">
    <div class="row cb-slideshow-text-container ">
        <div class="tm-content col-xl-6 col-sm-8 col-xs-8 ml-auto section">
            <header class="mb-5"><h1>注册界面</h1></header>


            <form action="${pageContext.request.contextPath}/register" method="post" class="subscribe-form">
                <div class="row form-section">
                    <table>
                        <tr>
                            <td>用户名：</td>
                            <td><label>
                                <input type="text" name="userName" />
                            </label>
                            </td>
                        </tr>
                        <tr>
                            <td>密码：</td>
                            <td><label>
                                <input type="password" name="passWord" />
                            </label>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <br>
                                <div align="center">
                                <input type="submit" value="注册" style="color:#BC8F8F">
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