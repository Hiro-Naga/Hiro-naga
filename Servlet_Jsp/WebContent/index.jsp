<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Servlet_Jsp</title>
	</head>
	<body>
		<%-- HelloServletのボタン作成、押したらTask1起動 --%>
		<input type = "button" value = "HelloServlet" onClick = "location.href = 'Task1'">

		<%-- HelloJSPへのリンク作成 --%>
		<p><a href = "Task2">Hellojsp</a></p>

		<%-- Task4(占いボタン)生成 --%>
		<input type = "button" value = "占う" onClick = "location.href = 'Task4'">
	</body>
</html>