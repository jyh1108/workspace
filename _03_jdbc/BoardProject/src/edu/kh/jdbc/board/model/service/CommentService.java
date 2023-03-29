package edu.kh.jdbc.board.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.close;
import static edu.kh.jdbc.common.JDBCTemplate.commit;
import static edu.kh.jdbc.common.JDBCTemplate.getConnection;
import static edu.kh.jdbc.common.JDBCTemplate.rollback;

import java.sql.Connection;

import edu.kh.jdbc.board.model.dao.CommentDAO;

public class CommentService {
	private static CommentDAO dao = new CommentDAO();

	public static int insertComment(int boardNo, String commentContent, int memberNo) throws Exception {
		Connection conn = getConnection();
		int commentNo = dao.commentNo(conn);

		int result = dao.insertComment(conn, commentContent, memberNo, commentNo, boardNo);
		if (result > 0) {
			commit(conn);
			result = commentNo;
		} else {
			rollback(conn);
		}
		close(conn);

		return result;
	}

	public static int updateComment(String commentContent, String commentNo) throws Exception {
		Connection conn = getConnection();
		int result = dao.updateComment(conn, commentContent, commentNo);
		if (result > 0)
			commit(conn);
		else
			rollback(conn);

		close(conn);
		return result;
	}

	public static int deleteComment(String commentNo) throws Exception{
		Connection conn = getConnection();
		int result = dao.deleteComment(conn, commentNo);
		if (result > 0)
			commit(conn);
		else
			rollback(conn);

		close(conn);
		return result;
	}

}
