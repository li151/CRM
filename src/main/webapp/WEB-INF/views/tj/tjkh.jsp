<%--
  Created by IntelliJ IDEA.
  User: lhql
  Date: 2019-01-01
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="${pageContext.request.contextPath}/favicon.ico" >
    <link rel="Shortcut Icon" href="${pageContext.request.contextPath}/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>添加客户</title>
</head>
<body>
<article class="page-container">
    <%--这里是添加公告--%>
    <form class="form form-horizontal" id="form-admin-add" action="${pageContext.request.contextPath}/cus/insertcus" method="post">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>客户名称：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="khmc" name="khmc">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">客户类型：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
			<select class="select" name="khlx" size="1">
				<option value="公海池">公海池</option>
				<option value="重要客户">重要客户</option>
                <option value="核心客户">核心客户</option>
				<option value="普通客户">普通客户</option>
			</select>
			</span> </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="dh" name="dh">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>传真：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="cz" name="cz">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>负责人：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="fzr" name="fzr">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>地区：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="dq" name="dq">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>行业：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="hy" name="hy">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>经营项目：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="jyxm" name="jyxm">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>联系人：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="lxr" name="lxr">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>企业地址：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="qydz" name="qydz">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>邮箱：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="@" id="yx" name="yx">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>企业性质：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="qyxz" name="qyxz">
            </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input class="btn btn-primary radius" type="submit" onclick="return addkh()" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
            </div>
        </div>
    </form>
</article>


<div id="modal-demo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content radius">
            <div class="modal-header">
                <h3 class="modal-title" style="color: #00B83F">提示</h3>
                <a class="close" data-dismiss="modal" aria-hidden="true" href="javascript:void();">×</a>
            </div>
            <div class="modal-body">
                <p id="msg1" style="color: red"></p>
            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" data-dismiss="modal" aria-hidden="true">确定</button>
                <!--<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>-->
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->


<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
    function addkh(){
        if($("#khmc").val()=='' || $("#khmc").val()==null){
            $("#msg1").text("客户名称不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#dh").val()=='' || $("#dh").val()==null){
            $("#msg1").text("电话不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#cz").val()=='' || $("#cz").val()==null){
            $("#msg1").text("传真不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#fzr").val()=='' || $("#fzr").val()==null){
            $("#msg1").text("负责人不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#dq").val()=='' || $("#dq").val()==null){
            $("#msg1").text("地区不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#hy").val()=='' || $("#hy").val()==null){
            $("#msg1").text("行业不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#jyxm").val()=='' || $("#jyxm").val()==null){
            $("#msg1").text("经营项目不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#lxr").val()=='' || $("#lxr").val()==null){
            $("#msg1").text("联系人不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#qydz").val()=='' || $("#qydz").val()==null){
            $("#msg1").text("企业地址不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#yx").val()=='' || $("#yx").val()==null){
            $("#msg1").text("邮箱不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#qyxz").val()=='' || $("#qyxz").val()==null){
            $("#msg1").text("企业性质不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else {
            return true;
        }
    }

    $(function () {
        var s = '${khmsg}';
        if(s=='1'){
            $("#msg1").text("添加客户成功!");
            $("#msg1").css("color","green");
            $("#modal-demo").modal("show");

        }else if(s=='0'){
            $("#msg1").text("添加客户失败!");
            $("#modal-demo").modal("show");
        }
    });
</script>

</body>
</html>
