<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/demo/demo.css" >
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css" >
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css" >
	<script type="text/javascript" language="javascript" src="<%=basePath%>js/easyui/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" language="javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
<style type="text/css">
body {
    background:url(../image/login.jpg);  
  	background-size:cover;   
    height:595px;
    background-repeat:no-repeat;
    background-position-y:bottom; 
}
#logindiv {
margin-top:20%;
margin-left:200px;
}
*{
font-size: 14px;
}
.divname1{
margin-top:10%;
margin-left:550px;
font-size: 34px;
}

</style>

</head>
<script type="text/javascript">
$(function(){
	
	
	
	
	
	
	
	
});

function Logininfo(){
	var url="<%=basePath%>user/LoginInfo";
	$("#Loginform").form('submit',{
		url:url
		,success:function(data){
			if(data == 'success'){
			location.href="<%=basePath %>pages/main.jsp";
			}else{
				$("#errormessage").html("<font color='red'>用户名或密码错误!</font>");
			}
		}
	});
}
</script>
<body>
<form id="Loginform" method="post">
<div>

<div class="divname1">
<p align="center">
<font face="楷体" color="green" style="font-size: 55px;">Sunny's Diary</font><br>
<font face="楷体" color="green" style="font-size: 30px;">吴莹莹的日记</font>
</p>
</div>
<div id="logindiv">
<p id="errormessage"></p>
用户名：<input type="text" name="userName">
<br><br>
密   &nbsp;&nbsp; 码：<input type="password" name="password">
<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" value="登录" onclick="javaScript:Logininfo()">
&nbsp;&nbsp;&nbsp;
<input type="reset" value="重置">
	</div>
	</div>
	</form>
</body>
</html>