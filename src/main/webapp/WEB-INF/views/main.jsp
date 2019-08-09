<%--
  Created by IntelliJ IDEA.
  User: lhql
  Date: 2018-12-30
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="${pageContext.request.contextPath}/favicon.ico" >
    <link rel="Shortcut Icon" href="${pageContext.request.contextPath}/favicon.ico" />


    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>客户资源管理系统</title>

</head>
<body>
<header class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs">客户资源管理系统</a>
            <span class="logo navbar-slogan f-l mr-10 hidden-xs">v1.0.1</span>  <!--这里是版本号-->
            <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
            <nav class="nav navbar-nav">
                <ul class="cl">
                    <li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" onclick="client_add('添加客户','${pageContext.request.contextPath}/Com/tjkh','1000','510')"><i class="Hui-iconfont">&#xe620;</i> 客户</a></li>
                            <li><a href="javascript:;" onclick="member_add('添加用户','${pageContext.request.contextPath}/Com/useradd','','510')"><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
            <nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li>当前用户:</li>
                    <li class="dropDown dropDown_hover">
                        <a href="#" class="dropDown_A">${name} <i class="Hui-iconfont">&#xe6d5;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" onclick="client_add('修改密码','${pageContext.request.contextPath}/Com/editpwd','600','400')"><i class="Hui-iconfont"></i> 修改密码</a></li>
                            <li><a href="${pageContext.request.contextPath}/User/checkLogin">退出</a></li>
                        </ul>
                    </li>

                    <li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
                        <ul class="dropDown-menu menu radius box-shadow">
                            <li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
                            <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
                            <li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
                            <li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
                            <li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
                            <li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<aside class="Hui-aside">
    <div class="menu_dropdown bk_2">
        <dl id="menu-article">
            <dt id="xtgl"><i class="Hui-iconfont">&#xe62e;</i> 系统管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <%--<ul>--%>
                    <%--<li><a data-href="/Com/yhqxgl" data-title="用户权限管理" href="javascript:void(0)">用户权限管理</a></li>--%>
                <%--</ul>--%>
                <ul>
                    <li id="zygl"><a data-href="${pageContext.request.contextPath}/Com/zygl" data-title="主页管理" href="javascript:void(0)">主页管理</a></li>
                </ul>
                <ul>
                    <li id="xyhxx"><a id="yhxx" data-href="${pageContext.request.contextPath}/Com/yhxx" data-title="用户信息" href="javascript:void(0)" onclick="yhxx()">用户信息</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-picture">
            <dt><i class="Hui-iconfont">&#xe60d;</i> 个人中心<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="${pageContext.request.contextPath}/Com/grjsb" data-title="个人记事本" href="javascript:void(0)">个人记事本</a></li>
                    <li><a data-href="${pageContext.request.contextPath}/Com/rcgl" data-title="日程管理" href="javascript:void(0)">日程管理</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-product">
            <dt id="khgl"><i class="Hui-iconfont">&#xe62b;&nbsp;</i>客户管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li id="ghc"><a data-href="${pageContext.request.contextPath}/Com/ghc" data-title="公海池" href="javascript:void(0)">公海池</a></li>
                    <li id="zykh"><a data-href="${pageContext.request.contextPath}/Com/zykh" data-title="重要客户" href="javascript:void(0)">重要客户</a></li>
                    <li id="hxkh"><a data-href="${pageContext.request.contextPath}/Com/hxkh" data-title="核心客户" href="javascript:void(0)">核心客户</a></li>
                    <li id="ptkh"><a data-href="${pageContext.request.contextPath}/Com/ptkh" data-title="普通客户" href="javascript:void(0)">普通客户</a></li>
                    <li id="khxx"><a data-href="${pageContext.request.contextPath}/Com/khxx" data-title="客户信息" href="javascript:void(0)">客户信息</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-comments">
            <dt id="qzkhgl"><i class="Hui-iconfont">&#xe602;&nbsp;</i>潜在客户管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <%--<li><a data-href="${pageContext.request.contextPath}/Com/yhqxgl" data-title="潜在客户管理" href="javascript:void(0)">潜在客户管理</a></li>--%>
                    <li id="qzkhxx"><a data-href="${pageContext.request.contextPath}/Com/qzkhxx" data-title="潜在客户信息" href="javascript:;">潜在客户信息</a></li>
                    <%--<li><a data-href="${pageContext.request.contextPath}/Com/qzkhfx" data-title="潜在客户分析" href="javascript:void(0)">潜在客户分析</a></li>--%>
                </ul>
            </dd>
        </dl>
        <dl id="menu-member">
            <dt id="xsgl"><i class="Hui-iconfont">&#xe60d;&nbsp;</i>销售管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li><a data-href="${pageContext.request.contextPath}/Com/yhqxgl" data-title="销售信息管理" href="javascript:;">销售信息管理</a></li>
                    <li><a data-href="${pageContext.request.contextPath}/Com/yhqxgl" data-title="销售排名" href="javascript:;">销售排名</a></li>
                    <li><a data-href="${pageContext.request.contextPath}/Com/yhqxgl" data-title="销售记录" href="javascript:;">销售记录</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-admin">
            <dt id="khfw"><i class="Hui-iconfont">&#xe6d0;&nbsp;</i>客户服务<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li id="fwbg"><a data-href="${pageContext.request.contextPath}/Com/fwbg" data-title="服务报告" href="javascript:void(0)">服务报告</a></li>
                    <li id="cjwtk"><a data-href="${pageContext.request.contextPath}/Com/cjwtk" data-title="常见问题库" href="javascript:void(0)">常见问题库</a></li>
                    <li id="fwfsfx"><a data-href="${pageContext.request.contextPath}/Com/fwfsfx" data-title="服务方式分享" href="javascript:void(0)">服务方式分享</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-tongji">
            <dt id="yxgl"><i class="Hui-iconfont">&#xe61a;&nbsp;</i>营销管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <%--<li><a data-href="${pageContext.request.contextPath}/Com/bjgl" data-title="报价管理" href="javascript:void(0)">报价管理</a></li>--%>
                    <li id="yxhd"><a data-href="${pageContext.request.contextPath}/Com/yxhdgl" data-title="营销活动管理" href="javascript:void(0)">营销活动管理</a></li>
                    <li id="scfx"><a data-href="${pageContext.request.contextPath}/Com/scfx" data-title="市场分析" href="javascript:void(0)">市场分析</a></li>
                    <%--<li><a data-href="charts-4.html" data-title="电话营销管理" href="javascript:void(0)">电话营销管理</a></li>--%>
                    <li id="khjrjl"><a data-href="${pageContext.request.contextPath}/Com/khjrjl" data-title="客户节日记录" href="javascript:void(0)">客户节日记录</a></li>
                </ul>
            </dd>
        </dl>
        <dl id="menu-system">
            <dt id="lxrgl"><i class="Hui-iconfont">&#xe705;&nbsp;</i>联系人管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
            <dd>
                <ul>
                    <li id="khlxxx"><a data-href="${pageContext.request.contextPath}/Com/lxrgl" data-title="客户联系信息" href="javascript:void(0)">客户联系信息</a></li>
                </ul>
            </dd>
        </dl>
    </div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active">
                    <span title="平台中心" data-href="${pageContext.request.contextPath}/Com/welcome">平台中心</span>
                    <em></em>
                </li>
            </ul>
        </div>
        <div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" frameborder="0" src="${pageContext.request.contextPath}/Com/welcome"></iframe>
        </div>
    </div>
</section>

<div class="contextMenu" id="Huiadminmenu">
    <ul>
        <li id="closethis">关闭当前 </li>
        <li id="closeall">关闭全部 </li>
    </ul>
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

<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
<script type="text/javascript">
    $(function(){
        var zygl = '${qx.zygl}';   //主页管理
        var yhxx ='${qx.yhxx}';            //用户信息
        var ghc  ='${qx.ghc}';   //公海池
        var zykh ='${qx.zykh}';  //重要客户
        var hxkh ='${qx.hxkh}';  //核心客户
        var ptkh ='${qx.ptkh}';   //普通客户
        var khxx ='${qx.khxx}';   //客户信息
        var qzkhgl ='${qx.qzkhgl}'; //潜在客户管理
        var fwbg ='${qx.fwbg}';   //服务报告
        var cjwtk ='${qx.cjwtk}';  //常见问题库
        var fxfwfs ='${qx.fxfwfs}';  //分享服务方式
        var yxhd ='${qx.yxhd}';   //营销活动
        var scfx ='${qx.scfx}';    //市场分析
        var khjrjl ='${qx.khjrjl}';   //客户节日管理
        var khlxxx='${qx.khlxxx}';     //客户联系方式
        var i='${role}';
        $("#xsgl").remove();
        // if(i!="超级管理员"){
        //     $("#xsgl").remove();
        // }
        if(zygl == '否'){    //主页管理权限
            $("#zygl").remove();
        }
        if(yhxx == '否'){   //用户信息权限
            $("#xyhxx").remove();
        }
        if((zygl == '否')&&(yhxx=='否')){  //系统管理权限
            $("#xtgl").remove();
        }
        if(ghc == '否'){
            $("#ghc").remove();
        }
        if(zykh == '否'){
            $("#zykh").remove();
        }
        if(hxkh == '否'){
            $("#hxkh").remove();
        }
        if(ptkh == '否'){
            $("#ptkh").remove();
        }
        if(khxx == '否'){
            $("#khxx").remove();
        }
        if((ghc == '否')&&(zykh == '否')&&(hxkh == '否')&&(ptkh == '否')&&(khxx == '否')){ //客户管理
            $("#khgl").remove();
        }
        if(qzkhgl == '否'){
            $("#qzkhxx").remove();
            $("#qzkhgl").remove();
        }
        if(fwbg == '否'){
            $("#fwbg").remove();
        }
        if(cjwtk == '否'){
            $("#cjwtk").remove();
        }
        if(fxfwfs == '否'){
            $("#fwfsfx").remove();
        }
        if((fwbg == '否')&&(cjwtk == '否')&&(fxfwfs == '否')){  //客户服务
            $("#khfw").remove();
        }
        if(yxhd == '否'){
            $("#yxhd").remove();
        }
        if(scfx == '否'){
            $("#scfx").remove();
        }
        if(khjrjl == '否'){
            $("#khjrjl").remove();
        }
        if((yxhd == '否')&&(scfx == '否')&&(khjrjl == '否')){
            $("#yxgl").remove();
        }
        if(khlxxx == '否'){
            $("#khlxxx").remove();
            $("#lxrgl").remove();
        }
        var tjkh='${tjkh}';    //添加客户
        var sckh='${sckh}';    //删除客户
        var dcsj='${dcsj}';    //导出数据

    });
    /*个人信息*/
    function myselfinfo(){
        layer.open({
            type: 1,
            area: ['300px','200px'],
            fix: false, //不固定
            maxmin: true,
            shade:0.4,
            title: '查看信息',
            content: '<div>管理员信息</div>'
        });
    }

    /*客户-添加*/
    function client_add(title,url,w,h){
        var tjkh='${tjkh}';
        if(tjkh == '否'){
            $("#msg1").text("抱歉您没有权限!");
            $("#msg1").css("color","red");
            $("#modal-demo").modal("show");
        }else {
            layer_show(title,url,w,h);
        }

    }
    /*用户-添加*/
    function member_add(title,url,w,h){
        var i='${role}';
        if(i!="超级管理员"){
            $("#msg1").text("抱歉您没有权限!");
            $("#msg1").css("color","red");
            $("#modal-demo").modal("show");
        }else{
            layer_show(title,url,w,h);
        }

    }

    function yhxx(){
        var role='${role}';
        if(role!="超级管理员"){
            $("#msg1").text("抱歉您没有权限!");
            $("#msg1").css("color","red");
            $("#modal-demo").modal("show");
            $("#yhxx").removeAttr("data-href");
        }else{
            return true;
        }
    }


</script>

</body>
</html>
