package com.lgy.member_oracle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemDAO {
	DataSource dataSource;

	public MemDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login(String uid, String pwd) {
		int re = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select mem_pwd from mvc_member where mem_uid=?";
		String checkUserPwd="";
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				checkUserPwd = rs.getString("mem_pwd");
				if (checkUserPwd.equals(pwd)) {
					re = 1;
				} else {
					re = 0;
				}
			} else {
				re = -1; // 로그인 실패
			}
		}catch (Exception e) {
		}finally {
			try {
				
			}catch (Exception e) {
			}
		}
		return re;
	}
}
