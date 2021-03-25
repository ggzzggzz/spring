package kr.ac.inhatc.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {
	@RequestMapping("/") //root 실행
	public String hello(Model model,String id) {
		model.addAttribute("data", "sample data");
		model.addAttribute("data2", "korea");
		model.addAttribute("id", id);
		return "hello";
	}
	//파라미터로 id를 입력 받고
	// 이 id를 화면에서 출력?
	@RequestMapping("board")
	public String board(Model model, 
			@RequestParam(name = "test", required = false, defaultValue = "연습페이지")String id) {
		model.addAttribute("id", id);
		return "board";
	}
	@RequestMapping("welcome")
	public String welcome(Model model) {
		model.addAttribute("data", "sample data");
		return "welcome";
	}
}