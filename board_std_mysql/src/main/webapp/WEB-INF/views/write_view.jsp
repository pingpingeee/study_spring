<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=""></script>
<script>
	function fn_submit() {
		$.ajax({});
	}	
</script>
</head>
<body>
	<table width="500" border="1">
		<form method="post" action="write">
			<tr>
				<td>이름</td>
				<td><input type="text" name="boardName" size="50"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="boardTitle" size="50"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" name="boardContent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" onclick="fn_submit()" value="입력"></td>
				<a href="list">목록보기</a>
			</tr>
		</form>
	</table>
</body>
</html>