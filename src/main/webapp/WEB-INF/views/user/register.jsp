<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/taglib.jspf" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>register.jsp</title>
</head>
<body>
<hr>
	<h1>User 등록~</h1>
<hr>
<form action="register" method="post">
<label for="name"><spring:message code="label.user.name" text="xxx" /> </label>
<input id="name" name="name" value="" required="required" />
<br>

<label for="age"><spring:message code="label.user.age" text="xxx"/> </label>
<input id="age" name="age" value="" required="required" pattern="[0-9]{1,2}"/>
<br>
<input type="submit" value="등록" />
<input type="reset" value="clear" />


</form>


</body>
</html>