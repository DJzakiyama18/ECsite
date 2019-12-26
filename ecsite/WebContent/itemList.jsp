<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script  src = "http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アイテムリスト画面</title>
<script type="text/javascript" src = "./JavaScript/Main.js"></script>

</head>
<body>
	<div id = "header">
	</div>

	<div id = "main">

		<div id = "top">
		</div>
	<table border = "1">
		<s:iterator value = "itemList">

			<tr>
				<th>ID</th>
				<th>名前</th>
				<th>値段</th>
				<th>在庫</th>
				<th>詳細情報</th>
				<th>個別削除</th>
			</tr>
			<tr>
				<td><s:property value = "id"/></td>
				<td><s:property value = "item_name"/></td>
				<td><s:property value = "item_price"/></td>
				<td><s:property value = "item_stock"/></td>
				<td>
<%-- 					<a href='<s:url action="ItemDetaiLsAction">s:param name="id" value="%{id}"/></s:url>'>詳細</a> --%>
                        <a href='<s:url action="ItemDetaiLsAction"><s:param name="id" value="%{id}"/></s:url>'>詳細</a>
				</td>
				<td>
					<a href='<s:url action="SingleItemDeleteAction"><s:param name="id" value="%{id}"/></s:url>'>削除</a>
				</td>
			</tr>


		</s:iterator>
		</table>
		<s:form action = "ItemDeleteAction">
			<s:submit value = "削除"/>
		</s:form>
		 <p><input type = "button" value = "管理者画面に戻る" Onclick = "submitAction('AdminAction')"/><p>
		 <p>前画面に戻る場合は<a href = '<s:url action = "AdminAction"/>'>こちら</a>
	</div>

	<div id = "footer">
	</div>
</body>
</html>