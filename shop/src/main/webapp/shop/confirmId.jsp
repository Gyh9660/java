<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "user.UserDAO" %>

<% request.setCharacterEncoding("utf-8");%>

<% 
  //id는 사용자가 회원가입을 하기위해서 입력한 아이디
  String u_id = request.getParameter("u_id");
  
  //DB처리빈인 UserDAO클래스의 객체를 얻어낸다.
  UserDAO user = UserDAO.getDao();
  
  //사용자가 입력한 id값을 가지고 UserDAO클래스의 confirmId()메소드 호출
  //중복아이디 체크  confirmId()메소드의 실행결과로 check에는 1또는 -1값이 리턴됨
  int check= user.confimId(u_id);
  
  out.println(check);//처리 결과를 reg.js로 리턴
 %>
