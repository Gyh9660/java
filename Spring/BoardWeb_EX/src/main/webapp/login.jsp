<%@page contentType="text/html; charset=EUC-KR"%>
<!-- �ٱ��� ó�� �±� ���̺귯�� ��� -->
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α���</title>
</head>
<body>
	<center>
		<h1>�α���</h1>
		<hr>
		<%= application.getRealPath("/common") %>
		<form action="login.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">���̵�</td>
					<td><input type="text" name="id" value="${user.id }" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">��й�ȣ</td>
					<td><input type="password" name="pass" value="${user.pass }"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="�α���" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="index.jsp">��� ����</a>
	</center>
</body>
</html>