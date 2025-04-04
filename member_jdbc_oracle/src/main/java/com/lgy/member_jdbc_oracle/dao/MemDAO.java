package com.lgy.member_jdbc_oracle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.lgy.member_jdbc_oracle.dto.MemDTO;
import com.lgy.member_jdbc_oracleutil.Constant;

public class MemDAO {
	JdbcTemplate template = null;

	public MemDAO() {
		template = Constant.template;
	}

	public ArrayList<MemDTO> login (String mem_uid, String mem_pwd){
		String sql = "select mem_pwd from mvc_member where mem_uid=" + mem_uid;
		return (ArrayList<MemDTO>) template.query(sql, new BeanPropertyRowMapper(MemDTO.class));
		
	}
	public void join(final String mem_uid, final String mem_pwd, final String mem_name) {
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into mvc_member(mem_uid, mem_pwd, mem_name) " + "values(?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, mem_uid);
				pstmt.setString(2, mem_pwd);
				pstmt.setString(3, mem_name);
				return pstmt;
			}
		});
	}

}
