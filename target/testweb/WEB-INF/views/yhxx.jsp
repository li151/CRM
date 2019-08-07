<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<%--
  Created by IntelliJ IDEA.
  User: lhql
  Date: 2019-01-01
  Time: 19:53
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
    <%--<div class="text-c">--%>
        <%--<input type="text" class="input-text" style="width:250px" placeholder="输入用户名" id="" name="">--%>
        <%--<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>--%>
    <%--</div>--%>

    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="admin_add('添加用户','${pageContext.request.contextPath}/Com/useradd','800','500')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a>
            <a href="javascript:;" onclick="admin_del()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 删除用户</a>
            <a href="javascript:;" onclick="admin_qx('用户权限','${pageContext.request.contextPath}/qxgl/ckqxgl','800','500')" class="btn btn-warning radius"><i class="Hui-iconfont">&#xe61d;</i> 查看用户权限</a>
            <a href="javascript:;" onclick="admin_qx('用户权限','${pageContext.request.contextPath}/qxgl/xgyhqx','800','500')" class="btn btn-danger-outline radius"><i class="Hui-iconfont">&#xe61d;</i> 修改用户权限</a>
            <a href="${pageContext.request.contextPath}/Com/yhxx"  class="btn btn-success radius"><i class="Hui-iconfont">&#xe68f;</i> 刷新</a>
        </span>
    </div>
    <table class="table table-border table-bordered table-bg table-sort">
        <thead>
        <tr>
            <th scope="col" colspan="9">员工列表</th>
        </tr>
        <tr class="text-c">
            <th width="25"><input type="checkbox" name="" value=""></th>
            <th width="100">用户名</th>
            <th width="110">密码</th>
            <th width="90">姓名</th>
            <th width="150">性别</th>
            <th>角色</th>
            <th width="130">创建时间</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${sessionScope.user}" var="aa">
                <tr class="text-c">
                    <td><input type="checkbox" value=${aa.username} name="checkbox" id="ss"></td>
                    <td id="username">${aa.username}</td>
                    <td>${aa.password}</td>
                    <td>${aa.name}</td>
                    <td>${aa.sex}</td>
                    <td>${aa.role}</td>
                    <td><fmt:formatDate value="${aa.ctime}"/></td>
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
    /*
        参数解释：
        title	标题
        url		请求的url
        id		需要操作的数据id
        w		弹出层宽度（缺省调默认值）
        h		弹出层高度（缺省调默认值）
    */
    /*管理员-增加*/
    function admin_add(title,url,w,h){
        var tjyh = '${tjyh}';    //添加用户
        if(tjyh == '否'){
            $("#msg1").text("抱歉您没有权限,请找管理员分配!");
            $("#msg1").css("color","red");
            $("#modal-demo").modal("show");
        }else {
            layer_show(title,url,w,h);
        }

    }
    /*管理员-删除*/
    function admin_del(){
        var aa = '';
        var scyh = '${scyh}';    //删除用户
        if(scyh == '否'){
            $("#msg1").text("抱歉您没有权限,请找管理员分配!");
            $("#msg1").css("color","red");
            $("#modal-demo").modal("show");
        }else if ($("input[type='checkbox']").is(':checked')){

            var ss = $("input[type='checkbox']:checked").length;
            if(ss > 1){
                $("#msg1").text("一次只能选择一条记录!");
                $("#msg1").css("color","red");
                $("#modal-demo").modal("show");
            }else {
                $("input[name='checkbox']:checkbox:checked").each(function(){
                    aa+=$(this).val()
                });
                layer.confirm('确认要删除吗？',function(index){
                    $.ajax({
                        type: 'POST',
                        url: '${pageContext.request.contextPath}/User/del',
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
        }else {
            // layer.msg('请选择一个用户!');
            $("#msg1").text("请选择一条记录!");
            $("#msg1").css("color", "blue");
            $("#modal-demo").modal("show");
        }

    }

    function admin_qx(title,url,w,h) {
        var aa = '';
        var yhqx='${yhqx}';    //用户权限管理
        if(yhqx == '否'){
            $("#msg1").text("抱歉您没有权限,请找管理员分配!");
            $("#msg1").css("color","red");
            $("#modal-demo").modal("show");
        }else if ($("input[type='checkbox']").is(':checked')){

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
                    url: '${pageContext.request.contextPath}/qxgl/yhqx',
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
