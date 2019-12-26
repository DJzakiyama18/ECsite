<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BuyItem画面</title>
</head>
<body>
	<div id = "header">
	</div>

	<div id = "main">

		<div id = "top">
			<p>BuyItem<p>
		</div>

		<div>
		<s:if test="errorMessage !=''">
			<s:property value = "errorMessage" escape="false"/>
		</s:if>
			<s:form action = "BuyItemAction">
			<table>
				<tr>
					<td>
						<span>商品名</span>
					</td>

					<td>
						<s:property value = "session.buyItem_name"/><br>
					</td>
				</tr>

				<tr>
					<td>
						<span>値段</span>
					</td>

					<td>
						<s:property value = "session.buyItem_price"/><span>円</span>
					</td>
				</tr>
				<tr>
					<td>
						<span>購入個数</span>
					</td>

					<td>
						<select name = "count">
<!-- 						selected="selected"で1を選択状態にする -->
							<option value = "1" selected="selected">1</option>
							<option value = "2">2</option>
							<option value = "3">3</option>
							<option value = "4">4</option>
							<option value = "5">5</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<span>支払い方法</span>
					</td>

					<td>
						<input type = "radio" name = "pay" value = "1" checked = "checked">現金支払い

						<input type = "radio" name = "pay" value = "2" checked = "checked">クレジットカード
					</td>
				</tr>

				<tr>
					<td>
						<s:submit value = "購入"/>
					</td>
				</tr>
			</table>
			</s:form>
				<div>
					<p>前画面に戻る場合は<a href = '<s:url action = "GoHomeAction"/>'>こちら</a></p>

					<p>マイページ<a href = '<s:url action = "MyPageAction"/>'>こちら</a></p>
				</div>
		</div>
	</div>

	<div id = "footer">
	</div>
</body>
</html>