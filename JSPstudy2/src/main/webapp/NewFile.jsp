<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>오늘은 JSP 첫번째 날입니다.</h3><br><br>
	
	<%@ page import = "java.util.Date" %>

	오늘의 날짜는 <%=new Date() %>


</body>
</html>