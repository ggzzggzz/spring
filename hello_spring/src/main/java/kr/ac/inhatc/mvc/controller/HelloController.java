package kr.ac.inhatc.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("hello1")
	public String hello(int num) {
		System.out.println("호출됨");
		return "hello spring";
	}
}
