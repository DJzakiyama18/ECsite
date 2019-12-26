<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アイテム削除画面</title>
</head>
<body>
	<div id = "header">
	</div>

	<div id = "main">

		<div id = "top">
		<h1>削除してもよろしいですか</h1>
		</div>
		<table>
		<tr>
			<td>
			<s:form action = "ItemDeleteCompleteAction">
				<s:submit value = "OK"/>
			</s:form>
			</td>


			<td>
			<s:form action = "ItemListAction">
				<s:submit value = "キャンセル"/>
			</s:form>
			</td>
		</tr>
		</table>
	</div>

	<div id = "footer">
	</div>
</body>
</html>