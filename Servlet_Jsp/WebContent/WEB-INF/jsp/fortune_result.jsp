<%@ page import="practice.FortuneBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fortune Result</title>
		<%-- FortuneBean("result")呼び出し --%>
		<% FortuneBean fortuneBean = (FortuneBean)request.getAttribute("result"); %>
	</head>
	<body>
	<%
		if(fortuneBean != null){
			out.println("<h1>↓" + fortuneBean.getToday() + "↓</h1>");
			out.println("<h1>" + fortuneBean.getFortune() + "</h1>");
		}
	%>
	</body>
</html>