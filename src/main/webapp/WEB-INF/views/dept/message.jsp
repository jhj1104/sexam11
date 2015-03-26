<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>message.jsp</title>
</head>
<body>
<hr>
	<h1>messages</h1>
<hr>

required=<spring:message code="required"/>
typeMismatch=<spring:message code="typeMismatch"/> <br>
required.dept=<spring:message code="required.dept"/> <br>

<a href="/sexam11/m/locale">언어설정</a>

</body>
</html>