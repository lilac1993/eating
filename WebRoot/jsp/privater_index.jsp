<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/css.css">
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen" />
<title>我是吃货</title>
</head>
<body>
	<div class="index_right">
			<div class="index_right_float">
				<div class="navigation_div" >
				<ul style="">
					<li class="navigation"><a href="index.jsp"><span>首页</span></a></li>
					<li class="navigation"><a href=""><span>食品</span></a></li>
					<li class="navigation"><a href=""><span>住宿</span></a></li>
					<li class="navigation"><a href=""><span>娱乐</span></a></li>
				</ul>
			</div>
			<div class="goods_table" id="goods_table">
				<div class="wtandinfor"></div>
				<div class="tabcon">
				 aaa
				 </div>
				<div class="tabcon dis" style="display: none;">
					<form action="" method="post">
						按<select>
							<option>商家名</option>
							<option>商家号</option>
						</select>
						<input type="text"/><input type="button" value="点击查询"/>
					</form>	
			
						<ul>
							<li class="p_li_1">商家号</li>
							<li class="p_li_1">商家名</li>
							<li class="p_li_2"><button>修改</button></li>
							<li class="p_li_2"><button>冻结</button></li>
							<li class="p_li_2"><button>删除</button></li><br/>
							<li class="p_li_1">商家号</li>
							<li class="p_li_1">商家名</li>
							<li class="p_li_2"><button onclick="">修改</button></li>
							<li class="p_li_2"><button onclick="">冻结</button></li>
							<li class="p_li_2"><button onclick="">删除</button></li><br/>
						</ul>
					
				</div>
				<div class="tabcon dis"style="display: none">
					ccc	
				</div>
				<div class="tabcon dis"style="display: none">
					ddd	
				</div>
				<div class="tabcon dis"style="display: none">
					eee	
				</div>
				<div class="tabcon dis"style="display: none">
					fff	
				</div>
				<div class="tabcon dis"style="display: none">
					ggg	
				</div>
				<div class="tabcon dis"style="display: none">
					hhh	
				</div>
				
			</div>
			</div>
	</div>
	<div class="goods_left">
	
	<div id="wrapper-250">
  <ul class="accordion" id="navigation">
    <li id="one" class="f_on"> <a href="#one"><dd class="f_on">首页<span>495</span></dd></a>
      <ul class="sub-menu">
      
      </ul>
    </li>
    <li id="two" class="f_out"> <a href="#two"><dd class="f_out">商家管理<span>26</span></dd></a>
      <ul class="sub-menu">
        <li><a href="#"><em>01</em>商家资料</a></li>
        <li><a href="#"><em>02</em>添加商家</a></li>
      </ul>
    </li>
    <li id="three" class="f_out"> <a href="#three"><dd class="f_out">用户管理<span>58</span></dd></a>
      <ul class="sub-menu">
        <li><a href="#"><em>01</em>用户资料</a></li>
        
      </ul>
    </li>
    <li id="four" class="f_out"> <a href="#four"><dd class="f_out">订单管理</dd></a>
      <ul class="sub-menu">
        <li><a href="#"><em>01</em>订单资料<span>10</span></a></li>
        <li><a href="#"><em>01</em>投诉资料</a></li>
       
      </ul>
    </li>
    <li id="five" class="f_out"> <a href="#five"><dd class="f_out">投诉管理</dd></a>
      <ul class="sub-menu">
        <li><a href="#"><em>01</em>未处理投诉</a></li>
        <li><a href="#"><em>02</em>基础资料修改</a></li>
        <li><a href="#"><em>03</em>关于我是吃货</a></li>
      </ul>
    </li>
    <li id="six" class="f_out"> <a href="#six"><dd class="f_out">公告管理</dd></a>
      <ul class="sub-menu">
        <li><a href="#"><em>01</em>公告管理</a></li>
        <li><a href="#"><em>02</em>通知商家</a></li>
        
      </ul>
    </li>
    <li id="seven" class="f_out"> <a href="#seven"><dd class="f_out">销售管理</dd></a>
      <ul class="sub-menu">
       
      </ul>
    </li>
	
	<li id="eight" class="f_out"> <a href="#eight"><dd class="f_out">退出</dd></a>
      <ul class="sub-menu">
        <li><a href="#"><em>01</em>注销</a></li>
        <li><a href="#"><em>02</em>关闭<span> </span></a></li>
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

				var mDD = document.getElementById("navigation").getElementsByTagName("dd");
				var mDIV= document.getElementById("goods_table").getElementsByTagName("div");


				for (var i=0;i<mDD.length;i++){
				 (function(index) {
				  mDD[index].onclick = function() {
				   if (mDD[index].className == 'f_out') {
					for (var j = 0; j < mDD.length; j++) {
					 mDD[j].className = 'f_out';
					 mDIV[j].style.display = 'none';
					 
					}
					
					mDD[index].className = 'f_on';
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

</body>
</html>