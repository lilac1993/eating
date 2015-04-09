<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>商家管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/css.css"/>

  </head>
  
  <body>
	 <div class="header">
	  <div class="top"> <img class="logo" src="images/logo.jpg" />
	    <ul class="nav">
	      <li class="seleli"><a href="MyJsp.jsp">首页</a></li>
	     
	      <li><a href="goods.jsp">商品管理</a></li>
	      <li><a href="order.jsp">订单管理</a></li>
	      <li><a href="#">管理</a></li>
	    </ul>
	    
	  </div>
	</div>
	<div class="container">
	  <div class="leftbar">
	    <div class="lm01"> <img class="peptx" src="images/tximg.jpg" />
	      <div class="pepdet">
  			<br/>嗨，<%=request.getAttribute("store") %><br/><br></br>欢迎你的到来<br/><br/><br/>
	      </div>
	      <div class="clear">
	      	负责人：<%=request.getAttribute("name") %><br/>
	      	电话：<%=request.getAttribute("phone") %><br/>
	      	地址：<%=request.getAttribute("address") %><br/>
	      	邮箱：<%=request.getAttribute("email") %><br/>
	      	学校：<%=request.getAttribute("school") %><br/>
	      </div>
	    </div>
	    <div class="lm02">
	      <div class="title"><img class="icon" src="images/dataicon.jpg" />
	        <h2>日历</h2>
	      </div>
	      <jsp:include page="calendar.jsp" flush="true"/>
	    </div>
	    <div class="lm03">
	      <div class="title"><img style="padding-right:5px;" class="icon" src="images/weaicon.jpg" />
	        <h2>最新评论</h2>
	      </div>
			<div>
			
			</div>
	    </div>
	  </div>
	  
	  <div class="mainbody">
	    <div class="right">
	    
	    <div class="rig_lm01">
	    	<div>
	        	早上好，<%=request.getAttribute("store") %>
  			<div> 
  				<iframe allowtransparency="true" frameborder="0" width="410" height="98" scrolling="no" src="http://tianqi.2345.com/plugin/widget/index.htm?s=1&z=1&t=1&v=0&d=2&bd=0&k=&f=&q=1&e=1&a=1&c=54511&w=410&h=98&align=center"></iframe>
  			</div>
	      </div>
	      <div class="title"><img src="images/listicon.jpg" class="icon" style="padding-top:13px;">
	        <h2>讯息</h2>
	      </div>
	      <div class="detail">
	        <div class="dat01"> <img src="images/bs_04.jpg">
	          	你有N条为处理的订单	
	        </div>
	        <div class="dat02"> <img src="images/bs_04.jpg">
	        	你有N条未看的评论
	        </div>
	        <div class="dat03"> <img src="images/bs_04.jpg">
	        	关于双十一的到来，我公司推出双十一特惠活动
	        </div>
	      </div>
	      </div>
	      
	    </div>
	    <div class="right_top_2">
  			这里是一个排行榜
  			</div>
	    <div class="rig_lm02">
	      <div class="title"><img src="images/listicon.jpg" class="icon" style="padding-top:13px;">
	        <h2>统计表</h2>
	      </div>
	      <div class="detail">
	        <div class="det_inner">
	          <image src="images/lineAndShap.png">
	        </div>
	      </div>
	    </div>
	    <div class="rig_lm03">
	      <div class="title"><img src="images/listicon.jpg" class="icon" style="padding-top:13px;">
	        <h2>待办事项</h2>
	      </div>
	      <div class="detail">
	        <div class="inner03">
	          
	        </div>
	      </div>
	    </div>
	  </div>
	</div>
	<div class="jiao"><br/>
				本网站产品和服务有广州广之旅国际旅行社股份有限公司提供。任何单位或个人认为本网站内容可能涉嫌侵犯<br/>
				其著作权，请及时向我司提出书面权利通知和相关证明，我司收到书面通知及证明后将依法尽快处理。<br/>
					© 2013 www.gzl.com.cn &nbsp;版权所有|ICP经营许可号：&nbsp;粤ICP备13071273号-2
					<br/>联系电话：&nbsp;135&nbsp; 245&nbsp; 2009
	</div>
  </body>
</html>
