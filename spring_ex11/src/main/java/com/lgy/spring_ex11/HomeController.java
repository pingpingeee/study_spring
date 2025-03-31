package com.lgy.spring_ex11;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping("/board/content")
	public String content() {
//		model.addAttribute("test", "");
		return "board/content";
	}
	
	@RequestMapping("/car/tesla")
	public String showCar1() {
		return "car/tesla";
	}
	
	@RequestMapping("/trot/student")
	public String student(Model model) {
		model.addAttribute("id", "youngwoong");
		return "trot/student";
	}
	@RequestMapping("/trot/admin")
	public ModelAndView student() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "boom");
		mv.setViewName("trot/admin");
		return mv;
	}
}
