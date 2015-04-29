<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />
    <title>我是吃货后台登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="../css/css.css">
  </head>
  
  <body>
    
    <div  class="k" >
    	<form action=""  method="post">
    		<BR/><BR/><BR/>
			<img alt="" src="../photo/title.png" width=330px height=100px/><br><br>
    		<div style="float:left; padding-left:25px"><img src="../photo/pig1.png" width="25px" height="25px" /></div>&nbsp;账&nbsp;&nbsp;号：<input type="text" name="name" style="width:180px; height:25px;" placeholder="手机/邮箱/用户名"/><BR/><BR/><BR/>
    		<div style="float:left; padding-left:25px"><img src="../photo/suo.png" width="25px" height="25px" /></div>&nbsp;密&nbsp;&nbsp;码：<input type="password" name="password" style="width:180px; height:25px;"/><BR/><BR/><BR/>
    		<div style="padding-left:25px; font-size:14px; float:left;width:300px"><input type="checkbox"  />  下次登录<span style="font-size:14px; float:right; padding-right:25px"><a href="">忘记密码</a></span><BR/><BR/><BR/>
    		<input type="submit" value="登录" class="button" style="display: block;border:none;background-image:url(../photo/denglu.png);background-size:100% 100%;height: 25px;text-indent: -9999em;width:60px;float:left;margin-left:35px;"/>
    		<input type="button" value="注册" class="button" style="display: block;border:none;background-image:url(../photo/zhuce.png);background-size:100% 100%;height: 25px;text-indent: -9999em;width:60px;float:right;margin-right:35px;" onclick="register()"/>
    		
    		</div>
    	
    	</form>
    </div>
    <script>
    function register(){
    window.location.href="register.jsp";
    }
    </script>
  </body>
</html>

