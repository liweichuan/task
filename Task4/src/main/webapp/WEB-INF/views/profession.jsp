<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--导入jstl标签库--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--定义页面格式--%>
<html>
<head>
    <meta charset="utf-8">
    <title>无标题文档</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" charset="UTF-8">
    <%--    //html meta标签，content指定ie8浏览器，格式utf-8，http-equiv为称/值对提供了名称，把名称值队添加到发送给浏览器的内容头部--%>
    <%--    //Edge 模式通知 Windows Internet Explorer 以最高级别的可用模式显示内容，这实际上破坏了“锁定”模式。即如果你有IE9的话说明你有IE789，那么就调用高版本的那个也就是IE9。--%>
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<%--    导入一个css样式--%>
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<%--    导入两个js--%>
    <link href="${pageContext.request.contextPath}/static/css/t11.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/css/base.css" rel="stylesheet" type="text/css">
<%--    对两个js进行修饰，导入两个css--%>
</head>

<body>
<header>
    <div class="top container">
<%--        创建一个类，头部宽度固定，支持响应式布局--%>
        <p class="hidden-xs">客服热线：010-594-78634</p>
<%--            文字内容：客服热线：010-594-78634--%>
        <img src="${pageContext.request.contextPath}/static/image/12321.gif">
<%--        图片内容--%>
    </div>

    <div role="navigation" class="nav1 navbar navbar-default">
<%--        创建一个类--%>
        <div class="container">
<%--            创建一个类container ，固定宽度，支持响应式布局--%>
            <div class="header-logo">
<%--                创建一个类--%>
                <div class="logo-middle"><img src="${pageContext.request.contextPath}/static/image/logo.png"></div>
<%--                创建一个类接受图片内容--%>
            </div>
            <div class="navbar-header marginTop">
<%--                创建一个类--%>
                <button data-target="#example-navbar-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
<%--                    创建一个类，这里是来存储按钮--%>
                    <span class="sr-only">切换导航</span>
<%--    第一个内容：切换导航--%>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>

            <div id="example-navbar-collapse" class=" collapse navbar-collapse">
<%--                创建一个类--%>
                <ul class="nav navbar-nav">
<%--                    创建一个无序列表--%>
                    <a href="${pageContext.request.contextPath}/home"><li>首 页</li></a>
<%--    第一个内容是首页，链接到home文件。--%>
                    <a href=""><li class="border">职 业</li></a>
<%--    第二个内容：职业--%>
                    <a href=""><li>推 荐</li></a>
<%--    第三个内容：推荐--%>
                    <a href=""><li>关 于</li></a>
<%--                    第四个内容：关于--%>
                </ul>
            </div>
        </div>

    </div>

</header>

<div class="container">
<%--    container类，固定宽度，支持响应式布局--%>
    <div class="nav-title">首页&gt;职业</div>
<%--    创建一个类，接受文字内容：首页&gt;职业--%>
    <div class="nav-bar">
<%--        创建一个类--%>
        <span class="">方向：</span>
<%--    第一个内容为：方向：--%>
        <a class="nav-bar-a a-selected" href="">全部</a>
<%--    第二个内容是：全部--%>
        <a class="nav-bar-a" href="">前端开发</a>
<%--    第三个内容是：前端开发--%>
        <a class="nav-bar-a" href="">后端开发</a>
<%--    第四个内容是：后端开发--%>
        <a class="nav-bar-a" href="">移动开发</a>
<%--    第五个内容是：移动开发--%>
        <a class="nav-bar-a" href="">整站开发</a>
<%--    第六个内容是：整站开发--%>
        <a class="nav-bar-a" href="">运营维护</a>
<%--        第七个内容是：运营维护--%>
    </div>




    <div class="caption">
<%--        创建一个类：caption--%>
        <h4>前端开发方向</h4>
<%--        内容文字：前端开发方向--%>
    </div>

    <div class="row">
<%--        创建一个类--%>
        <c:forEach items="${professionList}" var="profession">
<%--            创建一个表单，接受profession列，每一个都是profession对象--%>
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
<%--                创建一个类，为其模块定义大小--%>
                <div class="warp-border">
<%--                    创建一个类--%>
                    <div class="clearfix">
<%--                        创建一个类--%>
                        <div class="icon-people"><img src="${profession}"></div>
<%--                            创建一个类内容为图片，读取profession.picture--%>
                        <div class="text">
<%--                            创建一个文本类--%>
                            <h4 class="">${profession.name}</h4>
<%--                                先读取profession.name属性--%>
                            <p class="text-present">${profession.introduction}</p>
<%--                                创建一个类，接收profession.introduction简介--%>
                        </div>
                    </div>

                    <div class="warp-class2">
<%--                        创建一个类--%>
                        <div class="warp-class2-text">
<%--                            创建一个类--%>
                            <div class="iconfont text-padding">门槛
<%--                                创建一个类，文字内容：门槛--%>
                                <c:forEach begin="1" end="${profession.sill}">
<%--                                    接着创建一个表单，接收profession.sill内容--%>
                                    <img src="${pageContext.request.contextPath}/static/image/xx.png">
<%--                                    然后是图片内容星星，这里是一个循环--%>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
<%--                            创建一个类--%>
                            <div class="iconfont text-padding text-border-left">难易程度
<%--                                创建一个类，文本内容为：难易程度--%>
                                <c:forEach begin="1" end="${profession.sill}">
<%--                                    创建一个表单，从1开始从profession.sill结束，循环--%>
                                    <img src="../static/image/xx.png">
<%--                                    循环内容为图片。就是星星--%>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="warp-class2">
<%--                        创建一个类--%>
                        <div class="warp-class2-text">
<%--                            创建一个类--%>
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${profession.growth}</span>年</div>
<%--                            创建一个类 文本内容为：成长周期，用来接受profession.growth成长周期--%>
                        </div>
                        <div class="warp-class2-text">
<%--                            创建一个类--%>
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${profession.scarcity}</span>家公司需要</div>
<%--                            创建一个类用来接受 稀缺程度 用来接受 profession.scarcity稀缺程度--%>
                        </div>
                    </div>

                    <div class="warp-class2">
<%--                        创建一个类--%>
                        <div class="leftWarp">
                            薪资待遇
<%--                            创建一个类，用来接受薪资待遇--%>
                        </div>
                        <div class="rightWarp">
<%--                            创建一个类--%>
                            <div class="rightWarp-class">
<%--                                创建一个类--%>
                                <div class="rightWarp-year">0-1年</div>
<%--                                 描述当年限为0-1年时，薪资待遇为profession.salary一个月--%>
                                <div class="rightWarp-wages">${profession.salary}/月</div>
                            </div>
                            <div class="rightWarp-class">
<%--                                创建一个类--%>
                                <div class="rightWarp-year">0-1年</div>
<%--                                     描述当年限为1-3年时，薪资待遇为profession.salary每个月--%>
                                <div class="rightWarp-wages">${profession.salary}/月</div>
                            </div>
                            <div class="rightWarp-class border-bottom">
<%--                                创建一个类--%>
                                <div class="rightWarp-year">3年以上</div>
<%--                                    描述年限为3年以上为profession.salary每个月--%>
                                <div class="rightWarp-wages">${profession.salary}/月</div>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
<%--                        创建一个类--%>
                        <b class="text-b">有${profession.number}人正在学</b>
<%--                        内容为：有profession.number人在学--%>
                    </div>
                    <div class="warp-class2">
<%--                        创建一个类--%>
                        <p class="text-p">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
<%--                        内容为：提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础--%>
                    </div>

                    <div class="flip-container">
<%--                        创建一个类--%>
                        <p class="flip-title">${profession.name}</p>
<%--                            接受职业名字 profession.name--%>
                        <p class="flip-text">${profession.introduction}</p>
<%--                               接受职业简介--%>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

<!--footer-->
<footer class="footer">
<%--    创建一个类--%>
    <div class="container height">
<%--        container类 固定宽度，高度，支持响应式布局--%>
        <div class="row">
<%--            创建一个类--%>
            <div class="text-left col-sm-4">
<%--                创建一个类，定义模块大小--%>
                <span>技能树 &mdash; 改变你我</span>
                <p class="bottom">关于我们 | 联系我们 | 合作企业</p>
<%--                内容为技能树 —改变你我  下面一行：关于我们 | 联系我们 | 合作企业--%>
            </div>
            <div class="text-center col-sm-4">
<%--                创建一个类，定义大小--%>
                <p>旗下网站</p>
<%--                 第一个内容：旗下网站--%>
                <span>草船云孵化器     最强IT特训营</span>
                <span>葡萄藤轻游戏     桌游精灵</span>
<%--                接下来两行：草船云孵化器     最强IT特训营 ；葡萄藤轻游戏     桌游精灵。--%>
            </div>
            <div class="text-right col-sm-4">
<%--                创建一个类  规定大小--%>
                <p>微信公众号</p>
<%--    第一个内容：微信公众号--%>
                <img src="${pageContext.request.contextPath}/static/image/2524.jpg">
<%--                第二个内容为图片--%>
            </div>
        </div>

    </div>

    <div class="footer-bottom">
<%--        创建一个类--%>
        Copyright &copy; 2015技能树 www.jnshu.com  All Rights Reserved | 京ICP
<%--        文字信息： Copyright &copy; 2015技能树 www.jnshu.com  All Rights Reserved | 京ICP--%>
</footer>

</body>
</html>