package com.lgy.spring_12_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/board/confirmId")
	public String confiormId(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/confirmId";
	}
	
	// 쿼리 스트링 값이 없을 경우 : HTTP 상태 400 - 잘못된 요청 처리
	@RequestMapping("/board/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/checkId";
	}
//	@RequestMapping("/member/join")
//	public String joinData(@RequestParam("name") String name
//						, @RequestParam("id") String id
//						, @RequestParam("pw") String pw
//						, @RequestParam("email") String email
//						, Model model) {
//		Member member = new Member();
//		member.setName(name);
//		member.setId(id);
//		member.setPw(pw);
//		member.setEmail(email);
//		
//		model.addAttribute("member", member);
//		
//		return "member/join";
//	}
	
	@RequestMapping("/member/join")
	public String joinData(Member member) {
		
		return "member/join";
	}
	
	
	@RequestMapping("/student/{studentId}")
	// @PathVariable : 경로의 값을 받음
	public String getStudent(@PathVariable String studentId, Model model) {
		model.addAttribute("studentId", studentId);
		return "student/studentView";
	}

}
