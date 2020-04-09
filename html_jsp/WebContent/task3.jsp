<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP TASK3</title>
		<%-- 日付設定 --%>
		<%  Date today = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		%>
		<%-- countメソッド --%>
		<%-- メソッド外でtimesを初期化 --%>
		<%! int times = 0;
			int count(){
				times++;
				return times;
			}
		%>
	</head>
	<body>
		<h1>訪問回数: <%= count() %></h1>
		<p>今日の日付：<% out.println(sdf.format(today)); %></p>
	</body>
</html>