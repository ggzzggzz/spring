package kr.ac.inhatc.mvc.controller;

import org.springframework.stereotype.Service;

@Service
public class BrdService {
	
	int count;
	
	public int getCount() {
		return count++;
	}
	
}
