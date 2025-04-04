package com.lgy.member_jdbc_oracle.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.member_jdbc_oracle.dao.MemDAO;

public class MemWriteService implements MemService{

//	@Override
//	public void excute(Model model) {
//		Map<String, Object> map = model.asMap();
//		HttpServletRequest request = (HttpServletRequest) map.get("request");
//		
//		String mem_uid = request.getParameter("mem_uid");
//		String mem_pwd = request.getParameter("mem_pwd");
//		String mem_name = request.getParameter("mem_name");
//		
//		MemDAO dao = new MemDAO();
//		dao.join(mem_uid, mem_pwd, mem_name);
//	}
	@Override
	public int excute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String mem_uid = request.getParameter("mem_uid");
		String mem_pwd = request.getParameter("mem_pwd");
		String mem_name = request.getParameter("mem_name");
		
		MemDAO dao = new MemDAO();
		dao.join(mem_uid, mem_pwd, mem_name);
		
		return 0; // 굳이 보내야 할 때 0 리턴
	}

}
