<%--
  Created by IntelliJ IDEA.
  User: lhql
  Date: 2018-12-29
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"/"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>

    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/respond.min.js"></script>
    <![endif]-->
    <link href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>客户资源管理系统</title>
    <style type="text/css">
        .code_pic{
            display: block;
            width:40%;
            height:45px;
            background-color: #7EC4CC;
            color:#FFF;
            position: absolute;
            top: 0px;
            left:45%;
            border-radius: 5px;
            text-align: center;
        }
    </style>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header" style="opacity:0.3;"></div>
<div class="loginWraper" >
    <%----%>
    <div id="loginform" class="loginBox" style="border-radius:10px;">
        <form class="form form-horizontal" action="${pageContext.request.contextPath}/User/checkLogin" method="post"> <!--index.html-->
            <%--<div id="msg" style="text-align: center;color: red">${msg}</div>--%>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                <div class="formControls col-xs-8">
                    <input id="username" name="username" type="text" placeholder="账户" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                <div class="formControls col-xs-8">
                    <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
                </div>
            </div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input id="t1" class="input-text size-L" type="text" placeholder="验证码" style="width:150px;">
                    <span id="discode" class="code_pic" onclick="createCode()" style="font-size: 20px"></span>
                </div>
            </div>

            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="" type="submit" onclick="return check()" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                </div>
            </div>
        </form>
    </div>
</div>

<div id="modal-demo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content radius">
            <div class="modal-header">
                <h3 class="modal-title" style="color: #00B83F">提示</h3>
                <a class="close" data-dismiss="modal" aria-hidden="true" href="javascript:void();">×</a>
            </div>
            <div class="modal-body">
                <p id="msg1" style="color: red">抱歉您没有权限</p>
            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" data-dismiss="modal" aria-hidden="true">确定</button>
                <!--<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>-->
            </div>
        </div>
    </div>
</div>


<div class="footer" style="opacity:0.3;"><span style="color:white">Copyright &copy 2018-2019<span></div>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>

<script type="text/javascript">
    var code; //在全局 定义验证码
    function createCode()
    {
        //创建验证码函数
        code = "";
        var codeLength =4;//验证码的长度
        var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k',
            'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');//所有候选组成验证码的字符，当然也可以用中文的
        for(var i=0;i<codeLength;i++)
        {
            var charIndex =Math.floor(Math.random()*36);
            code +=selectChar[charIndex];
        }
        // 设置验证码的显示样式，并显示
        document.getElementById("discode").style.fontFamily="Fixedsys"; //设置字体
        document.getElementById("discode").style.letterSpacing="5px"; //字体间距
        document.getElementById("discode").style.color="#0ab000"; //字体颜色
        document.getElementById("discode").innerHTML=code; // 显示
    }

    function check() {

        if($("#username").val() == '' || $("#username").val() == null || $("#password").val() == '' || $("#password").val() == null ){
            $("#msg1").text("用户名和密码不能为空")
            $("#modal-demo").modal("show");
            return false;
        }else {
            //验证验证码输入是否正确
            var val1 = document.getElementById("t1").value;
            var val2 = code;
            if (val1.toLowerCase() != val2) {
                $("#msg1").text("验证码输入有误,请重新输入!")
                $("#modal-demo").modal("show");
                // alert("验证码输入有误!");
                document.getElementById('t1').value = "";
                return false;
            }else {
                return true;
            }
        }
    }

    $(function(){
        createCode();
    });

    $(function () {
        var flag1 = '${flag1}';
        var msg = '${msg}';
        if(flag1 == '1'){
            $("#msg1").text(msg);
            $("#modal-demo").modal("show");
        }
    });
</script>
</body>
</html>

