<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script  src = "http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アイテム情報画面</title>
<script type="text/javascript" src = "./JavaScript/Main.js"></script>
</head>
<body>
	<div id = "header">
	</div>

	<div id = "main">

		<div id = "top">
			<p>商品情報</p>
		</div>

		<s:if test="itemDetailsDTO == null">
			<h3>商品の情報はありません。</h3>
		</s:if>

		<s:elseif test = "message == null">
			<h3>商品情報は以下になります。</h3>

			<table border = "1">
				<tr>
					<th>id</th>
					<td><s:property value = "itemDetailsDTO.id"/></td>
				</tr>

				<tr>
					<th>商品名</th>
					<td><s:property value = "itemDetailsDTO.itemName"/></td>
				</tr>

				<tr>
					<th>値段</th>
					<td><s:property value = "itemDetailsDTO.itemPrice"/><span>円</span></td>
				</tr>

				<tr>
					<th>在庫</th>
					<td><s:property value = "itemDetailsDTO.itemStock"/><span>個</span></td>
				</tr>

				<tr>
					<th>登録日</th>
					<td><s:property value = "itemDetailsDTO.insert_date"/></td>
				</tr>

				<tr>
					<th>更新日</th>
					<td><s:property value = "itemDetailsDTO.update_date"/></td>
				</tr>
			</table>

					<s:form action = "SingleItemDeleteAction">
					<s:hidden name = "id" value = "%{id}"/>
					<s:submit value = "削除"/>
					</s:form>
	</s:elseif>
		<s:form action="UpdateItemAction">

			<table border="1">

				<tr>
<%-- 					<s:textfield name="name" value="" label="商品名" /> --%>
					<th>商品名</th>
					<td><input type="text" name="name" value= "" /></td>
				</tr>

				<tr>
					<th>値段</th>
					<td><input type="text" name="item_price" value= ""/></td>
				</tr>

				<tr>
					<th>在庫</th>
					<td><input type="text" name="item_stock" value= "" /></td>
				</tr>

				<tr>
					   <s:hidden name="id" value="%{id}" />
						<s:submit value="更新" />
<%-- 								<s:param name = "id" value = "%{id}"/> --%>
<%-- 						       <s:submit value="更新" /> --%>
<%-- 					<td><a href = '<s:url action = "UpdateItemAction"><s:param name = "id" value = "%{id}"/></s:url>'>更新</a></td> --%>

				</tr>

			</table>


		</s:form>

		<div id = "text-right">

			<p>商品一覧は<a href = '<s:url action = "ItemListAction"/>'>こちら</a></p>
		</div>
	</div>
	<s:form>
	</s:form>
	<div id = "footer">
	</div>
</body>
</html>

