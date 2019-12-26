<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script  src = "http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザーリスト画面</title>
<script type="text/javascript" src = "./JavaScript/Main.js"></script>
</head>
<body>
	<div id = "header">
	</div>

	<div id = "main">

		<div id = "top">
		</div>
		<table border = "1">
		 <s:iterator value = "userList">
			<tr>
				<th>ID</th>
				<th>ログインID</th>
				<th>ログインパスワード</th>
				<th>ユーザーネーム</th>
				<th>登録日</th>
				<th>更新日</th>
				<th>個別削除</th>
			</tr>

			<tr>
				<td><s:property value = "id"/></td>
				<td><s:property value = "login_id"/></td>
				<td><s:property value = "login_pass"/></td>
				<td><s:property value = "user_name"/></td>
				<td><s:property value = "insert_date"/></td>
				<td><s:property value = "update_date"/></td>
				<td><a href = '<s:url action = "UserSingleDeleteAction"><s:param name ="id" value = "%{id}"/></s:url>'>削除</a></td>
			</tr>
		</s:iterator>
		</table>

		<s:form	action = "UserListDeleteAction">
			<s:submit value = "削除"/>
		</s:form>

		<p><input type = "button" value = "管理者画面に戻る" Onclick = "submitAction('AdminAction')"/><p>
	</div>



	<div id = "footer">
	</div>
</body>
</html>