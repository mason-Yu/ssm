<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>天翼深圳通管理平台</title>
<link rel="stylesheet" type="text/css" href="<%=path %>/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/js/easyui/themes/icon.css">
<script type="text/javascript" src="<%=path %>/js/easyui/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/comm.js"></script>
<script type="text/javascript" src="<%=path %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath %>css/style/main.css">
<script type="text/javascript">
var treeData = <%=request.getSession().getAttribute("treeJson") %>;
$(function(){
	$('#help_tree').tree({
		checkbox: false,
		animate:true,
		lines:true,
		data: treeData,
		onClick:function(node) {
			if (node.attributes && node.attributes.menuUrl) {
				$('#show_win').panel('refresh','<%=request.getContextPath() %>' + node.attributes.menuUrl);
				$('body').layout('panel', 'center').panel('setTitle', node.text);
			} 
		},
		formatter: function(node) {
			return node.text + "-";
		}
	});
	$('#show_win').panel({
				fit:true,
				border:false,
				noheader:false
	});
});
</script>
</head>
<body class="easyui-layout">

<div data-options="region:'north'" style="height:50px;overflow:hidden; background-color: #eee;">
  <h1>天翼深圳通管理平台</h1>
  <div id="login_user_info" style="padding-top: 30px">欢迎你：${currentUser.userName}. <a href="<%=request.getContextPath() %>/app/logout">退出</a></div>
</div>


<div data-options="region:'west',split:true,title:'导航窗口',iconCls:'icon-help'" style="width:248px;padding:5px; text-align:left; background-color: #eee;">
	<ul id="help_tree" class="easyui-tree"></ul>
</div>
<div data-options="region:'center'" title="主窗口" style=" padding:10px; text-align:left; background-color: #eee;">
  <div id="show_win" style=" background-color: #eee;">欢迎登陆！</div>
</div>

<script>
// setInterval(function() {
<%-- 	var url = '<%=request.getContextPath() %>/app/checkSession'; --%>
// 	$.get(url, function(result) {
// 		if (! result.successful) {
<%-- 			window.location.href="<%=request.getContextPath() %>"; --%>
// 		}
// 	}, 'json');
// }, 60000);
</script>
</body>
</html>
