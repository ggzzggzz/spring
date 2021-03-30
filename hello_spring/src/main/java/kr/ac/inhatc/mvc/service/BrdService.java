package kr.ac.inhatc.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class BrdService {
	
	int count;
	
	public int getCount() {
		return count++;
	}

}
