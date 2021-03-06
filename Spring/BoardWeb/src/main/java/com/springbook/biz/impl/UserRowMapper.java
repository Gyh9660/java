package com.springbook.biz.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springbook.biz.user.UserVO;

public class UserRowMapper implements RowMapper<UserVO>{

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserVO user = new UserVO();
		
		user.setId(rs.getString("ID"));
		user.setPass(rs.getString("PASS"));
		user.setName(rs.getString("NAME"));
		user.setRole(rs.getString("ROLE"));
		
		
		return user;
	}
	
	

}
