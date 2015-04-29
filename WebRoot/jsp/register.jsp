<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />
<title>我是吃货商家注册</title>
<link rel="stylesheet" type="text/css" href="../css/css.css">

</head>


<body style="background-image:url(../photo/bj.jpg);background-size:100% ,100%;">
	<br/><br/>
	<div class="resgiter_form">
		<form action="" method="post"  name="form" style="margin-left:40px;">
		<br/><br/>
		账&nbsp;&nbsp;号&nbsp;&nbsp;：<input type="text" name="username" class="register_text"/><br/><br/>
	          密&nbsp;&nbsp;码&nbsp;&nbsp;：<input type="password" name="password" class="register_text"/><br/><br/>
		商店名称：<input type="text" name="name" class="register_text"/><br/><br/>
		头&nbsp;&nbsp;像&nbsp;&nbsp;：<input type="text" name="fileName1" class="register_file"/><input type="file"  name="file1" size=0 style="display:none;"/>
			<a href="javascript:fn_file(1)"><img src="../photo/folder_open.gif"/></a><br/><br/>
		营业执照：<input type="text" name="fileName2" class="register_file"/><input type="file"  name="file2" size=0 style="display:none;"/>
			<a href="javascript:fn_file(2)"><img src="../photo/folder_open.gif" /></a>
		<br/><br/>
		营业范围：<input type="checkbox" name="range" class="register_box" value="001"/>（美食）外卖&nbsp;
				<input type="checkbox" name="range" class="register_box" value="010"/>&nbsp;娱乐&nbsp;
				<input type="checkbox" name="range" class="register_box" value="011"/>&nbsp;住宿&nbsp;<br/><br/>
		所属学校：<select name="school" class="register_text"><option value="null"> </option>
								<option value="nfsy">中山大学南方学院</option>
								<option value="nfsy">中山大学南方学院</option>
							</select><br/><br/>
		具体地址：<input type="text" name="place" class="register_text"/><br/><br/>
		商家电话：<input type="text" name="phone" class="register_text"/><br/><br/>
		负&nbsp;责人&nbsp;：<input type="text" name="private" class="register_text"/><br/><br/>
		负责人身份证照：<input type="text" name="fileName3" class="register_id"/><input type="file"  name="file3" size=0 style="display:none;"/>
			<a href="javascript:fn_file(3)"><img src="../photo/folder_open.gif" /></a><br/><br/>
		负责人联系电话：<input type="text" name="private_id" class="register_phone"/><br/><br/>
		联系邮箱：<input type="text" name="email" class="register_text"/><br/><br/>
		
		
		
		</form>

	</div>

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
</body>
</html>