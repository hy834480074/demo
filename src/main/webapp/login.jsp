<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet">
<link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
<link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link href="/js/css/login.css" rel="stylesheet">
<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
 	$(function(){
 			function set(set,st){
 			$("form").attr(set,st);
			$("form").submit();
 			}
		$(":button").click(function(){
			var name = $(":text[name='name']").val();
			var password = $(":text[name='password']").val();
			var choose = $(this).text();
			$.ajax({
				url:"user/login",
				type:"post",
				dataType:"text",
				data:{
					"choose":choose,
					"name":name,
					"password":password
				},
				success:function(data){
					if(data==="success"){
						set("action","user/lookAll")
					}else if(data==="sb"){
						alert("账号密码错误")
						set("action","user/back")
					}else{
						set("action","user/register")
					}
				}
			})
		})
	}) 
</script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<div class="coco">
	
	<form action="javascript:void(0)">
	<table class="table table-condensed" id="ooxxx">
		<tr>
			<td>
		 		<label for="exampleInputEmail1">请输入账户：</label><br>
			</td>
			<td>
				<input type="text" class="form-control" id="exampleInputEmail1" name="name"/>
			</td>
		</tr>
		
		
		<tr>
			<td>
		 		<label for="exampleInputPassword1">请输入密码：</label>
			</td>
			<td>
				<input type="text" class="form-control" id="exampleInputPassword1" name="password"/>
			</td>
		</tr>
		
		
		
		<tr>
			<td>
		 		<label>&nbsp&nbsp&nbsp<input type="checkbox" />记住密码</label>
			</td>
			<td>
				<label>&nbsp</label>
			</td>
		</tr>
		
		<tr>
			<td>
		 		<button name="choose"  class="btn btn-warning">登录</button>
			</td>
			<td>
				<button name="choose"  class="btn btn-warning">注册</button>
			</td>
		</tr>
	</table>
	</form>
	<div id="duo">
			<svg height="300px" width="400px">
			<circle cx="200" cy="150" r="100" fill="#000000"></circle>
			<circle cx="200" cy="150" r="98" fill="#5ccff0"></circle>
			<circle cx="200" cy="168" r="80" fill="#ffffff"></circle>
			<circle cx="180" cy="90" r="20" fill="#000000"></circle>
			<circle cx="220" cy="90" r="20" fill="#000000"></circle>
			<circle cx="180" cy="90" r="19" fill="#FFFFFF"></circle>
			<circle cx="220" cy="90" r="19" fill="#FFFFFF"></circle>
			<circle cx="190" cy="92" r="5" fill="#000000"></circle>
			<circle cx="210" cy="92" r="5" fill="#000000"></circle>
			<circle cx="200" cy="110" r="14" fill="#000000"></circle>
			<circle cx="200" cy="110" r="13" fill="#ff0000"></circle>
			<circle cx="200" cy="182" r="58" fill="#ff0000"></circle>
			<rect x="140" y="124" width="120" height="58" fill="#ffffff"></rect>
			<rect x="199" y="124" width="1" height="58" fill="#000000"></rect>
			<rect x="210" y="130" width="40" height="1" fill="#000000"></rect>
			<rect x="152" y="130" width="40" height="1" fill="#000000"></rect>
			<rect x="210" y="150" width="50" height="1" fill="#000000"></rect>
			<rect x="142" y="150" width="50" height="1" fill="#000000"></rect>
			<rect x="210" y="170" width="60" height="1" fill="#000000"></rect>
			<rect x="132" y="170" width="60" height="1" fill="#000000"></rect>
			</svg>
	</div>
</div>
</body>
</html>