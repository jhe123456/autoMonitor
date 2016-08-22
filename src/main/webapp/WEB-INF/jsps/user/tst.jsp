<script>
function initTable() {
$table = $('#table').bootstrapTable({
//method: 'get',<br><br>
　　　　　　　　　　method: 'post',
　　　　　　　　　　//contentType: "application/x-www-form-urlencoded",//必须的，操你大爷！！！！
url: "<%=basePath%>/user/showUsers",
height: $(window).height() - 200,
striped: true,
pagination: true,
singleSelect: false,
pageSize: 50,
pageList: [10, 50, 100, 200, 500],
search: false, //不显示 搜索框
showColumns: false, //不显示下拉框（选择显示的列）
sidePagination: "server", //服务端请求
queryParams: queryParams,
minimunCountColumns: 2,
columns: [{
field: 'state',
checkbox: true
}, {
field: 'fullName',
title: '姓名',
width: 100,
align: 'center',
valign: 'middle',
sortable: true,
formatter: nameFormatter
},{
field: 'id',
title: 'id',
width: 180,
align: 'left',
valign: 'top',
sortable: true
}, {
field: 'userName',
title: '登录名',
width: 100,
align: 'left',
valign: 'top',
sortable: true
}],
onLoadSuccess:function(){
},
onLoadError: function () {
mif.showErrorMessageBox("数据加载失败！");
}
});
} </script>