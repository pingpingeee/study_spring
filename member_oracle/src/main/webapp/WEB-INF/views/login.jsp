<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<form method="post" action="login_success">
			<tr>
				<td>사용자ID</td>
				<td><input type="text" name="mem_uid">
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="mem_pwd">
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="로그인"></td>
			</tr>
		</form>
	</table>
</body>
</html>