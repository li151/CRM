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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>添加客户联系信息</title>
</head>
<body>
<article class="page-container">
    <%--这里是添加公告--%>
    <form class="form form-horizontal" id="form-admin-add" action="${pageContext.request.contextPath}/khlxxx/insertkhlxxx" method="post">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>客户姓名：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="khxm" name="khxm">
            </div>
        </div>

        <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3">客户性别：</label>
        <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
			<select class="select" name="khxb" size="1">
				<option value="男">男</option>
				<option value="女">女</option>
			</select>
			</span> </div>
        </div>

        <div class="row cl">
        <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>籍贯：</label>
        <div class="formControls col-xs-8 col-sm-9">
            <input type="text" class="input-text" value="" placeholder="" id="jg" name="jg">
        </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>所在公司部门：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="szgsbm" name="szgsbm">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>担任职务：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="drzw" name="drzw">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>移动电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="yddh" name="yddh">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>办公电话：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="bgdh" name="bgdh">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>客户邮箱：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" placeholder="@" name="email" id="email">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>采购关注点：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea id="cggzd" name="cggzd" style="height: 150px" class="textarea"  placeholder="请输入采购关注点......" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength1()"></textarea>
                <%--<p class="textarea-numberbar"><em class="textarea-length">0</em>/500</p>--%>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>性格：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="xg" name="xg">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>在企业的影响力：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="yxl" name="yxl">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">状态：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
			<select class="select" name="zt" size="1">
				<option value="在职">在职</option>
				<option value="离职">离职</option>
			</select>
			</span> </div>
        </div>

        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <input class="btn btn-primary radius" type="submit" onclick="return adduser()" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
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
    function adduser(){
        if($("#khxm").val()=='' || $("#khxm").val()==null){
            $("#msg1").text("客户姓名不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#jg").val()=='' || $("#jg").val()==null){
            $("#msg1").text("籍贯不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#szgsbm").val()=='' || $("#szgsbm").val()==null){
            $("#msg1").text("所在公司部门不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#drzw").val()=='' || $("#drzw").val()==null){
            $("#msg1").text("担任职务不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#yddh").val()=='' || $("#yddh").val()==null){
            $("#msg1").text("移动电话不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#bgdh").val()=='' || $("#bgdh").val()==null){
            $("#msg1").text("办公电话不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#email").val()=='' || $("#email").val()==null){
            $("#msg1").text("客户邮箱不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#cggzd").val()=='' || $("#cggzd").val()==null){
            $("#msg1").text("采购关注点不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#xg").val()=='' || $("#xg").val()==null){
            $("#msg1").text("性格不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#yxl").val()=='' || $("#yxl").val()==null){
            $("#msg1").text("企业的影响力不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else{
            return true;
        }
    }

    $(function () {
        var s = '${lxmsg}';
        if(s=='1'){
            $("#msg1").text("添加成功!");
            $("#msg1").css("color","green");
            $("#modal-demo").modal("show");

        }else if(s=='0'){
            $("#msg1").text("添加失败!");
            $("#modal-demo").modal("show");
        }
    });
</script>

</body>
</html>
