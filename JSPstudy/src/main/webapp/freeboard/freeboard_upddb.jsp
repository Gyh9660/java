<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*" %> 
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD><TITLE>글 수정하기</TITLE></HEAD>
<BODY>
<%@ include file = "dbconn_oracle.jsp" %>
[<A href="freeboard_list.jsp?go=<%=request.getParameter("page")%>">게시판 목록으로 </A>]

<%
 String sql=null;
 //Connection con= null;
 PreparedStatement st =null;
 ResultSet rs =null;
 int cnt=0;
 int pos=0;
 String cont=request.getParameter("content"); //글의 내용을 getParameter로 받아서 cont에 저장

 if (cont.length()==1) //글내용이 1이라면
  cont = cont+" " ;		//공백을 추가 없어도되는부분/
 
 
  //textarea내에 ' 가 들어가면 db에 insert, update시 문제 발생(작동안함)
  
  
  while ((pos=cont.indexOf("\'", pos)) != -1) {
   String left=cont.substring(0, pos);
   String right=cont.substring(pos, cont.length());
   cont = left + "\'" + right;
   pos += 2;
  }  

  int id = Integer.parseInt(request.getParameter("id"));

 
  try {
   sql = "select * from freeboard where id=? ";
   st = conn.prepareStatement(sql);
   st.setInt(1, id);
   rs = st.executeQuery();
   if (!(rs.next()))  {
    out.println("해당 내용이 없습니다");
   } else {
   String pwd= rs.getString("password"); 
   if (pwd.equals(request.getParameter("password"))) {
    sql = "update freeboard set name= ? ,email=?,";
    sql = sql + "subject=?,content=? where id=? " ;
    st = conn.prepareStatement(sql);
    st.setString(1, request.getParameter("name"));
    st.setString(2, request.getParameter("email"));
    st.setString(3, request.getParameter("subject"));
    st.setString(4, cont);
    st.setInt(5, id);
    cnt = st.executeUpdate(); 
    if (cnt >0) 
     out.println("정상적으로 수정되었습니다.");
    else
     out.println("수정되지 않았습니다.");
   } else 
    out.println("비밀번호가 틀립니다.");
  } 
  rs.close();
  st.close();
  conn.close();
 } catch (SQLException e) {
  out.println(e);
 } 
%>
</BODY>
</HTML> 