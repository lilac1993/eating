<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/css.css">
<title>我是吃货-商品管理</title>
<script language="javascript"> 

function preview() { 

bdhtml=window.document.body.innerHTML; 
sprnstr="<!--startprint-->"; 
eprnstr="<!--endprint-->"; 
prnhtml=bdhtml.substr(bdhtml.indexOf(sprnstr)+17); 
prnhtml=prnhtml.substring(0,prnhtml.indexOf(eprnstr)); 
window.document.body.innerHTML=prnhtml; 
window.print(); 

} 

</script>
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
			<div class="goods_table">
			
			<!--startprint-->
			<object id="WebBrowser" width=0 height=0 classid="CLSID:8856F961-340A-11D0-A96B-00C04FD705A2"></object> 
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
					<tfoot><tr><td>dsafa</td></tr></tfoot>
				</table>
				<!--endprint-->
				<a href='#' onclick="preview()">预览并打印</a> 
				<a href="#" onClick="parent.tb.focus();webprint(0)" style="color: black;">打印预览</a>&nbsp;
				<a style="color: black;" href="#" onClick="document.all.WebBrowser.execWB(6,1);">打印</a>&nbsp;
				<a style="color: black;" href="#" onClick="document.all.WebBrowser.execWB(8,1);">打印设置</a>&nbsp;
			</div>
			</div>
	</div>
	<div class="goods_left">
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
	
function preview() { 

bdhtml=window.document.body.innerHTML; 

sprnstr="<!--startprint-->"; 

eprnstr="<!--endprint-->"; 

prnhtml=bdhtml.substr(bdhtml.indexOf(sprnstr)+17); 

prnhtml=prnhtml.substring(0,prnhtml.indexOf(eprnstr)); 

window.document.body.innerHTML=prnhtml; 

window.print(); 

}         
}  
</script>
<script language="javascript" type="text/javascript"> 

          
</script>
</body>
</html>