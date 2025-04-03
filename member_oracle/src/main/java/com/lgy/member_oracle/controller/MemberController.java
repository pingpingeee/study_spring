package com.lgy.member_oracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.member_oracle.service.MemLoginService;
import com.lgy.member_oracle.service.MemService;

@Controller
public class MemberController {
	MemService service;

	@RequestMapping("/login")
	public String login_view() {
		return "login";
	}
	@RequestMapping("/login_ok")
	public String login_ok() {
		return "login_ok";
	}

	@RequestMapping("/login_success")
	public String login(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		service = new MemLoginService();
		int result = service.execute(model);
		if (result == 1)
			return "redirect:login_ok";
		else
		return "redirect:login";
	}
}
