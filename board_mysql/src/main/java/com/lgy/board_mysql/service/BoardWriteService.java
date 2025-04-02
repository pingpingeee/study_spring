package com.lgy.board_mysql.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;

public class BoardWriteService implements BoardService {

	@Override
	public void excute(Model model) {
//		DAO에 있는 boardName, boardTitle, boardContent 값들이 필요
		Map<String, Object> map = model.asMap();

		// key는 request로 받음 컨트롤러단에서 보내주는 이름
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String boardName = request.getParameter("boardName");
		String boardTitle = request.getParameter("boardTitle");
		String boardContent = request.getParameter("boardContent");

		BoardDAO dao = new BoardDAO();
		dao.write(boardName, boardTitle, boardContent);
	}
}
