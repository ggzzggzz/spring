package kr.ac.inhatc.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class JspService {
	int count;
	public String hello() {
		return "hello";
	}
	public int getCount() {
		return count++;
	}
}
