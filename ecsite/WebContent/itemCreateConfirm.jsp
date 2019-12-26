<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>画面</title>
</head>
<body>
	<div id="header"></div>

	<div id="main">

		<div id="top"></div>
	<table>
			<s:form action="ItemCreateCompleteAction">

					<tr>
						<td>商品名</td>
						<td><s:property value="session.item_name" /></td>

					</tr>

					<tr>
						<td>値段</td>
						<td><s:property value="session.item_price" /></td>
					</tr>

					<tr>
						<td>在庫</td>
						<td><s:property value="session.item_stock" /></td>
					</tr>

				<s:submit value="登録" />
			</s:form>
	</table>
	</div>
	<div id="footer"></div>
</body>
</html>