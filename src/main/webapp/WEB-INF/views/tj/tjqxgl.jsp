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
    <title>添加公告</title>
</head>
<body>
<article class="page-container">
    <%--这里是添加公告--%>
    <div style="color: red"> 该项为权限管理,默认全部为否,请谨慎修改!</div>
        <div style="color: #00B83F;font-size: 20px">用户名:${qx}</div>
    <form class="form form-horizontal" id="form-admin-add" action="${pageContext.request.contextPath}/qxgl/gxyhqx" method="post">

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">主页管理：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="zygl" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">添加公告：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="tjgg" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除公告：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="scgg" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">用户信息：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="yhlx" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">添加用户：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="tjyh" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除用户：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="scyh" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">用户权限管理：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="yhqx" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">公海池：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="ghc" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">添加客户：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="tjkh" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除客户：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="sckh" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">导出数据：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="dcsj" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">重要客户：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="zykh" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">核心客户：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="hxkh" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">普通客户：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="ptkh" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>


        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">客户信息：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="khxx" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">潜在客户管理：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="qzkhgl" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除潜在客户：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="scqzkh" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">服务报告：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="fwbg" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除服务报告：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="scfwbg" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">常见问题库：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="cjwtk" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除常见问题库：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="sccjwt" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">分享服务方式：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="fxfwfs" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除分享服务方式：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="scfxfwfs" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">营销活动：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="yxhd" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除营销活动：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="scyxhd" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">市场分析：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="scfx" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除市场分析：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="scscfx" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">客户节日管理：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="khjrgl" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除客户节日记录：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="sckhjrgl" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>

        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">客户联系方式：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="khlxfs" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
            </div>
        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">删除客户联系信息：</label>
            <div class="formControls col-xs-8 col-sm-9"> <span class="select-box" style="width:150px;">
                    <select class="select" name="sckhlxfs" size="1">
                        <option value="否">否</option>
                        <option value="是">是</option>
                    </select>
                </span>
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


<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">

    $(function () {
        var msg = '${tjmsg}';

        if(msg=='1'){
            $("#msg1").text("修改权限成功!");
            $("#msg1").css("color","green");
            $("#modal-demo").modal("show");
        }
    });
</script>

</body>
</html>
