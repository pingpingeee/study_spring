package com.lgy.item_mybatis_oracle.dao;

import java.util.ArrayList;

import com.lgy.item_mybatis_oracle.dto.ItemDTO;

//public class ItemDAO {
public interface ItemDAO {
	public void write(String name, String price, String description);
	public ArrayList<ItemDTO> list();
	
	/*
	JdbcTemplate template=null;
	
	public ItemDAO() {
		template = Constant.template;
	}
	
	public void write(final String name, final String price, final String description) {
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql="insert into item(name, price, description"
						+ ") values(?,?,?)";
				PreparedStatement pstmt=con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, price);
				pstmt.setString(3, description);
				return pstmt;
			}
		});
	}
	
	public ArrayList<ItemDTO> list() {
		String sql="select name, price, description from item";
		return (ArrayList<ItemDTO>) template.query(sql, new BeanPropertyRowMapper(ItemDTO.class));
	}
	*/
}
