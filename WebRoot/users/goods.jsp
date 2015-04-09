<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'goods.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/css.css">

  </head>
	 <div class="header">
	  <div class="top"> <img class="logo" src="images/logo.jpg" />
	    <ul class="nav">
	      <li><a href="MyJsp.jsp">首页</a></li>
	      <li><a href="merchant.jsp">个人中心</a></li>
	      <li class="seleli"><a href="goods.jsp">商品管理</a></li>
	      <li><a href="order.jsp">订单管理</a></li>
	      <li><a href="#">管理</a></li>
	    </ul>
	  </div>
	</div>
	<div class="container">
	  <div class="leftbar">
	    <div class="lm01"> <img class="peptx" src="images/tximg.jpg" />
	      <div class="pepdet">
	        <p class="pepname">李小雅</p>
	        <p>李小雅</p>
	        <p>江苏话务一部三组</p>
	      </div>
	      <div class="clear"></div>
	    </div>
	    <div class="lm02">
	      <div class="title"><img class="icon" src="images/dataicon.jpg" />
	        <h2>日历</h2>
	      </div>
	      <jsp:include page="calendar.jsp" flush="true"/>
	    </div>
	    <div class="lm03">
	      <div class="title"><img style="padding-right:5px;" class="icon" src="images/weaicon.jpg" />
	        <h2>天气</h2>
	      </div>
	      <iframe allowtransparency="true" frameborder="0" width="140" height="203" scrolling="no" src="http://tianqi.2345.com/plugin/widget/index.htm?s=2&z=1&t=1&v=1&d=2&bd=0&k=&f=&q=1&e=1&a=1&c=59287&w=140&h=203&align=center"></iframe>
	    </div>
	  </div>
	  <div>
	  <form actiom="UploadwithServlet" method="post" ENCTYPE="multipart/form-data">
	  	<div>
	  	<input type="FILE" name="agoods" value="---添加商品---">
	  		<input type="submit" name="addgoods" value="---添加商品---">
	  	</div>
	  </form>
	  	<div>
	  		商品类型：
	  		<select>
	  			<option>全部</option>
	  			<option>食品</option>
	  			<option>住宿</option>
	  		</select>
	  	</div>
	  </div>
	</div>
	<div class="footer"></div>
  <body>
    
  </body>
</html>
