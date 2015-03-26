<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>

<hr>
<h1>Language 설정</h1>
<hr>

<form action="locale" method="post">
	<select name="lang">
		<option value="ko">한국어</option>
		<option value="ja">일본어 </option>
		<option value="en" selected="selected">영어</option>	
	</select>
	<input type="submit" value="언어설정" />
</form>

</body>
</html>