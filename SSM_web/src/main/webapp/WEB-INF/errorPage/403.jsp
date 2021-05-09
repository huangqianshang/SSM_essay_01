<%--
  Created by IntelliJ IDEA.
  User: 66666
  Date: 2020/9/16
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>权限不足</title>
</head>
<style>
    body{
        margin:0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-content: center;
        min-height: 100vh;
        background: #060c21;
        font-family: sans-serif;
    }
    .box{
        width:400px;
        height:500px;
        /*position: relative;*/
        display: flex;
        justify-content: center;
        align-items: center;
        background: #060c21;
        transition: 7s;
        top:40%;
        left:43%;
        position: absolute;
        margin-top:-100px;
        margin-left:-100px;
        /* transform: rotateY(360deg);
        -webkit-transform: rotateY(360deg);
        -moz-transform: rotateY(360deg); */
        /* background: linear-gradient(235deg,#89ff00,#060c21,#676767,#00bcd4); */
    }
    .box::before{
        content: '';
        position: absolute;
        top: -2px;
        left: -2px;
        right: -2px;
        bottom: -2px;
        background: #fff;
        z-index: -1;
    }
    .box::after{
        content: '';
        position: absolute;
        top: -2px;
        left: -2px;
        right: -2px;
        bottom: -2px;
        background: #fff;
        z-index: -2;
        filter: blur(40px);
    }
    .box::before,
    .box::after{
        background: linear-gradient(235deg,#89ff00,#060c21,#00bcd4);
    }
    .content{
        padding: 20px;
        box-sizing: border-box;
        color: #fff;
        transition: 7s;
    }
</style>
<script>
    window.onload = function(){
      var box = document.getElementsByClassName("box");
        box[0].onclick = function () {
          history.back(-1);
      }
    };
</script>
<body>
<div class = "box">
    <div class = "content">
<%--        <p style="text-align: center;font-size: 40px;height: 100%;font-weight: bold;">403</p>--%>
        <h1 style="text-align: center;">权限不足，</h1>
        <h1>请找管理员升级权限</h1>
        <h1 style="text-align: center">点此返回</h1>
    </div>
</div>
</body>
</html>
