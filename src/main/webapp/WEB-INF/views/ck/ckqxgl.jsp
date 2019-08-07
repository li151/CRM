<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lhql
  Date: 2018-12-31
  Time: 22:35
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css"
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>权限管理</title>
</head>
<body>
<div class="page-container">
    <div style="color: #00B83F;font-size: 20px">用户名:${qxgl.username}</div>
    <div class="panel panel-default">
        <div class="panel-header">主页管理:</div>
        <div class="panel-body"><td>${qxgl.zygl}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">添加公告:</div>
        <div class="panel-body">${qxgl.tjgg}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除公告:</div>
        <div class="panel-body">${qxgl.scgg}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">用户信息:</div>
        <div class="panel-body">${qxgl.yhxx}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">添加用户:</div>
        <div class="panel-body">${qxgl.tjyh}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除用户:</div>
        <div class="panel-body">${qxgl.scyh}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">用户权限管理:</div>
        <div class="panel-body">${qxgl.yhqx}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">公海池:</div>
        <div class="panel-body">${qxgl.ghc}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">添加客户:</div>
        <div class="panel-body">${qxgl.tjkh}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除客户:</div>
        <div class="panel-body">${qxgl.sckh}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">导出数据:</div>
        <div class="panel-body">${qxgl.dcsj}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">重要客户:</div>
        <div class="panel-body">${qxgl.zykh}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">核心客户:</div>
        <div class="panel-body">${qxgl.hxkh}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">普通客户:</div>
        <div class="panel-body">${qxgl.ptkh}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">客户信息:</div>
        <div class="panel-body">${qxgl.khxx}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">潜在客户管理:</div>
        <div class="panel-body">${qxgl.qzkhgl}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除潜在客户:</div>
        <div class="panel-body">${qxgl.scqzkh}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">服务报告:</div>
        <div class="panel-body">${qxgl.fwbg}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除服务报告:</div>
        <div class="panel-body">${qxgl.scfwbg}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">常见问题库:</div>
        <div class="panel-body">${qxgl.cjwtk}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除常见问题库:</div>
        <div class="panel-body">${qxgl.sccjwtk}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">分享服务方式:</div>
        <div class="panel-body">${qxgl.fxfwfs}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除分享服务方式:</div>
        <div class="panel-body">${qxgl.scfxfwfs}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">营销活动:</div>
        <div class="panel-body">${qxgl.yxhd}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除营销活动:</div>
        <div class="panel-body">${qxgl.scyxhd}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">市场分析:</div>
        <div class="panel-body">${qxgl.scfx}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除市场分析:</div>
        <div class="panel-body">${qxgl.scscfx}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">客户节日管理:</div>
        <div class="panel-body">${qxgl.khjrjl}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除客户节日记录:</div>
        <div class="panel-body">${qxgl.sckhjrjl}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">客户联系方式:</div>
        <div class="panel-body">${qxgl.khlxxx}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">删除客户联系信息:</div>
        <div class="panel-body">${qxgl.sckhlxxx}</div>
    </div>
    <%--&nbsp;--%>
    <%--<div class="panel panel-default">--%>
        <%--<div class="panel-header">企业性质:</div>--%>
        <%--<div class="panel-body">${qxgl}</div>--%>
    <%--</div>--%>

</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script>


<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/jquery.cookie.js"></script>
<script type="text/javascript">

</script>
</body>
</html>
