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

</head>

<body>
<script type="text/javascript">
$(function(){
	
	$("#menuManager").datagrid({
			idField : "empNo", // 支持跨页选择
			url:"<%=basePath%>menu/menulist",
			height:200,
			fit:true,
			fitColumns:true,
			singleSelect: true,
			cache:false,
			pagination: true,
			pageList: [10, 15, 20, 25, 30, 40, 50],  
//	        pageSize: 10, 
// 			toolbar:"#fanhui",
			columns:[[
				{title:"菜单名称",field:"menuName",width:100}
				,{title:"父级菜单",field:"parentMenuName",width:100}
				,{title:"菜单url",field:"menuUrl",width:200}
				,{title:"更新日期 ",field:"updateDate",width:100,formatter:TimeFormatter}
				,{title:"操作",field:"aa",width:100,align:"center", formatter:function(val,data,index){
					var	str="<a href='javascript:todelete("+data.menuId+")'>删除</a>&nbsp;";
				return str;
		}}
	]]
	
	});
	
	var p = $('#menuManager').datagrid('getPager');  
    $(p).pagination({  
        pageSize: 10,//每页显示的记录条数，默认为10  
//        pageList: [5,10,15],//可以设置每页记录条数的列表  
        beforePageText: '第',//页数文本框前显示的汉字  
        afterPageText: '页    共 {pages} 页',  
        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',  
        onBeforeRefresh:function(){ 
           $(this).pagination('loading'); 
            $(this).pagination('loaded'); 
        }  
    });  
	
	
	
	
	
});



</script>


  <table id="menuManager"></table>
</body>
</html>