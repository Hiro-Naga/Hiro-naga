<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TASK</title>
<%! int substraction(int num1, int num2){
	int ans = num1 - num2;
	return ans;
	}
%>
</head>
<body>
<h1>125 - 25 = <%= substraction(125, 15) %></h1>
<h1>17 - 21 = <%= substraction(17, 21) %></h1>
</body>
</html>