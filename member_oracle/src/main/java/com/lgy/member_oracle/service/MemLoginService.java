package com.lgy.member_oracle.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.member_oracle.DAO.MemDAO;

public class MemLoginService implements MemService {
	@Override
	public int execute(Model model) {
		Map<String, Object> map = model.asMap();

		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String uid = request.getParameter("mem_uid");
		String pwd = request.getParameter("mem_pwd");
		MemDAO dao = new MemDAO();
		int re = dao.login(uid, pwd);
		return re;
	}
}
