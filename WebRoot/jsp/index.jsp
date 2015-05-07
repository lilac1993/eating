<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
    <%@ page import="chart.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />


<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../css/media.css" type="text/css" media = "only screen and (max-width:1145px)" />
<link rel="stylesheet" type="text/css" href="../css/css.css">
<title>我是吃货-首页</title>
<style type="text/css">

html, body { height: 100%; margin: 0; padding: 0;width:100%; background:#4a576c;}


.footer{margin-top:50px;text-align:center;color:#666;font:bold 14px Arial}
.footer a{color:#999;text-decoration:none}
#wrapper-250{width:100%;float:left}

</style>
</head>
<body>

<% %>
<div class="index_right">
		<div class="index_right_float">
			
			<div class="navigation_div" >
				<ul style="">
					<li class="navigation"><a href="index.jsp"><span>首页</span></a></li>
					<li class="navigation"><a href="goods.jsp"><span>商品管理</span></a></li>
					<li class="navigation"><a href="orders.jsp"><span>订单管理</span></a></li>
					<li class="navigation"><a href="comment.jsp"><span>评论管理</span></a></li>
					<li class="navigation"><a href="statistics.jsp"><span>统计查询</span></a></li>
					<li class="navigation_end"><a href="informations.jsp"><span>资料管理</span></a></li>
				</ul>
			</div>
			<div class="wn">
				<div class="weather">
				</div>
				<div class="news">
				</div>
			</div>
			<div class="ranking"> 
		
			</div>
			<div class="in_statistic">
				<%jchart f=new jchart();%>
				<img alt="" src="../servlet/jchart"/ style="display: none">
				<img alt="" src="../tjimages/tj3.png" width=100% height=100%/>
				
			</div>
			<div class="in_order">
			<div id="tablit">
					<dl>
						<dt></dt>
						<dd class="on"><p class="tab_b">食品</p></dd>
						<dt></dt>
						<dd class="out"><p class="tab_b">住宿</p></dd>
						<dt></dt>
						<dd class="out"><p class="tab_b">娱乐</p></dd>
						<dt></dt>
					</dl>
					<br/>
				 <div class="tabcon">
				 <table>
					<tr>
					<td class="tab_li1"> 订单号</td><td class="tab_li2"> 商品名</td><td class="tab_li3"> 用户名</td>
					<td class="tab_li1"> 联系电话</td><td class="tab_li1"> 所在学校</td><td class="tab_li1">所在宿舍</td>
					<td class="tab_li1"> 订单备注</td><td class="tab_li1"> 订单状态</td>
					</tr>
					<tr><td class="tab_li"><a href="" class="tab_li" >xxx</a></td>
						<td class="tab_li">xxxxx</td>
							<td class="tab_li3">500</td></tr>
					</table>
				 </div>
					<div class="tabcon dis" style="display: none">
					<table>
						<tr>
						<td class="tab_li1">订单号</td><td class="tab_li2"> 使用时间</td><td class="tab_li3">入住类型</td>
						<td class="tab_li1">联系电话</td><td class="tab_li1">数量</td><td class="tab_li1">用户名</td>
						<td class="tab_li1">订单备注</td><td class="tab_li1">订单状态</td>
						</tr>
							<tr><td class="tab_li"> <a href="" class="tab_li" >xxxx</a></td>
							<td class="tab_li">xxxx</td>
								<td class="tab_li3">5001</td></tr>
					</table>	
					</div>
					<div class="tabcon dis"style="display: none">
					<table>
						<tr>
						<td class="tab_li1">订单号</td><td class="tab_li2"> 使用时间</td><td class="tab_li3">娱乐类型</td>
						<td class="tab_li1">联系电话</td><td class="tab_li1">数量</td><td class="tab_li1">用户名</td>
						<td class="tab_li1">订单备注</td><td class="tab_li1">订单状态</td>
						</tr>
						<tr><td class="tab_li"> <a href="" class="tab_li" >xxxx</a></td>
							<td class="tab_li">xxxtd>
								<td class="tab_li3">xxx</td></tr>
					</table>	
					</div>
				</div>
			
			</div>
		</div>
	</div>
	<div class="index_left">
		<div class="chihuo"></div>
		<div class="me" style="">
			
		</div>
		<div id="wrapper-250" >
			  <ul class="accordion">
			    <li id="one" class="files"><a href="#one">商品管理<span>495</span></a>
			      <ul class="sub-menu">
			        <li><a href="#"><em>01</em>查看商品<span>42</span></a></li>
			        <li><a href="goods.jsp#one#addgoods"><em>02</em>添加商品<span>87</span></a></li>
			        <li ><a href="javascript:find();"><em>03</em>查找</a></li>
			        <li style="display: none" id="find"><a href="#" ><em>04</em>Dropbox<span>1</span></a></li>
			        <li><a href="#"><em>05</em>Skydrive<span>10</span></a></li>
			      </ul>
			    </li>
			    <li id="two" class="mail"> <a href="#two">订单管理<span>26</span></a>
			      <ul class="sub-menu">
			        <li><a href="#"><em>01</em>Hotmail<span>9</span></a></li>
			        <li><a href="#"><em>02</em>Yahoo<span>14</span></a></li>
			      </ul>
			    </li>
			    <li id="three" class="cloud"> <a href="#three">统计查询<span>58</span></a>
			      <ul class="sub-menu">
			        <li><a href="#"><em>01</em>连接<span>12</span></a></li>
			        <li><a href="#"><em>02</em>简介<span>19</span></a></li>
			        <li><a href="#"><em>03</em>设置<span>27</span></a></li>
			        <li><a href="#"><em>04</em>Connect<span>12</span></a></li>
			        <li><a href="#"><em>05</em>Profiles<span>19</span></a></li>
			        <li><a href="#"><em>06</em>Options<span>27</span></a></li>
			      </ul>
			    </li>
			    <li id="four" class="jc"> <a href="#four">基础资料管理</a>
			      <ul class="sub-menu">
			        <li><a href="#"><em>01</em>查看基础资料</a></li>
			        <li><a href="#"><em>02</em>基础资料修改</a></li>
			        <li><a href="#"><em>03</em>关于我是吃货</a></li>
			      </ul>
			    </li>
				
				<li id="five" class="sign"> <a href="#five">退出</a>
			      <ul class="sub-menu">
			        <li><a href="#"><em>01</em>注销</a></li>
			        <li><a href="#"><em>02</em>关闭</a></li>
			        <li><a href="#"><em>03</em>冻结账户</a></li>
			      </ul>
			    </li>
			  </ul>
		</div>
<script type="text/javascript">
		$(document).ready(function() {
			// Store variables
			var accordion_head = $('.accordion > li > a'),
				accordion_body = $('.accordion li > .sub-menu');
			// Open the first tab on load
			accordion_head.first().addClass('active').next().slideDown('normal');
			// Click function
			accordion_head.on('click', function(event) {
				// Disable header links
				event.preventDefault();
				// Show and hide the tabs on click
				if ($(this).attr('class') != 'active'){
					accordion_body.slideUp('normal');
					$(this).next().stop(true,true).slideToggle('normal');
					accordion_head.removeClass('active');
					$(this).addClass('active');
				}
			});
		});
	</script>
<script type="text/javascript">

				var mDD = document.getElementById("tablit").getElementsByTagName("dd");
				var mDIV= document.getElementById("tablit").getElementsByTagName("div");


				for (var i=0;i<mDD.length;i++){
				 (function(index) {
				  mDD[index].onclick = function() {
				   if (mDD[index].className == 'out') {
					for (var j = 0; j < mDD.length; j++) {
					 mDD[j].className = 'out';
					 mDIV[j].style.display = 'none';
					}
					mDD[index].className = 'on';
					mDIV[index].style.display = 'block';
				   }
				  }

				 })(i);
				}

</script>
	</div>
	<div class="foot">
		该版权为“我是吃货”团队共同所有，盗版必究！<br/>我是吃货，让每个吃货都体会美食的幸福！<br/>
		联系电话：13502452009
	</div>
<script type="text/javascript"  src="../js/jquery.min.js"></script>

</body>
</html>