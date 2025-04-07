package com.lgy.item_mybatis_oracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.item_mybatis_oracle.dao.ItemDAO;

@Controller
public class ItemController {
	@Autowired
	private SqlSession sqlSession;

	// 아이템뷰 (값 읽어들임)
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		model.addAttribute("content_view", dao.list());
		return "content_view";
	}

	// 작성 뷰
	@RequestMapping("/item_write")
	public String write_view() {
		return "item_write";
	}

	//
	// wrtie 로직
	@RequestMapping("/write_result")
	public String write(HttpServletRequest request) {
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String description = request.getParameter("description");

		dao.write(name, price, description);

		return "write_result";
	}

}
