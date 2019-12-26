<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin画面</title>
<script type="text/javascript" src = "./JavaScript/Main.js"></script>
</head>
<body>
	<div id = "header">
	</div>

	<div id = "main">

		<div id = "top">

		</div>
		<table>
		<tr>
			<td>
						<span>商品</span>
			<s:form action = "ItemCreateAction">
				<s:submit value = "新規登録"/>
			</s:form>

			<s:form action = "ItemListAction">
				<s:submit value = "一覧"/>
			</s:form>
         </td>

         <td>
			<span>ユーザー</span>
			<s:form action = "UserCreateAction">
				<s:submit value = "新規登録"/>
			</s:form>

			<s:form action = "UserListAction">
				<s:submit value = "一覧"/>
			</s:form>
			</td>
		</tr>

		</table>
		<div class="slider">
		<div><img src="./jpg/Chrysanthemum.jpg"></div>
		<div><img src="./jpg/Desert.jpg"></div>

		</div>

		<p><a href = '<s:url action = "LogoutAction"/>'>ログアウト</a></p>
	</div>

	<div id = "footer">
	</div>
</body>
</html>