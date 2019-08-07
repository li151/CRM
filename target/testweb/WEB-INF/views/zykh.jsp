<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lhql
  Date: 2018-12-31
  Time: 23:03
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
    <title>管理员列表</title>
</head>
<body>
<div class="page-container">
    <form action="${pageContext.request.contextPath}/cus/tjcx1" method="post">
        客户名称:&nbsp;<input type="text" class="input-text" style="width:200px;height: 25px" placeholder="输入客户名称" id="khmc" name="khmc">
        &nbsp;&nbsp;&nbsp;
        地区:&nbsp;<input type="text" class="input-text" style="width:200px;height: 25px" placeholder="输入地区" id="dq" name="dq">
        &nbsp;&nbsp;&nbsp;
        负责人:&nbsp;<input type="text" class="input-text" style="width:200px;height: 25px" placeholder="输入负责人" id="fzr" name="fzr">
        &nbsp;&nbsp;&nbsp;
        行业:&nbsp;<input type="text" class="input-text" style="width:200px;height: 25px" placeholder="输入行业" id="hy" name="hy">
        &nbsp;&nbsp;&nbsp;
        <button type="submit" class="btn btn-success-outline radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 查询</button>
        <br/>
        联系人:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" class="input-text" style="width:200px;height: 25px" placeholder="输入联系人" id="lxr" name="lxr">
        &nbsp;&nbsp;&nbsp;
        查询日期:&nbsp;
        <input type="text" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}'})" id="datemin" name="datemin" class="input-text Wdate" style="width:120px;height: 25px;">
        -
        <input type="text" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d'})" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;height: 25px;">
    </form>


    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="admin_add('添加客户','${pageContext.request.contextPath}/Com/tjkh','800','500')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加客户</a>
            <a href="javascript:;" onclick="admin_ckkh('查看客户信息','${pageContext.request.contextPath}/cus/selectkhcx','1000','500')" class="btn btn-secondary radius"><i class="Hui-iconfont">&#xe665;</i> 查看客户信息</a>
            <a href="javascript:;" onclick="admin_del()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 删除客户</a>
            <%--<a href="javascript:;" onclick="admin_edit()" class="btn btn-warning-outline radius"><i class="Hui-iconfont">&#xe60c;</i> 编辑</a>--%>
            <a href="javascript:;" onclick="admin_ck('客户交流记录','${pageContext.request.contextPath}/link/sellink','1000','500')" class="btn btn-secondary radius"><i class="Hui-iconfont">&#xe62b;</i> 查看交流记录</a>
            <a href="javascript:;" onclick="admin_xz('新增交流记录','${pageContext.request.contextPath}/link/insertlink','1000','500')" class="btn btn-primary-outline radius"><i class="Hui-iconfont">&#xe610;</i> 新增交流记录</a>
            <a href="${pageContext.request.contextPath}/Com/zykh"  class="btn btn-success radius"><i class="Hui-iconfont">&#xe68f;</i> 刷新</a>
            <a href="${pageContext.request.contextPath}/Ex/zykh"  class="btn btn-warning-outline radius"><i class="Hui-iconfont">&#xe641;</i> 导出数据</a>
        </span>
    </div>
    <table class="table table-border table-bordered table-bg table-sort">
        <thead>
        <tr>
            <th scope="col" colspan="15">客户列表</th>
        </tr>
        <tr class="text-c">
            <th width="25"><input type="checkbox" name="" value=""></th>
            <th width="50">客户名称</th>
            <th width="60">客户类型</th>
            <th width="50">添加日期</th>
            <th width="50">电话</th>
            <th width="50">传真</th>
            <th width="60">负责人</th>
            <th width="50">地区</th>
            <th width="60">行业</th>
            <th width="70">经营项目</th>
            <th width="50">联系人</th>
            <th width="100">企业地址</th>
            <th width="50">邮箱</th>
            <th width="60">企业性质</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sessionScope.custs2}" var="web">
            <tr class="text-c">
                <td><input type="checkbox" value=${web.customername} name="checkbox" id="aa"></td>
                <td>${web.customername}</td>
                <td>${web.shortid}</td>
                <td><fmt:formatDate value="${web.addtime}"/></td>
                <td>${web.telephone}</td>
                <td>${web.fax}</td>
                <td>${web.functionary}</td>
                <td>${web.city}</td>
                <td>${web.industry}</td>
                <td>${web.dealproject}</td>
                <td>${web.linkman}</td>
                <td>${web.linkaddress}</td>
                <td>${web.email}</td>
                <td>${web.linktype}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<div id="modal-demo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content radius">
            <div class="modal-header">
                <h3 class="modal-title" style="color: #00B83F">提示</h3>
                <a class="close" data-dismiss="modal" aria-hidden="true" href="javascript:void();">×</a>
            </div>
            <div class="modal-body">
                <p id="msg1"></p>
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

    $('.table-sort').dataTable({
        "aaSorting": [[ 1, "desc" ]],//默认第几个排序
        "bStateSave": true,//状态保存
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable":false,"aTargets":[0]}// 制定列不参与排序
        ]
    });

    /*管理员-增加*/
    function admin_add(title,url,w,h){
        layer_show(title,url,w,h);
    }
    /*管理员-删除*/
    function admin_del(){
        var aa = '';
        if ($("input[type='checkbox']").is(':checked')){

            var ss = $("input[type='checkbox']:checked").length;
            if(ss > 1){
                $("#msg1").text("一次只能选择一个客户!");
                $("#msg1").css("color","red");
                $("#modal-demo").modal("show");
            }else {
                $("input[name='checkbox']:checkbox:checked").each(function(){
                    aa+=$(this).val()
                });
                layer.confirm('确认要删除吗？',function(index){
                    $.ajax({
                        type: 'POST',
                        url: '${pageContext.request.contextPath}/cus/deletecus',
                        data:{"aa":aa},
                        dataType: 'json',
                        success: function(data){
                            $("input[name='checkbox']:checkbox:checked").each(function(){
                                $(this).parents("tr").remove();
                            });
                            // $(obj).parents("tr").remove();
                            layer.msg('已删除!',{icon:1,time:2000});
                            // alert(data.msg);
                        },
                        error:function(data) {
                            console.log(data.msg);
                        },
                    });
                });
            }
        }else{
            // layer.msg('请选择一个用户!');
            $("#msg1").text("请选择一个客户!");
            $("#msg1").css("color","blue");
            $("#modal-demo").modal("show");
        }


    }
    /*编辑*/
    function admin_edit(){
        if ($("input[type='checkbox']").is(':checked')){

        }else {
            $("#msg1").text("请选择一个客户!");
            $("#msg1").css("color","blue");
            $("#modal-demo").modal("show");
        }
    }

    function admin_ck(title,url,w,h){
        var aa = '';
        if ($("input[type='checkbox']").is(':checked')){

            var ss = $("input[type='checkbox']:checked").length;
            if(ss > 1){
                $("#msg1").text("一次只能选择一个客户!");
                $("#msg1").css("color","red");
                $("#modal-demo").modal("show");
            }else {
                $("input[name='checkbox']:checkbox:checked").each(function(){
                    aa+=$(this).val()
                });
                $.ajax({
                    type: 'POST',
                    url: '${pageContext.request.contextPath}/link/selnk',
                    data:{"aa":aa},
                    dataType: 'json',
                    success: function(data){
                        layer_show(title,url,w,h);
                    },
                    error:function(data) {
                        console.log(data.msg);
                    },
                });
            }
        }else {
            $("#msg1").text("请选择一个客户!");
            $("#msg1").css("color","blue");
            $("#modal-demo").modal("show");
        }
    }

    function admin_xz(title,url,w,h){
        var aa = '';
        if ($("input[type='checkbox']").is(':checked')){

            var ss = $("input[type='checkbox']:checked").length;
            if(ss > 1){
                $("#msg1").text("一次只能选择一个客户!");
                $("#msg1").css("color","red");
                $("#modal-demo").modal("show");
            }else {
                $("input[name='checkbox']:checkbox:checked").each(function(){
                    aa+=$(this).val()
                });
                $.ajax({
                    type: 'POST',
                    url: '${pageContext.request.contextPath}/link/selnk',
                    data:{"aa":aa},
                    dataType: 'json',
                    success: function(data){
                        layer_show(title,url,w,h);
                    },
                    error:function(data) {
                        console.log(data.msg);
                    },
                });
            }
        }else {
            $("#msg1").text("请选择一个客户!");
            $("#msg1").css("color","blue");
            $("#modal-demo").modal("show");
        }
    }

    /*查看客户信息*/
    function admin_ckkh(title,url,w,h){
        var aa = '';
        if ($("input[type='checkbox']").is(':checked')){

            var ss = $("input[type='checkbox']:checked").length;
            if(ss > 1){
                $("#msg1").text("一次只能选择一个客户!");
                $("#msg1").css("color","red");
                $("#modal-demo").modal("show");
            }else {
                $("input[name='checkbox']:checkbox:checked").each(function(){
                    aa+=$(this).val()
                });
                $.ajax({
                    type: 'POST',
                    url: '${pageContext.request.contextPath}/cus/ajaxkh',
                    data:{"aa":aa},
                    dataType: 'json',
                    success: function(data){
                        layer_show(title,url,w,h);
                    },
                    error:function(data) {
                        console.log(data.msg);
                    },
                });
            }
        }else{
            // layer.msg('请选择一个用户!');
            $("#msg1").text("请选择一个客户!");
            $("#msg1").css("color","blue");
            $("#modal-demo").modal("show");
        }
    }
</script>
</body>
</html>

