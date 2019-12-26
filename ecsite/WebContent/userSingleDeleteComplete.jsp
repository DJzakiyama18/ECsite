<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script  src = "http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>



<script type="text/javascript" src = "./JavaScript/Main.js"></script>


<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>削除成功画面</title>
</head>
<body>
	<div id = "header">
	</div>

	<div id = "main">

		<div id = "top">
			<h1>削除成功しました</h1>
		</div>


		<s:form>
			 <p><input type = "button" value = "管理者画面に戻る" Onclick = "submitAction('AdminAction')"/><p>
		</s:form>
	</div>

	<div id = "footer">
	</div>
</body>
</html>