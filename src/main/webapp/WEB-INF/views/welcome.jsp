<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lhql
  Date: 2019-01-01
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <table style="height: 90%">
       <tr>
           <%--<c:forEach items="sessionScope.ptgg" var="ptgg">--%>
           <td style="width: 50%">
               <div class="panel panel-primary" style="height: 90%;width: 98%;">
                   <div class="panel-header" style="font-size: 30px">公告板</div>
                   <div class="panel-body" style="font-size: 22px">
                       <div style="text-align: center">
                           ${ptgg.title}
                       </div>
                       <div style="font-size: 18px;font-style: inherit;color: #00B83F">
                           &nbsp;&nbsp;&nbsp;${ptgg.content}
                       </div>
                   </div>
               </div>
           </td>
           <%--</c:forEach>--%>
           <%--<c:forEach items="sessionScope.jjtz" var="jjtz">--%>
           <td style="width: 50%">
               <div class="panel panel-warning" style="height: 90%;width: 98%;">
                   <div class="panel-header" style="font-size: 30px">紧急通知</div>
                   <div class="panel-body" style="font-size: 22px">
                       <div style="text-align: center">
                           ${jjtz.title}
                       </div>
                       <div style="font-size: 18px;font-style: inherit;color: red">
                           &nbsp;&nbsp;&nbsp;${jjtz.content}
                       </div>
                   </div>
               </div>
           </td>
           <%--</c:forEach>--%>
       </tr>
    </table>


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
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
    <script type="text/javascript">
        $(function(){
            var gg='普通公告';
            var jj='紧急公告';
            $.ajax({
                type: 'POST',
                url: '${pageContext.request.contextPath}/cus/deletecus',
                data:{"gg":gg,"jj":jj},
                dataType: 'json',
                success: function(data){

                },
                error:function(data) {
                    $("#msg1").text("后台返回数据出现错误!");
                    $("#msg1").css("color","red");
                    $("#modal-demo").modal("show");
                },
            });
        });
    </script>
</body>
</html>
