<%@page import="com.springbook.biz.impl.BoardDAO" %> 

<%@page import="com.springbook.biz.BoardVO" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8" 

    pageEncoding="UTF-8"%> 

    
    <%
    
    	//1. 사용자 입력 정보 추출
    	
    	request.setCharacterEncoding("UTF-8");
    	String seq = request.getParameter("seq");
    	
    	//2. DB연동 처리
    	BoardVO vo = new BoardVO();
    	vo.setSeq(Integer.parseInt(seq));
    	
    	BoardDAO boardDAO = new BoardDAO();
    	boardDAO.deleteBoard(vo);
    	
    	//3. 화면 네비게이션
    	response.sendRedirect("getBoardList.jsp");
    
    
    %>