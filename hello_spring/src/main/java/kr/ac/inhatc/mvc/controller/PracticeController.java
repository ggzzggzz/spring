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
		int result[]= {0,0,0,0,0,0,0,0,0};
		for(int i=1; i < 10; i++) {
			result[i-1] = num*i;
		}
		return num+"*1="+result[0]+" "+num+"*2="+result[1]+" "+num+"*3="+result[2]+" "+num+"*4="+result[3]+" "+num+"*5="+result[4]+" "+num+"*6="+result[5]+" "+num+"*7="+result[6]+" "+num+"*8="+result[7]+" "+num+"*9="+result[8];
	}
}
