<%@page contentType="text/html; charset=EUC-KR"%>
<!-- 다국어 처리 태그 라이브러리 등록 -->
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
</head>
<body>
	<center>
		<h1>로그인</h1>
		<hr>
		<%= application.getRealPath("/common") %>
		<form action="login.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="id" value="${user.id }" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="pass" value="${user.pass }"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="로그인" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="index.jsp">목록 가기</a>
	</center>
</body>
</html>