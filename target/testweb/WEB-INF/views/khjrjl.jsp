<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lhql
  Date: 2019-01-06
  Time: 11:30
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
    <title>客户节日记录</title>
</head>
<body>
<div class="page-container">

    <%--<div class="text-c">--%>
        <%--<input type="text" class="input-text" style="width:250px" placeholder="输入客户姓名" id="" name="">--%>
        <%--<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜客户</button>--%>
    <%--</div>--%>

    <div class="cl pd-5 bg-1 bk-gray mt-20">
        <span class="l">
            <a href="javascript:;" onclick="admin_add('添加客户节日记录','${pageContext.request.contextPath}/Com/tjkhjrjl','800','500')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加客户节日记录</a>
            <a href="javascript:;" onclick="admin_del()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 删除客户节日记录</a>
            <a href="${pageContext.request.contextPath}/Com/khjrjl"  class="btn btn-success radius"><i class="Hui-iconfont">&#xe68f;</i> 刷新</a>
        </span>
    </div>
    <table class="table table-border table-bordered table-bg table-sort">
        <thead>
        <tr>
            <th scope="col" colspan="15">客户节日记录列表</th>
        </tr>
        <tr class="text-c">
            <th width="25"><input type="checkbox" name="" value=""></th>
            <th>客户姓名</th>
            <th>指派人员</th>
            <th>注意事项</th>
            <th>关怀时间</th>
            <th>节日关怀描述</th>
            <th>节日类型</th>
            <th>添加时间</th>
            <th>添加人</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sessionScope.KHJRJL}" var="web">
            <tr class="text-c">
                <td><input type="checkbox" value=${web.khxm} name="checkbox" id="aa"></td>
                <td>${web.khxm}</td>
                <td>${web.zpry}</td>
                <td>${web.zysx}</td>
                <td>${web.ghsj}</td>
                <td>${web.ghms}</td>
                <td>${web.jrlx}</td>
                <td>${web.tjsj}</td>
                <td>${web.tjr}</td>
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
        layer_show(title,url,w,h);
    }
    /*管理员-删除*/
    function admin_del(){
        var aa = '';
        var sckhjrjl='${sckhjrjl}';  //删除客户节日记录

        if(sckhjrjl == '否'){
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
                        url: '${pageContext.request.contextPath}/khjr/deletejr',
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


    /*管理员-启用*/
    function admin_start(obj,id){
        layer.confirm('确认要启用吗？',function(index){
            //此处请求后台程序，下方是成功后的前台处理……
            $(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
            $(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
            $(obj).remove();
            layer.msg('已启用!', {icon: 6,time:1000});
        });
    }
</script>
</body>
</html>

