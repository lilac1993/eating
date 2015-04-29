<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/css.css">
<title>Insert title here</title>
</head>
<body>
<object id="WebBrowser" width=0 height=0 classid="CLSID:8856F961-340A-11D0-A96B-00C04FD705A2"></object> 
<div class="goods_table">
			
			
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
					<% for(int i=0;i<15;i++){
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
				
				<input type=button value="打印本单据" onclick="javascript:printit('tb');"> 
				<a href="#" onClick="parent.tb.focus();webprint(0)" style="color: black;">打印预览</a>&nbsp;
				<a style="color: black;" href="#" onClick="document.all.WebBrowser.execWB(6,1);">打印</a>&nbsp;
				<a style="color: black;" href="#" onClick="document.all.WebBrowser.execWB(8,1);">打印设置</a>&nbsp;
			</div>
<script type="text/javascript">
	function webprint(n){
		switch(n){
			case 0:WebBrowser.execWB(7,1);break;
			case 1:document.all.WebBrowser.execWB(6,1);break;
			case 2:document.all.WebBrowser.execWB(8,1);break;
		}
	}
	</script>
</body>
</html>