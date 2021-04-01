package kr.ac.inhatc.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inhatc.mvc.service.BoardService;
import kr.ac.inhatc.mvc.service.JspService;

@Controller
public class BoardController {
	JspService jspservice =new JspService();
	@Autowired
	BoardService boardService = new BoardService();
	@RequestMapping("board2")
	public ModelAndView board2() {
		ModelAndView mv =new ModelAndView();
		mv.addObject("title",jspservice.hello());
		mv.setViewName("board");
		System.out.println(jspservice.getCount());
		return mv;
		
	}
	@RequestMapping("testdb")
    public String board1(Model model, 
            @RequestParam(name = "searchKeyword",required = false,defaultValue = "프로그")String id) {
        model.addAttribute("id",id);
        try {
            List<?> l = boardService.selectSubjectList(id);
            int count = boardService.selectSubjectListCount(id);
            model.addAttribute("cnt",count);
            model.addAttribute("selectSubjectList",l);
            System.out.println(l.toString());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "board2";
    }
}
