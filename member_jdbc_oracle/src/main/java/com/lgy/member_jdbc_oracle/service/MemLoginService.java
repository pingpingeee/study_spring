package com.lgy.member_jdbc_oracle.service;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.member_jdbc_oracle.dao.MemDAO;
import com.lgy.member_jdbc_oracle.dto.MemDTO;

public class MemLoginService implements MemService {

	@Override
	public int excute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String mem_uid = request.getParameter("mem_uid");
		String mem_pwd = request.getParameter("mem_pwd");
		MemDAO dao = new MemDAO();
		ArrayList<MemDTO> dtos = dao.login(mem_uid, mem_pwd);

		int re = -1;
		if (dtos.isEmpty()) {
			re = -1;
		} else {
			if (mem_pwd.equals(dtos.get(0).getMemPwd())) {
				re = 1;
			} else {
				re = 0;
			}
		}
		System.out.println("re => " + re);
		return re;
	}

}
