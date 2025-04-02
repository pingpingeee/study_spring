package com.lgy.board_mysql.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.board_mysql.service.BoardContentService;
import com.lgy.board_mysql.service.BoardListService;
import com.lgy.board_mysql.service.BoardService;
import com.lgy.board_mysql.service.BoardWriteService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BoardController {
	BoardService service;

	@RequestMapping("/list")
	public String list(Model model) {
		// 게시판 목록 조회
		log.info("@# list()");

		// service(commnad)단 호출
//		BoardListService service = new BoardListService();
		service = new BoardListService();
		service.excute(model);

		return "list";
	}

	@RequestMapping("/write_view")
	public String write_view() {
		log.info("@# write_view()");
		return "write_view";
	}

	@RequestMapping("/write")
	// reuqest : 뷰에서 값을 받아옴
	public String write(HttpServletRequest request, Model model) {
		log.info("@# write()");
		model.addAttribute("request", request);

		service = new BoardWriteService();
		service.excute(model);
		return "redirect:list";
	}

	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		log.info("@# content_view()");
		model.addAttribute("request", request);
		service = new BoardContentService();
		service.excute(model);
		return "content_view";
	}

}