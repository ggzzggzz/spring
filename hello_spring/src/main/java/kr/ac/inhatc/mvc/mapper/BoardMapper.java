package kr.ac.inhatc.mvc.mapper;

import java.util.List;

public interface BoardMapper {
	List<?> selectSubjectList(String name) throws Exception;
	int selectSubjectListCount(String name) throws Exception;
}
