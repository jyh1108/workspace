package edu.kh.project.board.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.project.board.model.dao.BoardDAO;
import edu.kh.project.board.model.dto.Board;
import edu.kh.project.board.model.dto.Pagination;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO dao;

	//게시판 종류 목록
	@Override
	public List<Map<String, Object>> selectBoardTypeList() {
		return dao.selectBoardTypeList();
	}
	//게시글 목록 조회
	@Override
	public Map<String, Object> selectVoardList(int boardCode, int cp) {
		
		//1. 특정 게시판의 삭제되지 않은 게시글 수 조화
		int listCount = dao.getListCount(boardCode);
		
		//2. 1번 조회 결과 + cp를 이용해서 paginnion 객체 생성
		// -> 내부 필드가 모두 계산되어 초기화됨
		Pagination pagination = new Pagination(listCount, cp);
		
		//3 특징 게시판에서 
		// 현재 페이지에 해당하는 부분에 대한 게시글 목록 조회
		// (어떤 게시판(borade Code)에서 몇페이지에 대한 게시글 몇게 조회
		// 몇 페이지(Pagination.currentPage)에 대한 조회
		// 게시글 몇 개 (Pagination.limit)조회)
		List<Board> boardList = dao.selectBoardList(pagination, boardCode);
		
		//4. pagination, boardList를 map에 담아서 번호ㅓㄴ
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pagination", pagination);
		map.put("boardList", boardList);
		
		return map;
		
	}
	
}
