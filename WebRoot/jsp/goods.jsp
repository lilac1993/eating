<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />
<link rel="stylesheet" href="../css/media.css" type="text/css" media = "only screen and (max-width:835px)" />
<link rel="stylesheet" type="text/css" href="../css/css.css">
<link rel="stylesheet" href="../css/style.css" type="text/css" media="screen" />
<title>我是吃货-商品管理</title>
<script language="javascript"> 

function preview() { 

bdhtml=window.document.body.innerHTML;  //获取网页内容
sprnstr="<!--startprint-->"; //设置打印内容开始区
eprnstr="<!--endprint-->";  //设置打印内容结束区
prnhtml=bdhtml.substr(bdhtml.indexOf(sprnstr)+17);  //+17是长度的意思，也就是说，以<!--startprint-->字符串后才是内容打印区
prnhtml=prnhtml.substring(0,prnhtml.indexOf(eprnstr)); 
window.document.body.innerHTML=prnhtml; 
window.print(); 
//substr:是取字符串
//IndexOf():是查找字串中指定字符或字串首次出现的位置,17是长度
} 

</script>
	<script type="text/javascript">
 	function fn_file(i)
 	{
 		if(i==1){
 		window.document.form.file1.click(); 
 		window.document.form.fileName1.value = window.document.form.file1.value; 
 		}if(i==2){
 		window.document.form.file2.click(); 
 		window.document.form.fileName2.value = window.document.form.file2.value;
 		alert("dfg"); 
 		}if(i==1){
 		window.document.form.file3.click(); 
 		window.document.form.fileName3.value = window.document.form.file3.value; 
 		}
 		
 	}
</script>
</head>
<body>
<object id="WebBrowser" width=0 height=0 classid="CLSID:8856F961-340A-11D0-A96B-00C04FD705A2"></object> 

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
			<div class="goods_table">
			
			<!--startprint-->
			
				<table class="table" id="tb" >
					<thead class="good_thead" style="display:table-header-group;">
						<tr>
							<td class="goods_td">序号</td>
							<td class="goods_td">商品名</td>
							<td class="goods_td">图片</td>
							<td class="goods_td">单价</td>
							<td class="goods_td">状态</td>
							<td class="goods_td">说明</td>
							<td class="goods_td">类型</td>
							<td class="goods_td">好评数</td>
							<td class="goods_td">差评数</td>
							<td class="goods_td">添加日期</td>
							<td class="goods_td">修改</td>
							<td class="goods_td">删除</td>
						</tr>
					</thead>
					<% for(int i=0;i<25;i++){
					
					%>
					<tr>
						<td class="goods_td">00<%out.print(i); %></td>
						<td class="goods_td">红烧牛肉面</td>
						<td class="goods_td">dsada</td>
						<td class="goods_td">15</td>
						<td class="goods_td">正常</td>
						<td class="goods_td">说明</td>
						<td class="goods_td">美食</td>
						<td class="goods_td">11</td>
						<td class="goods_td">0</td>
						<td class="goods_td">2015-4-15</td>
						<td class="goods_td">修改</td>
						<td class="goods_td">删除</td>
					</tr>
				<%} %>
					
				</table>
				<!--endprint-->
				<a href='#' onclick="preview()" style="color: black;">预览并打印</a> 
				<a href="#" onClick="webprint(0)" style="color: black;">打印预览</a>&nbsp;
				<a style="color: black;" href="#" onClick="document.all.WebBrowser.execWB(6,1);">打印</a>&nbsp;
				<a style="color: black;" href="#" onClick="document.all.WebBrowser.execWB(8,1);">打印设置</a>&nbsp;
			</div>
			
			<div class="goods_table" id="addgoods">
				<div class="addgoods" >
					<form action="" method="post">
						商品类型：<input type="checkbox" name="range" class="register_box" value="001"/>（美食）外卖&nbsp;
						<input type="checkbox" name="range" class="register_box" value="010"/>&nbsp;娱乐&nbsp;
						<input type="checkbox" name="range" class="register_box" value="011"/>&nbsp;住宿&nbsp;<br/><br/>
						商品名称：<input type="text" class="register_text"/><br/><br/>
						添加图片：<input type="text" name="fileName2" class="register_file"/><input type="file"  name="file2" size=0 style="display:none;"/>
								<a href="javascript:fn_file(2)"><img src="../photo/folder_open.gif" /></a><br/>
								<div style="width:440px;height:140px;">
									<img alt="" src=""/>
									<img alt="" src=""/>
									<img alt="" src=""/>
								</div>
						商品价格：¥<input type="text" style="width:100px;"/>元 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="checkbox" value="stop"/>停用<br/><br/>
						商品说明：<textArea cols="32" rows="7" name="context"></textArea><br/><br/>
						<input type="button" value="提交"/>  &nbsp;&nbsp;&nbsp;<input type="button" value="修改"/>
					</form>
				</div>
			</div>

		</div>
	</div>
	<div class="goods_left">
		<div class="chihuo"></div>
		<div class="me" style="">
			
		</div>
		<div id="wrapper-250">
			  <ul class="accordion">
			    <li id="one" class="files"> <a href="#one">商品管理<span>495</span></a>
			      <ul class="sub-menu">
			        <li><a href="#"><em>01</em>查看商品<span>42</span></a></li>
			        <li><a href="#"><em>02</em>添加商品<span>87</span></a></li>
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
	function find(){
		
		document.getElementById('find').style.display="block";
		
	}
	$(document).ready(function(){  
    document.getElementById('addgoods').style.display="none";
});

	</script>
	
	</div>
		<div class="foot">
		该版权为“我是吃货”团队共同所有，盗版必究！<br/>我是吃货，让每个吃货都体会美食的幸福！<br/>
		联系电话：13502452009
	</div>
<script type="text/javascript">
	function webprint(n){
		switch(n){
			case 0:document.all.WebBrowser.execWB(7,1);break;
			case 1:document.all.WebBrowser.execWB(6,1);break;
			case 2:document.all.WebBrowser.execWB(8,1);break;
		}
	} 
}  
	
</script>

</body>
</html>