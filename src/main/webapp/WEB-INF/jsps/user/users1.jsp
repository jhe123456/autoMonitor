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
</head><body>
<div class="container">
    <h1>load</h1>
    <p>Load the data to table, the old rows will be removed: <code>$table.bootstrapTable('load', data);</code></p>
    <div id="toolbar">
        <button id="button" class="btn btn-default">load</button>
    </div>
    <table id="table"
           data-toggle="table"
           data-toolbar="#toolbar"
           data-height="460"
           data-url="<%=basePath%>/user/showUsers">
        <thead>
        <tr>
            <th data-field="id">ID</th>
            <th data-field="userName"> Name</th>
            <th data-field="fullName">Price</th>
        </tr>
        </thead>
    </table>
    <%@include file="../foot.jsp"%>
</div>
<script>
    var $table = $('#table'),
            $button = $('#button');
    $(function () {
        $button.click(function () {
            $table.bootstrapTable('load', randomData());
        });
    });
    function randomData() {
        var startId = ~~(Math.random() * 100),
                rows = [];
        for (var i = 0; i < 10; i++) {
            rows.push({
                id: startId + i,
                name: 'test' + (startId + i),
                price: '$' + (startId + i)
            });
        }
        return rows;
    }
</script>
</body>
</html>
