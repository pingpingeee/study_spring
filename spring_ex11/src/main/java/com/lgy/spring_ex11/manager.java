package com.lgy.spring_ex11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class manager {
	
	@RequestMapping("/portpolio/airbnb")
	public String airbnb(Model model) {
		model.addAttribute("title", "숙소예약");
		return "portpolio/airbnb";
	}
	@RequestMapping("/portpolio/universityManager")
	public String university(Model model) {
		model.addAttribute("title", "학사관리");
		return "portpolio/universityManager";
	}
	@RequestMapping("/portpolio/bookManager")
	public String bookManager(Model model) {
		model.addAttribute("title", "도서관리");
		return "portpolio/bookManager";
	}
}
