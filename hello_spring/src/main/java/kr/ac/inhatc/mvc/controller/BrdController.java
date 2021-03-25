package kr.ac.inhatc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BrdController {
	@Autowired
	BrdService brdService;
	
	@RequestMapping("/brd")
	public ModelAndView brd() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board");
		mv.addObject("title","ModelAndView");
		System.out.println(brdService.getCount());
		return mv;
	}
	
}
