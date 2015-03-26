<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/taglib.jspf" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>registersucess.jsp</title>
</head>
<body>
<hr>
	<h1>User 등록성공</h1>
<hr>
<a href="register">User 등록 화면으로...</a>
<br>
Error : ${error }
<br>
Name : ${requestScope.user.name}<br>
Age : ${requestScope.user.age}<br>

</body>
</html>