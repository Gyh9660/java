<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class = "dao.Calculator"></jsp:useBean>
	<!-- Calculator 클래스를 bean 객체로 사용 -->
	<!--  Calculator bean = new Calculator(); 과 같은구문 -->
	
	<%
		int m = bean.process(5);
	
		out.println("5의 3 제곱은 : " + m);
	
	
	%>
	<p><p>
	5의 3 제곱은 : <%= m %>
	
	
	
</body>
</html>