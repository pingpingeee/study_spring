package com.lgy.spring_13_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	@RequestMapping("/")
	public String goIndex() {
		
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/student")
	public String goStudent(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("@# RequestMethod.GET");
		String id = httpServletRequest.getParameter("id");
		
		model.addAttribute("id", id);
		return "student";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public ModelAndView goStudent(HttpServletRequest httpServletRequest) {
		System.out.println("@# RequestMethod.POST");
		
		String id = httpServletRequest.getParameter("id");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student");
		mv.addObject("id", id);

		return mv;
	}
}

