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
	
	$("#empinfo").datagrid({
			idField : "empNo", // 支持跨页选择
			url:"<%=basePath%>empController/queryEmpInfo",
			height:200,
			fit:true,
			cache:false,
			singleSelect: true,
			pagination: true,
			pageList: [10, 15, 20, 25, 30, 40, 50],  
//	        pageSize: 10, 
// 			toolbar:"#fanhui",
			columns:[[
				{title:"员工编号",field:"empNo",width:100}
				,{title:"员工姓名",field:"eName",width:100}
				,{title:"职位",field:"job",width:100}
				,{title:"入职日期 ",field:"hireDate",width:100}
				,{title:"工资",field:"sal",width:100}
				,{title:"描述",field:"comm",width:100}
				,{title:"所属部门",field:"deptNo",width:100}
				,{title:"操作",field:"aa",width:100,align:"center", formatter:function(val,data,index){
					var	str="<a href='javascript:todelete("+data.empNo+")'>删除</a>&nbsp;";
				return str;
		}}
	]]
	
	});
	
	var p = $('#empinfo').datagrid('getPager');  
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


  <table id="empinfo"></table>
</body>
</html>