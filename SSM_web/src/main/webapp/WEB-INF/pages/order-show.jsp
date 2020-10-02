<%--
  Created by IntelliJ IDEA.
  User: 66666
  Date: 2020/9/14
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>数据 - AdminLTE2定制版</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <!-- Tell the browser to be responsive to screen width -->
    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">

    <link rel=“stylesheet”
          href="../../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet"
          href="../../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="../../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="../../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="../../plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="../../plugins/morris/morris.css">
    <link rel="stylesheet"
          href="../../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="../../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="../../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="../../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="../../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="../../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="../../plugins/select2/select2.css">
    <link rel="stylesheet"
          href="../../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="../../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="../../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="../../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="../../css/style.css">
    <link rel="stylesheet"
          href="../../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="../../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="../../plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet"
          href="../../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

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
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-envelope-o"></i>
                            <span class="label label-success">4</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有4个邮件</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <!-- start message -->
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                系统消息
                                                <small><i class="fa fa-clock-o"></i> 5 分钟前</small>
                                            </h4>
                                            <p>欢迎登录系统?</p>
                                        </a>
                                    </li>
                                    <!-- end message -->
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../../img/user3-128x128.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                团队消息
                                                <small><i class="fa fa-clock-o"></i> 2 小时前</small>
                                            </h4>
                                            <p>你有新的任务了</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../../img/user4-128x128.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Developers
                                                <small><i class="fa fa-clock-o"></i> Today</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../../img/user3-128x128.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Sales Department
                                                <small><i class="fa fa-clock-o"></i> Yesterday</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../../img/user4-128x128.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Reviewers
                                                <small><i class="fa fa-clock-o"></i> 2 days</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer"><a href="#">See All Messages</a></li>
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
                            <img src="../../img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <span class="hidden-xs">🐷😱</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="../../img/user2-160x160.jpg" class="img-circle" alt="User Image">

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
                                    <a href="#" class="btn btn-default btn-flat">注销</a>
                                </div>
                            </li>
                        </ul>
                    </li>

                </ul>
            </div>
        </nav>
    </header>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="../../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>🐷😱</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>
            <!-- search form -->
            <!--<form action="#" method="get" class="sidebar-form">
        <div class="input-group">
            <input type="text" name="q" class="form-control" placeholder="搜索...">
            <span class="input-group-btn">
            <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
            </button>
          </span>
        </div>
    </form>-->
            <!-- /.search form -->


            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">菜单</li>

                <li id="admin-index"><a href="index.html"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

                <!-- 菜单 -->



                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-cogs"></i> <span>系统管理</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="admin-login">
                            <a href="all-admin-login.html">
                                <i class="fa fa-circle-o"></i> 用户管理
                            </a>
                        </li>

                        <li id="admin-register">
                            <a href="all-admin-register.html">
                                <i class="fa fa-circle-o"></i> 角色管理
                            </a>
                        </li>

                        <li id="admin-register">
                            <a href="all-admin-register.html">
                                <i class="fa fa-circle-o"></i> 资源权限管理
                            </a>
                        </li>

                        <li id="admin-register">
                            <a href="all-admin-register.html">
                                <i class="fa fa-circle-o"></i> 访问日志
                            </a>
                        </li>

                    </ul>
                </li>



                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-cube"></i> <span>基础数据</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="charts-chartjs">
                            <a href="product.html">
                                <i class="fa fa-circle-o"></i> 产品管理
                            </a>
                        </li>

                        <li id="charts-morris">
                            <a href="all-charts-morris.html">
                                <i class="fa fa-circle-o"></i> 订单管理
                            </a>
                        </li>

                    </ul>
                </li>




            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                订单管理 <small>全部订单</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="all-admin-index.html"><i
                        class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="all-order-manage-list.html">订单管理</a></li>
                <li class="active">订单详情</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content"> <!--订单信息-->
            <div class="panel panel-default">
                <div class="panel-heading">订单信息</div>
                <div class="row data-type">

                    <div class="col-md-2 title">订单编号</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="订单编号"
                               value="${orders.orderNum }" readonly="readonly">
                    </div>

                    <div class="col-md-2 title">下单时间</div>
                    <div class="col-md-4 data">
                        <div class="input-group date">
                            <div class="input-group-addon">
                                <i class="fa fa-calendar"></i>
                            </div>
                            <input type="text" class="form-control pull-right"
                                   id="datepicker-a3" readonly="readonly"
                                   value="${orders.getFormatOrderTime()}">
                        </div>
                    </div>
                    <div class="col-md-2 title">路线名称</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="路线名称"
                               value="${orders.product.productName }" readonly="readonly">
                    </div>

                    <div class="col-md-2 title">出发城市</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="出发城市"
                               value="${orders.product.cityName }" readonly="readonly">
                    </div>

                    <div class="col-md-2 title">出发时间</div>
                    <div class="col-md-4 data">
                        <div class="input-group date">
                            <div class="input-group-addon">
                                <i class="fa fa-calendar"></i>
                            </div>
                            <input type="text" class="form-control pull-right"
                                   id="datepicker-a6" value="${orders.product.getFormatDepartureTime()}"
                                   readonly="readonly">
                        </div>
                    </div>
                    <div class="col-md-2 title">出游人数</div>
                    <div class="col-md-4 data">
                        <input type="text" class="form-control" placeholder="出游人数"
                               value="${orders.peopleCount}" readonly="readonly">
                    </div>

                    <div class="col-md-2 title rowHeight2x">其他信息</div>
                    <div class="col-md-10 data rowHeight2x">
						<textarea class="form-control" rows="3" placeholder="其他信息">
                            ${orders.orderDesc }
                        </textarea>
                    </div>

                </div>
            </div>
            <!--订单信息/--> <!--游客信息-->
            <div class="panel panel-default">
                <div class="panel-heading">游客信息</div>
                <!--数据列表-->
                <table id="dataList"
                       class="table table-bordered table-striped table-hover dataTable">
                    <thead>
                    <tr>
                        <th class="">人群</th>
                        <th class="">姓名</th>
                        <th class="">性别</th>
                        <th class="">手机号码</th>
                        <th class="">证件类型</th>
                        <th class="">证件号码</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="traveller" items="${orders.travellers}">

                        <tr>
                            <td>${traveller.getStringTravellerType()}</td>
                            <td><input type="text" size="10" value="${traveller.name }"
                                       readonly="readonly"></td>
                            <td><input type="text" size="10" value="${traveller.sex }"
                                       readonly="readonly"></td>
                            <td><input type="text" size="20"
                                       value="${traveller.phoneNum }" readonly="readonly"></td>
                            <td><input type="text" size="15"
                                       value="${traveller.getStringCredentialsType()}" readonly="readonly"></td>
                            <td><input type="text" size="28"
                                       value="${traveller.credentialsNum }" readonly="readonly"></td>
                        </tr>
                    </c:forEach>


                    </tbody>
                </table>
                <!--数据列表/-->
            </div>
            <!--游客信息/--> <!--联系人信息-->
            <div class="panel panel-default">
                <div class="panel-heading">联系人信息</div>
                <div class="row data-type">

                    <div class="col-md-2 title">会员</div>
                    <div class="col-md-4 data text">${orders.member.nickname }</div>

                    <div class="col-md-2 title">联系人</div>
                    <div class="col-md-4 data text">${orders.member.name}</div>

                    <div class="col-md-2 title">手机号</div>
                    <div class="col-md-4 data text">${orders.member.phoneNum}</div>

                    <div class="col-md-2 title">邮箱</div>
                    <div class="col-md-4 data text">${orders.member.email}</div>

                </div>
            </div>
            <!--联系人信息/--> <!--费用信息--> <c:if test="${orders.orderStatus==1}">
                <div class="panel panel-default">
                    <div class="panel-heading">费用信息</div>
                    <div class="row data-type">

                        <div class="col-md-2 title">支付方式</div>
                        <div class="col-md-4 data text">在线支付-${orders.getStringPayType()}</div>

                        <div class="col-md-2 title">金额</div>
                        <div class="col-md-4 data text">￥${orders.product.productPrice}</div>

                    </div>
                </div>
            </c:if> <!--费用信息/--> <!--工具栏-->
            <div class="box-tools text-center">

                <button type="button" class="btn bg-default"
                        onclick="history.back(-1);">返回</button>
            </div>
            <!--工具栏/--> </section>
        <!-- 正文区域 /-->


    </div>
    <!-- 内容区域 /-->

    <!-- 底部导航 -->
    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.8
        </div>
        <strong>Copyright &copy; 2014-2017 <a
                href="http://www.itcast.cn">研究院研发部</a>.
        </strong> All rights reserved. </footer>
    <!-- 底部导航 /-->

</div>

<script
        src="../../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="../../plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script
        src="../../plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="../../plugins/raphael/raphael-min.js"></script>
<script
        src="../../plugins/morris/morris.min.js"></script>
<script
        src="../../plugins/sparkline/jquery.sparkline.min.js"></script>
<script
        src="../../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
        src="../../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script
        src="../../plugins/knob/jquery.knob.js"></script>
<script
        src="../../plugins/daterangepicker/moment.min.js"></script>
<script
        src="../../plugins/daterangepicker/daterangepicker.js"></script>
<script
        src="../../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script
        src="../../plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="../../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script
        src="../../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script
        src="../../plugins/fastclick/fastclick.js"></script>
<script
        src="../../plugins/iCheck/icheck.min.js"></script>
<script
        src="../../plugins/adminLTE/js/app.min.js"></script>
<script
        src="../../plugins/treeTable/jquery.treetable.js"></script>
<script
        src="../../plugins/select2/select2.full.min.js"></script>
<script
        src="../../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="../../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script
        src="../../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="../../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script
        src="../../plugins/bootstrap-markdown/js/markdown.js"></script>
<script
        src="../../plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script
        src="../../plugins/ckeditor/ckeditor.js"></script>
<script
        src="../../plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="../../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script
        src="../../plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script
        src="../../plugins/datatables/jquery.dataTables.min.js"></script>
<script
        src="../../plugins/datatables/dataTables.bootstrap.min.js"></script>
<script
        src="../../plugins/chartjs/Chart.min.js"></script>
<script
        src="../../plugins/flot/jquery.flot.min.js"></script>
<script
        src="../../plugins/flot/jquery.flot.resize.min.js"></script>
<script
        src="../../plugins/flot/jquery.flot.pie.min.js"></script>
<script
        src="../../plugins/flot/jquery.flot.categories.min.js"></script>
<script
        src="../../plugins/ionslider/ion.rangeSlider.min.js"></script>
<script
        src="../../plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script
        src="../../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js"></script>

<script>
    $(document).ready(function() {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale : 'zh-CN'
        });
    });

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document).ready(function() {

        // 激活导航位置
        setSidebarActive("order-manage");

        // 列表按钮
        $("#dataList td input[type='checkbox']").iCheck({
            checkboxClass : 'icheckbox_square-blue',
            increaseArea : '20%'
        });
        // 全选操作
        $("#selall").click(function() {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });
    });
</script>
</body>


</html>
