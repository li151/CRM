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
    <title>查看交流记录</title>
</head>
<body>
<div class="page-container">
    <div class="panel panel-default">
        <div class="panel-header">客户名称:</div>
        <div class="panel-body"><td>${customer.customername}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">客户类型:</div>
        <div class="panel-body">${customer.shortid}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">添加日期:</div>
        <div class="panel-body"><fmt:formatDate value="${customer.addtime}"/></div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">电话:</div>
        <div class="panel-body">${customer.telephone}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">传真:</div>
        <div class="panel-body">${customer.fax}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">负责人:</div>
        <div class="panel-body">${customer.functionary}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">地区:</div>
        <div class="panel-body">${customer.city}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">行业:</div>
        <div class="panel-body">${customer.industry}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">经营项目:</div>
        <div class="panel-body">${customer.dealproject}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">联系人:</div>
        <div class="panel-body">${customer.linkman}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">企业地址:</div>
        <div class="panel-body">${customer.linkaddress}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">邮箱:</div>
        <div class="panel-body">${customer.email}</div>
    </div>
    &nbsp;
    <div class="panel panel-default">
        <div class="panel-header">企业性质:</div>
        <div class="panel-body">${customer.linktype}</div>
    </div>

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
