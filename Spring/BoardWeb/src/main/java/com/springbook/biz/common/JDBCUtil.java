package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	//Connection  DB에 연결 객체
	//메소드 호출시 Connection 객체를 생성해서 리턴 돌려줌
	public static Connection getConnection() {
		
		try {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","1234");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	//객체 종료시 호출 메소드 (PreparedStatement, Connection ) : insert,update,delect
	public static void close (PreparedStatement pstmt, Connection conn) {
		
		if (pstmt != null) { //pstmt 객체 종료
			
		try {
			if(!pstmt.isClosed()) {
				pstmt.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			pstmt = null;
		}
		}
		if (conn!=null) { //conn객체 종료
			try {
				if(! conn.isClosed()) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
	
	//객체 종료 ( ResultSet, PreparedStatement,Connection)
	public static void close (ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if (rs != null) {
			try{
				if(!rs.isClosed()) {
					rs.close();
				}
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
			close(pstmt,conn);
		}
	}
	
}
