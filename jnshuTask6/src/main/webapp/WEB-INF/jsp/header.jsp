<%@ page language="java" pageEncoding="UTF-8"%>
<%--//指定页面的格式--%>
<div class="container  hidden-xs">
<%--    //html div标签，用来给页面加样式， class=“container” container 类用于固定宽度并支持响应式布局的容器--%>
<%--    //hidden-xs 针对不同尺寸屏幕隐藏或显示内容。--%>
    <div class="row header-top">
<%--     //行元素， header-top头部固定定位--%>
        <p class="col-xs-12 col-sm-6 col-md-6 col-lg-6">客服电话:010-594-78634</p>
<%--        //元素信息 col-xs- 超小屏幕，手机（<768px）col-sm- 小屏幕，平板(>=768px)--%>
<%--        //col-md-中等屏幕，桌面显示器（>=992px）col-lg- 大屏幕（>=1200px） 这个样式的信息为客服电话:010-594-78634--%>
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 text-right">
<%--            //text-right  设置内部元素右对齐--%>
            <div>
                <a class="message-color" ng-click="UserLogout();conn.close();" href="${pageContext.request.contextPath}/login/0" style="color: black">登录</a>
                <span class="header-dot-333 ng-scope" ng-if="selfData.nick">|</span>
                <a class="message-color" ng-click="UserLogout();conn.close();" href="${pageContext.request.contextPath}/login/1" style="color: black">注册</a>
                <span class="header-dot-333 ng-scope" ng-if="selfData.nick">|</span>
                <a class="message-color" ng-click="UserLogout();conn.close();" href="${pageContext.request.contextPath}/loginOut" style="color: black">退出</a>

                <a href="#" target="_blank"> <img alt=""  src="${pageContext.request.contextPath}/static/image/54537.png"></a>
                <a href="#" target="_blank"><img alt=""  src="${pageContext.request.contextPath}/static/image/45678678.png"></a>
                <a href="#" target="_blank"> <img alt=""  src="${pageContext.request.contextPath}/static/image/54375483543.png"></a>
<%--            显示三个小图标--%>
            </div>
        </div>
    </div>
</div>