package com.lgy.board_mysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.board_mysql.service.BoardListService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BoardController {
   @RequestMapping("/list")
   public String list(Model model) {
   // 게시판 목록 조회
   log.info("@# list()");
   
   //service(commnad)단 호출
   BoardListService service = new BoardListService();
   service.excute(model);
   
   return "list";
   }   
}