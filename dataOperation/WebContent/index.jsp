<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>お問い合せフォーム</title>
	</head>
	<body>
		<%-- データ入力部分 --%>
		<form action = "Result" method = "POST">
				名前：<input type = "text" name = "name">
				<br>
				<input type = "radio" name = "sex" value = "男">男
				<input type = "radio" name = "sex" value = "女">女
				<br>
				お問い合せ種類<br>
				<select name = "questionType">
					<option value = "製品について">製品について</option>
					<option value = "不具合やクレーム">不具合やクレーム</option>
					<option value = "アフターサポート">アフターサポート</option>
				</select>
				<br>
			<textarea name = "questionContent" cols = "150" >150文字以内で入力してください</textarea>
			<br>
			<input type = "submit" name = "送信" value = "送信">
		</form>

	</body>
</html>