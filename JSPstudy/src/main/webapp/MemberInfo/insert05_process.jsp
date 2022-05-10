<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "java.sql.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폼에서 넘겨 받은 값을 DB에 저장하는 파일</title>
</head>
<body>

<%@ include file = "dbconn_oracle.jsp" %>

<%
	request.setCharacterEncoding("UTF-8"); //폼에서 넘긴 한글처리하기 위해서
	
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	String email = request.getParameter("email");

	PreparedStatement pstmt = null;	//PreparedStatement 객체 : SQL쿼리 구문을 담아서 실행하는 객체
	String sql = null; //전역 변수
	
	try{
		sql = "INSERT INTO mbTbl (idx,id,pass,name,email) VALUES (seq_mbTbl_idx.nextval,?,?,?,?)";
		pstmt = conn.prepareStatement(sql); //PreparedStatement 객체 생성시에 sql 문을 넣는다.
		pstmt.setString(1, id);
		pstmt.setString(2, passwd);
		pstmt.setString(3, name);
		pstmt.setString(4, email);
		pstmt.executeUpdate(); 
				//pstmt.executeUpdate () : sql<== insert,update,delete문이 온다.
				//pstmt.excuteQuery() : sql <== select 문이 오면서 Resultset 객체로 변환
		
		out.println("테이블 삽입에 성공 했습니다.");
		out.println("<p><p>");
		
		//out.println(sql);
				
				
				
	}catch(Exception ex){
		out.println("mbTbl 테이블 삽입을 실패 했습니다.");
		out.println(ex.getMessage());
		out.println("<br><p>");
		//out.println(sql);
		
	}finally{
		if (pstmt != null)
			pstmt.close();
		if(conn != null)
			conn.close();
	}
	
	
%>
<p>
<p>
<p>
<%= email %><p><p>


<%= sql %> <p><p>  <!-- html 블락에서 출력할떄 -->
<%
out.println(sql); //jsp 블락에서 출력 할때
%> 
</body>
</html>