<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login.jsp</h1>
	<table border="1">
		<form method="post" action="login">
		<tr align="center">
			<td>사용자 ID</td>
			<td><input type="text" name="mem_uid"></td>
		</tr>
		<tr align="center">
			<td>비밀번호</td>
			<td><input type="password" name="mem_pwd"></td>
		</tr>
		<tr align="center">
			<td><input type="submit" value="로그인"></td>
			<td><input type="button" value="회원가입"
				onClick="location.href='joinPage'"></td>
		</tr>
		</form>
	</table>
</body>
</html>