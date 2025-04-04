package com.lgy.member_jdbc_oracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.member_jdbc_oracle.service.MemLoginService;
import com.lgy.member_jdbc_oracle.service.MemService;
import com.lgy.member_jdbc_oracle.service.MemWriteService;
import com.lgy.member_jdbc_oracleutil.Constant;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	MemService service;
	public JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@RequestMapping("/loginPage")
	public String loginPage(Model model) {
		log.info("login");
		return "login";
	}
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		log.info("login");
		model.addAttribute("request", request);
		
		service = new MemLoginService();
		int re = service.excute(model);
		
		if(re == 1) {
			return "redirect:login_ok";			
		}else {
			return "login";
		}
	}
	
	@RequestMapping("/login_ok")
	public String loginOkPage(Model model) {
		log.info("login");
		return "login_ok";
	}
	
	@RequestMapping("/joinPage")
	public String joinPage(Model model) {
		log.info("testJoin");
		return "register";
	}
	@RequestMapping("/join")
	public String join(HttpServletRequest request, Model model) {
		log.info("join");
		model.addAttribute("request", request);
		
		service = new MemWriteService();
		service.excute(model);
		return "redirect:loginPage";
	}
}
