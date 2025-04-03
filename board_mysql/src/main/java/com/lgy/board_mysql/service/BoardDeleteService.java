package com.lgy.board_mysql.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class BoardDeleteService implements BoardService {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String boardNo = request.getParameter("boardNo");
		log.info("delete boardNo"+boardNo);
		BoardDAO dao = new BoardDAO();
		dao.delete(boardNo);
	}
	
}
