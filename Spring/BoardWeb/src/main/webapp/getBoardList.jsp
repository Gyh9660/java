<%@page import="java.util.List" %>
<%@page import="com.springbook.biz.impl.BoardDAO"%>
<%@page import="com.springbook.biz.BoardVO" %>
<%@page language="java" contentType="text/html; UTF-8"  pageEncoding="UTF-8"%>

<%

		List<BoardVO> boardList = (List)session.getAttribute("boardList");
		
		//3. 응답 화면 구성
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
</head>
<body>
		<center>
				<h1>글 목록</h1>
				<h3>
					테스트님 환영합니다...<a href="logout.do">Log-out</a>
				</h3>
	
				<!--  검색 시작  -->
				<from action = "getBoardList.do" method ="post">
					<table border="1" cellpadding ="0" cellspacing="0" width="700">
						<tr>
							<td align="right"><select name ="searchCondition">
												<option value ="TITLE">제목
												<option value ="CONTENT">내용
							</select><input name ="searchKeyword" type="text">
							<input type ="submit" value="검색">
							</td>
						</tr>
					</table>
				</from>	
				
				<!-- 검색 종료 -->
				
				<table border="1" cellpadding="0" cellspacing="0" width="700">
						<tr>
							<th bgcolor="orange" width="100">번호</th>
							<th bgcolor="orange" width="200">제목</th>
							<th bgcolor="orange" width="150">작성자</th>
							<th bgcolor="orange" width="150">등록일</th>
							<th bgcolor="orange" width="100">조회수</th>
						</tr>
						<%
							for(BoardVO board : boardList){
								
						%>
						<tr>
							<td><%= board.getSeq() %></td>
							<td align="left"><a href="getBoard.do?seq=<%= board.getSeq()%>">
							<%=board.getTitle() %></a>
							</td>
							<td><%= board.getWriter() %></td>
							<td><%= board.getReg_date() %></td>
							<td><%= board.getCnt() %></td>
						</tr>
						<%
							}
						%>
				</table>
				<br><a href="insertBoard.jsp">새글 등록</a>
		</center>



</body>
</html>