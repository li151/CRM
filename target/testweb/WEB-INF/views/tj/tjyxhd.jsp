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
    <title>添加营销活动</title>
</head>
<body>
<article class="page-container">
    <%--这里是添加公告--%>
    <form class="form form-horizontal" id="form-admin-add" action="${pageContext.request.contextPath}/yxhd/insertyxhd" method="post">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>活动主题：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="hdzt" name="hdzt">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>计划时间：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="jhsj" name="jhsj">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>活动开展地点：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="hdkzdd" name="hdkzdd">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>推销的所有产品：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea id="txdcp" name="txdcp" style="height: 150px" class="textarea"  placeholder="请输入推销的所有产品......" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength1()"></textarea>
                <%--<p class="textarea-numberbar"><em class="textarea-length">0</em>/500</p>--%>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>活动费用预算：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="hdfyys" name="hdfyys">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>计划销售额：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="jhxse" name="jhxse">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>计划配合人员：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea id="jhphry" name="jhphry" style="height: 150px" class="textarea"  placeholder="请输入计划配合人员......" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength1()"></textarea>
                <%--<p class="textarea-numberbar"><em class="textarea-length">0</em>/500</p>--%>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span> 计划开展天数：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="jhkzts" name="jhkzts">
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>活动备注：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <textarea id="hdbz" name="hdbz" style="height: 80px" class="textarea"  placeholder="请输入活动备注......" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength1()"></textarea>
                <%--<p class="textarea-numberbar"><em class="textarea-length">0</em>/500</p>--%>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span> 活动负责人：</label>
            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="" placeholder="" id="hdfzr" name="hdfzr">
            </div>
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
        if($("#hdzt").val()=='' || $("#hdzt").val()==null){
            $("#msg1").text("活动主题不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#jhsj").val()=='' || $("#jhsj").val()==null){
            $("#msg1").text("计划时间不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#hdkzdd").val()=='' || $("#hdkzdd").val()==null){
            $("#msg1").text("活动开展地点不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#txdcp").val()=='' || $("#txdcp").val()==null){
            $("#msg1").text("所有推销的产品不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#hdfyys").val()=='' || $("#hdfyys").val()==null){
            $("#msg1").text("活动费用预算不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#jhxse").val()=='' || $("#jhxse").val()==null){
            $("#msg1").text("计划销售额不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#jhphry").val()=='' || $("#jhphry").val()==null){
            $("#msg1").text("计划配合人员不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#jhkzts").val()=='' || $("#jhkzts").val()==null){
            $("#msg1").text("计划开展天数不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#hdbz").val()=='' || $("#hdbz").val()==null){
            $("#msg1").text("活动备注不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else if($("#hdfzr").val()=='' || $("#hdfzr").val()==null){
            $("#msg1").text("活动负责人不能为空!")
            $("#modal-demo").modal("show");
            return false;
        }else{
            return true;
        }
    }
    $(function () {
        var s = '${yxhdmsg}';
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
