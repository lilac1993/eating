<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/css.css">
<title>我是吃货-资料管理</title>

</head>
<body style="clear:both;background:url(../photo/2.png) no-repeat;background-size:100%,100%;">
	<div class="informations">
		<div class="chihuo" style="width:200px"></div>
		<div class="navigation_div" style="width:700px;float:right;" >
				<ul style="">
					<li class="navigation" style="width:100px"><a href="index.jsp"><span>首页</span></a></li>
					<li class="navigation" style="width:113px"><a href="goods.jsp"><span>商品管理</span></a></li>
					<li class="navigation" style="width:113px"><a href="orders.jsp"><span>订单管理</span></a></li>
					<li class="navigation" style="width:113px"><a href="comment.jsp"><span>评论管理</span></a></li>
					<li class="navigation" style="width:113px"><a href="statistics.jsp"><span>统计查询</span></a></li>
					<li class="navigation_end" style="width:113px"><a href="informations.jsp"><span>资料管理</span></a></li>
				</ul>
		</div>
		<div class="information_form">
			<form action="" method="post">
				
		商店名称：<input type="text" name="name" class="register_text" style="border:0px" value="潮记"/><br/><br/>
		头&nbsp;&nbsp;像&nbsp;&nbsp;：<input type="text" name="fileName1" class="register_file"/><input type="file"  name="file1" size=0 style="display:none;"/>
			<a href="javascript:fn_file(1)"><img src="../photo/folder_open.gif"/></a><br/><br/>
		营业执照：<input type="text" name="fileName2" class="register_file" style="border:0px"/><input type="file"  name="file2" size=0 style="display:none;"/>
			<a href="javascript:fn_file(2)"><img src="../photo/folder_open.gif" /></a>
		<br/><br/>
		营业范围：<br/><br/>
		所属学校：<select name="school" class="register_text" style="border:0px; overflow: hidden;"><option value="null"> </option>
								<option value="nfsy">中山大学南方学院</option>
								<option value="nfsy">中山大学南方学院</option>
							</select><br/><br/>
		具体地址：<input type="text" name="place" class="register_text" style="border:0px"/><br/><br/>
		商家电话：<input type="text" name="phone" class="register_text" style="border:0px"/><br/><br/>
		负&nbsp;责人&nbsp;：<input type="text" name="private" class="register_text" style="border:0px"/><br/><br/>
		负责人身份证照：<input type="text" name="fileName3" class="register_id"/><input type="file"  name="file3" size=0 style="display:none;"/>
			<a href="javascript:fn_file(3)"><img src="../photo/folder_open.gif" /></a><br/><br/>
		负责人联系电话：<input type="text" name="private_id" class="register_phone" style="border:0px"/><br/><br/>
		联系邮箱：<input type="text" name="email" class="register_text" style="border:0px"/><br/><br/>
			</form>
		</div>
	</div>
		<div class="foot">
		该版权为“我是吃货”团队共同所有，盗版必究！<br/>我是吃货，让每个吃货都体会美食的幸福！<br/>
		联系电话：13502452009
	</div>
</body>
</html>