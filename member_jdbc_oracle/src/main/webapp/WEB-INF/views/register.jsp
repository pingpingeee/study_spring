<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>lregister.jsp</h1>
	<table border="1">
		<form method="post" action="join">
			<tr>
				<td>User ID</td>
				<td><input type="text" name="mem_uid"></td>
			</tr>
			<tr>
				<td>암호</td>
				<td><input type="text" name="mem_pwd"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="mem_name"></td>
			</tr>
			<td><input type="submit" value="등록"></td>
		</form>
	</table>
</body>
</html>