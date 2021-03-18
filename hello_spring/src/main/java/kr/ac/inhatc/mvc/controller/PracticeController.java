package kr.ac.inhatc.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
	@RequestMapping("inhatc")
	public String inhatc() {
		return "http://www.inhatc.ac.kr/";
	}
	
	@RequestMapping("name")
	public String name(int id) {
		return "당신의 학번은 : " + id;
	}
	
	@RequestMapping("hello")
	public String hello(int num) {
		String result = "";
		for(int i=1; i < 10; i++) {
			result = result + num + "*" + i + "=" + num*i + " ";
		}
		return result;
	}
}
