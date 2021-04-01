package kr.ac.inhatc.mvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.inhatc.mvc.mapper.BoardMapper;

@Service
public class BoardService {
	@Autowired
	BoardMapper boardMapper;
	
	public List<?> selectSubjectList(String name) throws Exception{
		return boardMapper.selectSubjectList(name);
	}
	public int selectSubjectListCount(String name) throws Exception{
        return boardMapper.selectSubjectListCount(name);
    }
}
