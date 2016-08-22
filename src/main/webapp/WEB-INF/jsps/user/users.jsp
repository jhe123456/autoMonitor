<%--
  Created by IntelliJ IDEA.
  User: zl
  Date: 2016/8/18
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
        <%@include file="../head.jsp"%>
    <ul class="page-breadcrumb breadcrumb">
        <li>
            <i class="fa fa-home"></i>
            <a href="javascript:;">
                首页
            </a>
            <i class="fa fa-angle-right"></i>
        </li>
        <li>
            <a href="javascript:;">
                人员管理
            </a>
        </li>
    </ul>
</head>
<body>
<div class="container">
     <div id="toolbar">
         <button id="newUser" class="btn btn-default" >
              新增
         </button>
        <button id="remove" class="btn btn-default" >
             删除
        </button>
    </div>
    <table id="table"
           data-toggle="table"
           data-toolbar="#toolbar"
           data-show-export="true"
           data-height="460"
           data-search="true"
           data-sort-name="id"
           data-sort-order="asc"
           data-show-columns="true"
           data-url="<%=basePath%>user/">
        <thead>
        <tr>
            <th data-field="state" data-checkbox="true"></th>
            <th data-field="id">ID</th>
            <th data-field="userName"  data-sortable="true">登录名</th>
            <th data-field="fullName"  data-sortable="true">姓名</th>
            <th data-field="workEmail"  data-sortable="true">工作邮箱</th>
            <th data-formatter="operateFormatter" >操作</th>
        </tr>
        </thead>
    </table>
</div>
<%@include file="../foot.jsp"%>
<script>
    var $table = $('#table'),
            $button = $('#button');

    $(function () {
           $table.bootstrapTable({
               exportDataType: 'all'
           });
//       $button.click(function () {
//           alert('getSelections: ' + JSON.stringify($table.bootstrapTable('getSelections')));
//       });


   });

    function deleteUser(id){
       if(id==''&&id!=0){
           alert(id);
           alert("id为空！")
           return false;
       }
        $.ajax({
            url: '<%=basePath%>user/'+id,
            type: 'DELETE',
//            dataType: "json",
//            data:{_method:"DELETE"},
            success: function(result) {
                if(result=="0"){
                    alert("删除成功!");
                    $table.bootstrapTable('refresh');
                }else{
                    alert("删除失败!");
                }
                }
        });
    }
    function operateFormatter(value, row, index) {
        return [
            '<a class="remove" href="#" onclick="deleteUser('+row.id+')" title="Remove">',
            '<i class="glyphicon glyphicon-remove"></i>',
            '</a>',
            '</div>'
        ].join('');
    }
</script>
</body>
</html>
