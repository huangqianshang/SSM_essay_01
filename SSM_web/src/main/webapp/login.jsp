<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>数据 - AdminLTE2定制版 | Log in</title>

    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <link rel="shortcut icon" href="#" />
    <link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="plugins/iCheck/square/blue.css">
    <!-- jQuery 2.2.3 -->
    <!-- Bootstrap 3.3.6 -->
    <!-- iCheck -->
    <script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="plugins/iCheck/icheck.min.js"></script>
    <script>
        $(function() {
            $('input').iCheck({
                checkboxClass : 'icheckbox_square-blue',
                radioClass : 'iradio_square-blue',
                increaseArea : '20%' // optional
            });

            var name = document.getElementById("username");
            var pswd = document.getElementById("password");
            var rember = document.getElementById("rember");
            var dl = document.getElementById("dl");
            //页面初始化时，如果帐号密码cookie存在则填充
            if(getCookie('username')&& getCookie('password')){
                name.value = getCookie('username');
                pswd.value = getCookie('password');
                rember.checked = true;
                $('input').iCheck({
                    checkboxClass : 'icheckbox_square-blue',
                    radioClass : 'iradio_square-blue',
                    increaseArea : '20%', // optional
                    rember:'checked',
                });

            }
            //表单提交事件触发时，如果复选框是勾选状态则保存cookie
            dl.onsubmit =function(){
                if(rember.checked){
                    setCookie('username',name.value,7); //保存帐号到cookie，有效期7天
                    setCookie('password',pswd.value,7); //保存密码到cookie，有效期7天
                }else{
                    delCookie('username');
                    delCookie('password');
                }
            }
        });

        //设置cookie
        function setCookie(name,value,day){
            var date = new Date();
            date.setDate(date.getDate() + day);
            document.cookie = name + '=' + value + ';expires='+ date;
        };

        //获取cookie
        function getCookie(name){
            var reg = RegExp(name+'=([^;]+)');
            var arr = document.cookie.match(reg);
            if(arr){
                return arr[1];
            }else{
                return '';
            }
        };

        //删除cookie
        function delCookie(name){
            setCookie(name,null,-1);
        }
    </script>
</head>

<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="all-admin-index.html"><b>旅游</b>后台管理系统</a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">登录系统</p>

        <form action="/login" method="post" id="dl">
            <div class="form-group has-feedback">
                <input type="text" name="username" class="form-control" id="username"
                       placeholder="用户名"> <span
                    class="glyphicon glyphicon-envelope form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" name="password" class="form-control" id="password"
                       placeholder="密码"> <span
                    class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label><input type="checkbox" id="rember" > 记住 下次自动登录</label>
                    </div>
                </div>
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <!-- /.col -->
            </div>
        </form>

    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

</body>

</html>