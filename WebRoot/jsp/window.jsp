<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../css/css.css">
<link rel="shortcut icon" type="image/x-icon" href="../photo/pig.ico" media="screen" />
<title>Insert title here</title>
</head>
<script type="text/javascript">
x=0;
	function dianji(i){
		x=x+i;
		z=x%2;
		if(z==1){
		document.getElementById('onclick').style.display="block"; 
		}else{
		document.getElementById('onclick').style.display="none";
		}
		return x;
	}
</script>
<script type="text/javascript">
 	function fn_file()
 	{
 		window.document.form.file.click(); 
 		window.document.form.fileName.value = window.document.form.file.value; 
 		
 		
 	}
</script>

<body style="height: 610px;">
<br><input type="button" onclick="dianji(1)" value="上传">
 <span onclick="dianji(1)" ><a href="#"> sss</a></span>
	<div id="onclick">
		<form action="" method="post" name="form">
			商品号：<input type="text" name="shopId"/><br>
			商品名：<input type="text" name="shopName"/><br>
			商家ID：<input type="text" name="bussinesId"/><br>
			商品类型：<input type="radio" name="shopKind"/>xxx&nbsp;&nbsp;<input type="radio" name="shopKind"/>xxx
			&nbsp;&nbsp;<input type="radio" name="shopKind"/>xxx&nbsp;&nbsp;<input type="radio" name="shopKind"/>xxx<br>
			商品图片：<input type="text" name="fileName"/><input type="file"  name="file" size=0 style="display:none;"/>
			<a href="javascript:fn_file()"><img src="../photo/folder_open.gif"/></a><br/>
			单价：￥<input type="text" name="price"/><br/>
			商品信息：<input  type="text" name="shopInfornation"/><br/>
			<input type="submit" value="上传"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重新填写"/>
		</form>
	</div>
</body>
</html>