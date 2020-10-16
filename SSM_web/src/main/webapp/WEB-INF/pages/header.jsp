<%--
  Created by IntelliJ IDEA.
  User: 66666
  Date: 2020/10/9
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!-- 页面头部 -->
<header class="main-header">


    <!-- Logo -->
    <a href="all-admin-index.html" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>数据</b></span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>数据</b>后台管理</span>
    </a>


    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <!-- Messages: style can be found in dropdown.less-->
                <li class="dropdown messages-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" id="newEmailNum">
                        <i class="fa fa-envelope-o"></i>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="header">你有4个邮件</li>
                        <li>
                            <!-- inner menu: contains the actual data -->
                            <ul class="menu" id="showEmail">

                            </ul>
                        </li>
                        <li class="footer"><a href="/email/findAll">See All Messages</a></li>
                    </ul>
                </li>
                <!-- Notifications: style can be found in dropdown.less -->
                <li class="dropdown notifications-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-bell-o"></i>
                        <span class="label label-warning">10</span>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="header">你有10个新消息</li>
                        <li>
                            <!-- inner menu: contains the actual data -->
                            <ul class="menu">
                                <li>
                                    <a href="#">
                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-warning text-yellow"></i> Very long description here that may not
                                        fit into the page and may cause design problems
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-users text-red"></i> 5 new members joined
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-user text-red"></i> You changed your username
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="footer"><a href="#">View all</a></li>
                    </ul>
                </li>
                <!-- Tasks: style can be found in dropdown.less -->
                <li class="dropdown tasks-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-flag-o"></i>
                        <span class="label label-danger">9</span>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="header">你有9个新任务</li>
                        <li>
                            <!-- inner menu: contains the actual data -->
                            <ul class="menu">
                                <li>
                                    <!-- Task item -->
                                    <a href="#">
                                        <h3>
                                            Design some buttons
                                            <small class="pull-right">20%</small>
                                        </h3>
                                        <div class="progress xs">
                                            <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                <span class="sr-only">20% Complete</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <!-- end task item -->
                                <li>
                                    <!-- Task item -->
                                    <a href="#">
                                        <h3>
                                            Create a nice theme
                                            <small class="pull-right">40%</small>
                                        </h3>
                                        <div class="progress xs">
                                            <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                <span class="sr-only">40% Complete</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <!-- end task item -->
                                <li>
                                    <!-- Task item -->
                                    <a href="#">
                                        <h3>
                                            Some task I need to do
                                            <small class="pull-right">60%</small>
                                        </h3>
                                        <div class="progress xs">
                                            <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                <span class="sr-only">60% Complete</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <!-- end task item -->
                                <li>
                                    <!-- Task item -->
                                    <a href="#">
                                        <h3>
                                            Make beautiful transitions
                                            <small class="pull-right">80%</small>
                                        </h3>
                                        <div class="progress xs">
                                            <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                                                <span class="sr-only">80% Complete</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <!-- end task item -->
                            </ul>
                        </li>
                        <li class="footer">
                            <a href="#">View all tasks</a>
                        </li>
                    </ul>
                </li>
                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="../img/user2-160x160.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs">🐷😱</span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">

                            <p>
                                🐷😱 - 数据管理员
                                <small>最后登录 11:20AM</small>
                            </p>
                        </li>
                        <!-- Menu Body
                <li class="user-body">
                    <div class="row">
                        <div class="col-xs-4 text-center">
                            <a href="#">Followers</a>
                        </div>
                        <div class="col-xs-4 text-center">
                            <a href="#">Sales</a>
                        </div>
                        <div class="col-xs-4 text-center">
                            <a href="#">Friends</a>
                        </div>
                    </div>
                </li>-->
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="#" class="btn btn-default btn-flat">修改密码</a>
                            </div>
                            <div class="pull-right">
                                <a href="/logout" class="btn btn-default btn-flat">注销</a>
                            </div>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>
</header>
<!-- 页面头部 /-->

<script>
    function findNewEmailNum(){
        $.ajax({
            url:"/email/findNewEmailNum",
            type:"post",
            success:function (data) {
                //第一次进入页面查询
                if(data != 0 && $("#newEmailNum span")[0] == undefined )
                    $("#newEmailNum").append("<span class='label label-success' id='num'>"+data+"</span>");
                // 在线时查询
                if($("#newEmailNum span")[0] != undefined && $("#num").text()!=data && data != 0)
                    $("#num").text(data);
                // 标记已读后
                if($("#newEmailNum span")[0] != undefined && data == 0)
                    $("#num").remove();
            },
            dataType:"json"
        });
    }

    function findNewEmail(flag){
        if(flag) {
            $.ajax({
                url: "/email/findNewEmail",
                type: "post",
                success: function (data) {
                    if (data.length == 0 || data == null) {
                        $("#showEmail").append("<h4>没有新的消息</h4>");
                    } else {
                        // console.log(data);
                        // console.log(data[0].sendTime);
                        //精确到秒
                        // console.log(Date.parse(new Date()));
                        //精确到毫秒
                        // console.log(new Date().valueOf());
                        // console.log(new Date().getTime());
                        for (var i = 0; i < data.length; i++) {
                            var t = new Date().valueOf() - data[i].sendTime;
                            //秒数
                            var seconds = Math.floor(t / 1000);
                            //分钟
                            var minute = Math.floor(seconds / 60);
                            //小时
                            var hour = Math.floor(minute / 60);
                            //天
                            var day = Math.floor(hour / 24);

                            var str;
                            if (day > 0)
                                str = ' ' + day + ' 天前';
                            if (day == 0 && hour > 0)
                                str = ' ' + hour + ' 小时前';
                            if (day == 0 && hour == 0 && minute > 0)
                                str = ' ' + minute + ' 分钟前';
                            if (day == 0 && hour == 0 && minute == 0)
                                str = ' 刚刚';
                            $("#showEmail").append(
                                '<li>' +
                                '<a href="#">' +
                                '<div class="pull-left">' +
                                ' <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg" class="img-circle" alt="User Image">' +
                                '</div>' +
                                ' <h4>' +
                                 data[i].title+
                                '<small><i class="fa fa-clock-o"></i> ' + str + '</small>' +
                                '</h4>' +
                                '<p>' + data[i].content + '</p>' +
                                '</a>' +
                                '</li>');
                        }
                    }
                },
                dataType: "json"
            });
        }else{
            //清空$("#showEmail")下的所有元素
            $("#showEmail li").remove();
        }
    }

</script>