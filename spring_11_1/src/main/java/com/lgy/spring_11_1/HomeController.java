package com.lgy.spring_11_1;

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
//@RequestMapping("/board")
public class HomeController {
	
	@RequestMapping("/shopping")
	public String shopping() {
		return "shopping";
	}
	
	@RequestMapping("/view")
//	public String title(Model model) {
	public ModelAndView title() {
		ModelAndView mv = new ModelAndView();
		// 속성에 값 추가
		mv.addObject("id", "gildong");
		//  뷰 설정 (model 객체와 차이점)
		mv.setViewName("board/view");
		
		return mv;
	}

//	@RequestMapping("/view")
//	@RequestMapping("board/view") // /board/view
//	public String name() {
//		return "view";
//		return "board/view";
//	}

//	@RequestMapping("board/view")
//	public String title(Model model) {
//		model.addAttribute("id", "test");
//		return "board/view";
//	}
}
