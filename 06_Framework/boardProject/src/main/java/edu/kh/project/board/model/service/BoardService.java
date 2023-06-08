package edu.kh.project.board.model.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import edu.kh.project.board.model.dto.Board;

public interface BoardService {

	List<Map<String, Object>> selectBoardTypeList();

	Map<String, Object> selectBoardList(int boardCode, int cp);

	/** 게시글 상세 조회
	 * @param boardCode
	 * @param boardNo
	 * @return board
	 */
	Board selectBoard(Map<String, Object> map);

	/** 좋아요
	 * @param map
	 * @return
	 */
	int boardLikeCheck(Map<String, Object> map);

	/** 좋아요 처리 서비스
	 * @param paraMap
	 * @return count
	 */
	int like(Map<String, Integer> paramMap);

	/** 조회 수 증가 서비스
	 * @param boardNo
	 * @return result
	 */
	int updateReadCount(int boardNo)  throws IllegalStateException, IOException;
	
	/** 게시글 목록 조회 (검색)
	    * @param paramMap
	    * @param cp
	    * @return boardList
	    */
	   Map<String, Object> selectBoardList(Map<String, Object> paramMap, int cp);


		/** 헤더 검색
		 * @param query
		 * @return list
		 */
		List<Map<String, Object>> headerSearch(String query);


}

