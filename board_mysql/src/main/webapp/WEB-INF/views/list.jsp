<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>히트</td>
		</tr>
<!-- 		list : 모델 객체에서 보낸 이름 -->
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.boardNo}</td>
			<td>${dto.boardName}</td>
			<td>${dto.boardTitle}</td>
			<td>${dto.boardDate}</td>
			<td>${dto.boardHit}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>