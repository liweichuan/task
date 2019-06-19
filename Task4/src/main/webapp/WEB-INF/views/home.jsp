<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--引入标签库jstl--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--定义页面格式--%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
<%--    //html meta标签，content指定ie8浏览器，格式utf-8，http-equiv为称/值对提供了名称，把名称值队添加到发送给浏览器的内容头部--%>
<%--    //Edge 模式通知 Windows Internet Explorer 以最高级别的可用模式显示内容，这实际上破坏了“锁定”模式。即如果你有IE9的话说明你有IE789，那么就调用高版本的那个也就是IE9。--%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<%-- 不对当前页面进行缩放--%>
    <title>无标题文档</title>
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/css/Untitled-3.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/css/Untitled-1base.css" rel="stylesheet" type="text/css">
<%--    链接了三个css文件--%>
</head>
<body>
<div class="container  hidden-xs">
<%--    container 类用于固定宽度并支持响应式布局的容器--%>
    <div class="row header-top">
<%--        定义行头部高度--%>
        <p class="col-xs-12 col-sm-6 col-md-6 col-lg-6">客服电话:010-594-78634</p>
<%--          定义文字大小， 文字内容：客服电话:010-594-78634--%>
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 text-right">
<%--            定义大小，文本靠右对齐--%>
            <div>
                <a href="#" target="_blank"> <img alt="" src="${pageContext.request.contextPath}/static/image/54537.png"></a>
                <a href="#" target="_blank"><img alt="" src="${pageContext.request.contextPath}/static/image/45678678.png"></a>
                <a href="#" target="_blank"> <img alt="" src="${pageContext.request.contextPath}/static/image/54375483543.png"></a>
<%--                显示三个小图标--%>
            </div>
        </div>
    </div>
</div>

<nav class="navbar navbar-default">
<%--    创建一个类--%>
    <div class="container">
        <%--    container 类用于固定宽度并支持响应式布局的容器--%>
        <div class="navbar-header">
<%--            创建一个类--%>
            <a href="#" class="navbar-brand">
<%--                创建一个类--%>
                <img src="../static/image/logo.png" alt="Brand" class="img-responsive">
<%--                这里读取一张图片，并且给它一个类--%>
            </a>
            <button data-target="#open-nav" data-toggle="collapse" class="navbar-toggle btn-primary collapsed" aria-expanded="false">
<%--                这里定义一个按钮属性--%>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
<%--                给了三个按钮--%>
            </button>
        </div>
        <div id="open-nav" class="navbar-collapse collapse" aria-expanded="false" style="height: 1px;">
<%--            这里对上面的按钮进行填充--%>
            <ul class="nav navbar-nav navbar-right text-center list-inline">
<%--                定义无序列表 居中对齐--%>
                <li><a href="">首页</a></li>
<%--                 第一个选项  首页--%>
                <li><a href="${pageContext.request.contextPath}/profession">职业</a></li>
<%--                 第二个选项   链接到根目录下的profession   文字链接：职业--%>
                <li><a href="">推荐</a></li>
<%--                     第三个选项 推荐--%>
                <li><a href="">关于</a></li>
<%--                      第四个选项    关于--%>
            </ul>
        </div>

    </div>
</nav>

<div id="myCarousel" class="carousel slide">
<%--    创建类--%>
    <ol class="carousel-indicators">
<%--        创建有序列表--%>
        <li class="active" data-slide-to="0" data-target="#myCarousel"></li>
        <li data-slide-to="1" data-target="#myCarousel"></li>
        <li data-slide-to="2" data-target="#myCarousel"></li>
        <li data-slide-to="3" data-target="#myCarousel"></li>
<%--        这是轮播图--%>
    </ol>
    <div class="carousel-inner">
<%--        创建一个类--%>
        <div class="item active">
<%--            定义顺序滚动--%>
            <img alt="First slide" src="${pageContext.request.contextPath}/static/image/547567.jpg">
        </div>
        <div class="item">
            <img alt="Second slide" src="${pageContext.request.contextPath}/static/image/547567.jpg">
        </div>
        <div class="item">
            <img alt="Third slide" src="${pageContext.request.contextPath}/static/image/547567.jpg">
        </div>
        <div class="item">
            <img alt="Third slide" src="${pageContext.request.contextPath}/static/image/547567.jpg">
        </div>
        <a data-slide="prev" href="#myCarousel" class="carousel-control left">
<%--            轮播图左滚--%>
            <i class="icon-left"><img src="${pageContext.request.contextPath}/static/image/54354.png"></i>
        </a>
        <a data-slide="next" href="#myCarousel" class="carousel-control right">
<%--            轮播图右滚--%>
            <i class="icon-right"><img src="${pageContext.request.contextPath}/static/image/4525424.png"></i>
        </a>
    </div>
</div>


<div class="main container">
    <!--第一部分开始-->
    <div class="main-a row">
<%--        定义一个类--%>
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--            定义这个板块的大小--%>
            <div class="row text-center">
<%--                定义行  文字居中对齐--%>
                <ul class="list-unstyled">
<%--                    无序列表 --%>
                    <li class="col-xs-12 up-1">
<%--                       第一个选项 定义大小--%>
                        <img alt="" src="${pageContext.request.contextPath}/static/image/45354312.png">
                    </li>
                    <li class="up-2 col-xs-12">高效</li>
<%--                           第二个选项  文字:高效--%>
                    <li class="up-3 col-xs-12">将三到七年的成长时间,缩短到一年到两年</li>
<%--                           第三个选项 文字定义大小 :将三到七年的成长时间,缩短到一年到两年--%>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--            创建一个类 ,定义这个模块的大小--%>
            <div class="row text-center">
<%--                定义行  居中对齐--%>
                <ul class="list-unstyled">
<%--                    无序列表--%>
                    <li class="col-xs-12 up-1">
<%--                        第一个选项,定义大小 内容为图片--%>
                        <img alt="" src="${pageContext.request.contextPath}/static/image/879789.png">
                    </li>
                    <li class="up-2 col-xs-12">规范</li>
<%--                           第二个选项  定义大小 内容文字:规范 --%>
                    <li class="up-3 col-xs-12">标准到实战教程,不会走弯路</li>
<%--                    第三个选项 定义大小 内容文字:标准到实战教程,不会走弯路--%>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--            创建一个类,定义模块大小--%>
            <div class="row text-center">
<%--                创建一个类 定义行居中对齐--%>
                <ul class="list-unstyled">
<%--                    无序列表 --%>
                    <li class="col-xs-12 up-1">
<%--                        第一个选项 定义大小 内容为图片--%>
                        <img alt="" src="${pageContext.request.contextPath}/static/image/786453654365.png">
                    </li>
                    <li class="up-2 col-xs-12">人脉</li>
<%--                            第二个选项  定义大小 内容为:人脉--%>
                    <li class="up-3 col-xs-12">同班好友,同院学长,技术大师,入学就混职脉圈,为以后铺平道路</li>
<%--                    第三个选项  定义大小  内容为文字:同班好友,同院学长,技术大师,入学就混职脉圈,为以后铺平道路--%>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 text-center">
<%--            创建一个类 定义模块大小 居中对齐--%>
            <p>
                <img src="${pageContext.request.contextPath}/static/image/453254312.png">${count}<br>
<%--                图像旁边接着一个变量count--%>
                <span class="up-3">累计在线学习人数</span>
<%--                下一行是span标签 内容为 :累计在线学习人数--%>
            </p>
            <p>
                <img src="${pageContext.request.contextPath}/static/image/453254312.png">${number}<br>
<%--                图像属性 旁边接着变量number--%>
                <span class="up-3">学员已经找到满意工作</span>
<%--                接着是span属性 内容为:学员已经找到满意工作--%>
            </p>
        </div>
    </div>

    <!--第二部分开始-->
    <div class="main-b row">
<%--        创建一个类--%>
        <h3 class="text-center main-tab">如何学习</h3>
<%--              创建一个类  居中对齐  内容:如何学习--%>
        <ul class="list-unstyled text-center">
<%--            无序列表 居中对齐--%>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                第一个选项 定义大小 --%>
                <span class="up-1 text-center">1</span>
<%--                   第一个类 居中对齐 内容文字：1--%>
                <p class="up-2">匹配你现在的个人情况寻找适合自己的岗位</p>
<%--                      第二个类  文字内容：匹配你现在的个人情况寻找适合自己的岗位--%>
                <span class="up-3"></span>
<%--                      第三个类   --%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                第二个选项 定义大小--%>
                <span class="up-1 text-center">2</span>
<%--                 第一个类 居中对齐 文字内容：2--%>
                <p class="up-2">了解职业前景薪金待遇，竞争压力等</p>
<%--                     第二个类 文字内容：了解职业前景薪金待遇，竞争压力等--%>
                <span class="up-3"></span>
<%--                     第三个类       --%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                第三个选项  定义大小--%>
                <span class="up-1 text-center">3</span>
<%--                   第一个类   居中对齐  文字内容：3--%>
                <p class="up-2">掌握行业内顶级技能</p>
<%--                       第二个类   文字内容 ：掌握行业内顶级技能--%>
                <span class="up-3"></span>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                第四个选项 定义大小--%>
                <span class="up-1 text-center">4</span>
<%--                     第一个类 居中对齐 文字内容：4--%>
                <p class="up-2">查看职业目标任务</p>
<%--                         第二个类  文字内容：查看职业目标任务--%>
                <span class="up-3"></span>
<%--                          第三个类--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                       第五个选项  定义大小--%>
                <span class="up-1 text-center">5</span>
<%--                 第一个 类  文字内容 居中对齐：5--%>
                <p class="up-2">参考学习资料，掌握技能点，逐个完成任务</p>
<%--                     第二个类  文字内容：参考学习资料，掌握技能点，逐个完成任务--%>
                <span class="up-3"></span>
<%--                第三个类--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                     第六个选项  定义大小--%>
                <span class="up-1 text-center">6</span>
<%--                     第一个类  居中对齐 文字内容：6--%>
                <p class="up-2">加入班级，和小伙伴们互帮互动，一块学习</p>
<%--                         第二个类 文字内容：加入班级，和小伙伴们互帮互动，一块学习--%>
                <span class="up-3"></span>
<%--                         第三个类--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                       第七个选项 定义大小--%>
                <span class="up-1 text-center">7</span>
<%--                          第一个类 居中对齐 文字内容：7--%>
                <p class="up-2">选择导师，一路引导，加速自己成长</p>
<%--                              第二个类  文字内容 ：选择导师，一路引导，加速自己成长--%>
                <span class="up-3"></span>
<%--                               第三个类--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                   第八个选项  定义大小--%>
                <span class="up-1 text-center">8</span>
<%--                       第一个类 居中对齐 文字内容：8--%>
                <p class="up-2">完成职业 技能，升级业界大牛</p>
<%--                         第二个类 文字内容：完成职业 技能，升级业界大牛--%>
                <span class="up-3 invisible"></span>
<%--                             第三个类--%>
            </li>
        </ul>
    </div>

    <!--第三部分开始-->
    <div class="main-c row">
<%--        创建类--%>
        <h3 class="text-center main-tab">优秀学员展示</h3>
<%--            创建一个类  居中对齐   文字内容：优秀学员展示--%>
        <c:forEach items="${studentList}" var="student" >
<%--            创建一个表单  读取studentList变量，其中的每一个对象都是student--%>
            <ul class="list-unstyled text-center" style="margin: 0;">
<%--                创建一个无序列表  居中对齐--%>
                <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
<%--                    第一个选项 定义大小--%>
                    <div>
                        <img src="${student.picture}">
<%--                        第一部分为图像,属性读取的student.picture--%>
                        <span>${student.name}</span>
<%--                        第二部分为文字,读取的student.name--%>
                        <p class="text-left">${student.company}${student.job}:${student.expreience}</p>
<%--                        第三部分为文字,靠左对齐,读取的student.company,student.job和student.expreience--%>
                    </div>
                </li>
            </ul>
        </c:forEach>
    </div>


    <!--第四部分开始-->
    <div class="row main-bottom">
<%--        创建一个类--%>
        <h3 class="text-center">战略合作企业</h3>
<%--    创建一个类  居中对齐  文字内容:战略合作企业--%>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
<%--            创建一个类   分配大小--%>
            <ul class="logo">
<%--                无序列表 --%>
                <li>
                    <a href=""><img src="${pageContext.request.contextPath}/static/image/123132.png"></a>
<%--                    第一个选项 图片内容--%>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/static/image/1549865.png"></a>
<%--                    第二个选项    图片内容--%>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/static/image/785345.png"></a>
<%--                    第三个选项  图片内容--%>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/static/image/1471.png"></a>
<%--                    第四个选项 图片内容--%>
                </li>
                <li>
                    <a href="">  <img src="${pageContext.request.contextPath}/static/image/7861.png"></a>
<%--                    第五个选项 图片内容--%>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="main-e">
<%--    创建一个类--%>
    <h3 class="text-center main-tab ">友情链接</h3>
<%--    创建一个类 居中对齐 文字内容:友情链接--%>
    <div class="container">
<%--        container类  用于固定宽度和响应式布局--%>
        <ul class="text-justify">
<%--            创建一个无序列表类--%>
            <li><a href="#">手机软件</a></li>
<%--              第一个选项：手机软件--%>
            <li><a href="#">教师招聘</a></li>
<%--    第二个选项    ：教师招聘--%>
            <li><a href="#">找工作</a></li>
<%--    第三个选项：找工作--%>
            <li><a href="#">教师招聘</a></li>
<%--    第四个选项 ：教师招聘--%>
            <li><a href="#">找工作</a></li>
<%--    第五个选项  ：找工作--%>
            <li><a href="#">手机软件</a></li>
<%--    第六个选项 ：手机软件--%>
            <li><a href="#">教师招聘</a></li>
<%--    第七个选项  ：教师招聘--%>
            <li><a href="#">手机软件</a></li>
<%--    第八个选项 ：手机软件--%>
            <li><a href="#">手机软件</a></li>
<%--    第九个选项：手机软件--%>
            <li><a href="#">找工作</a></li>
<%--    第十个选项：找工作--%>
            <li><a href="#">手机软件</a></li>
<%--    第十一个选项：手机软件--%>
            <li><a href="#">教师招聘</a></li>
<%--    第十二个选项：教师招聘--%>
            <li><a href="#">找工作</a></li>
<%--    第十三个选项：找工作--%>
            <li><a href="#">教师招聘</a></li>
<%--    第十四个选项：教师招聘--%>
            <li><a href="#">找工作</a></li>
<%--    第十五个选项：找工作--%>
            <li><a href="#">手机软件</a></li>
<%--    第十六个选项：手机软件--%>
            <li><a href="#">教师招聘</a></li>
<%--    第十七个选项：教师招聘--%>
            <li><a href="#">手机软件</a></li>
<%--    第十八个选项：手机软件--%>
            <li><a href="#">手机软件</a></li>
<%--    第十九个选项：手机软件--%>
            <li><a href="#">找工作</a></li>
<%--            第二十个选项：找工作--%>
        </ul>
    </div>
</div>

<div class="footer">
<%--    创建一个类，脚部--%>
    <div class="container">
<%--        container类固定宽度，并响应式布局--%>
        <div class="row">
<%--            创建一个类--%>
            <div class="col-xs-12 col-sm-4 col-md-5 col-lg-5 up-1">
<%--                创建一个类  配置模块大小--%>
                <p><a>技能树-改变你我</a></p>
<%--    内容文字：技能树-改变你我--%>
                <p><a href="#">关于我们 </a>|<a href="#"> 联系我们 </a>|<a href="#"> 合作企业 </a></p>
<%--                内容文字：关于我们  联系我们   合作企业--%>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-5 col-lg-5 up-2">
<%--                创建一个类  定义模块大小--%>
                <p>旗下网站</p>
<%--                 文字内容：旗下网站--%>
                <ul class="list-inline">
<%--                    创建一个无序列表类--%>
                    <li><a href="#">草船云孵化器</a></li>
<%--    第一个选项：草船云孵化器--%>
                    <li><a href="#">最强IT特训营</a><br></li>
<%--                    第二个选项:最强IT特训营--%>
                </ul>
                <ul class="list-inline">
<%--                    创建一个无序列表类--%>
                    <li><a href="#">葡萄藤轻游戏</a></li>
<%--    第一个选项：葡萄藤轻游戏--%>
                    <li><a href="#">桌游精灵</a></li>
<%--                    第二个选项：桌游精灵--%>
                </ul>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-2 col-lg-2 up-3">
<%--                创建一个类，定义大小--%>
                <p>微信公众平台</p>
<%--    第一条文字内容：微信公众平台--%>
                <img alt="" src="${pageContext.request.contextPath}/static/image/2524.jpg">
<%--                第二个内容：图片--%>
            </div>
        </div>
    </div>
    <div class="container-fluid text-center">
<%--        创建一个类 居中对齐--%>
        <p>Copyright © 2015 北京葡萄藤信息技术有限公司 All Rights Reserved | 京ICP备15035574号-1</p>
<%--        内容：Copyright © 2015 北京葡萄藤信息技术有限公司 All Rights Reserved | 京ICP备15035574号-1--%>
    </div>
</div>
<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<%--两个图片--%>
</body>
</html>