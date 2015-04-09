<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'registration.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="registers.css">

  </head>
  
  <body>
    <div class = "register">
    	<table>
			<tr>
				<th>申请人：</th><th><input type = "text" name = "username"></th>
			</tr>
			<tr>
				<th>邮箱：</th><th><input type = "text" name = "emil"></th>
			</tr>
			<tr>
				<th>电话：</th><th><input type = "text" name = "userphonee"></th>
			</tr>
			<tr>
				<th>学校：</th><th><input type = "text" name = "userschool"></th>
			</tr>
			<tr>
				<th>地址：</th><th><input type = "text" name = "useraddress"></th>
			</tr>
			<tr>
				<th>店铺名：</th><th><input type = "text" name = "userstore"></th>
			</tr>
			<tr>
				<th></th><th></th>
			</tr>
			<tr>
				<th colspan="2"><input type = "submit" name = "sure" value = "提交" class = "surebutton"></th>
			</tr>
		</table>
    </div>
  </body>
</html>
