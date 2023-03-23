package edu.kh.jdbc.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import edu.kh.jdbc.model.dao.EmpDAO;
import edu.kh.jdbc.model.dto.Emp;

public class EmpService {

	private EmpDAO dao = new EmpDAO();

	public List<Emp> selectAll() throws SQLException{
		
		Connection conn = getConnection();
		List<Emp> EmpList = dao.selectAll(conn);
		close(conn);
		return EmpList;
	}

	public List<Emp> selectEntAll() throws SQLException{
		Connection conn = getConnection();
		List<Emp> EmpList = dao.selectEntAll(conn);
		close(conn);
		return EmpList;
	}

	public Emp selectOce(int input) throws SQLException{
		Connection conn = getConnection();
		Emp emp = dao.selectOne(conn,input);
		close(conn);
		return emp;
	}

	public int insertEmployee(Emp emp) throws SQLException{
		Connection conn = getConnection();
		int result = dao.insertEmployee(conn, emp);
		if(result>0) { // 삽입 성공시
			commit(conn);
		}else // 삽입 실패시
			rollback(conn);
		
		//4.커넥션 반환
		close(conn);
		//5. 결과 반환
		return result;
	}

	public int updateEmployee(Emp emp) throws SQLException{
		Connection conn = getConnection();
		int result =dao.updateEmployee(conn, emp);
		
		if(result >0 )commit(conn);
		 else 			rollback(conn);
		 close(conn);
		 return result;
	}

	public int deleteEmployee(Emp emp) throws SQLException{
		Connection conn = getConnection();
		int result =dao.deleteEmployee(conn, emp);
		if(result >0 )commit(conn);
		 else 			rollback(conn);
		 close(conn);
		 return result;
	}

	/**
	 * @param input
	 * @return check (0: 없는 사원, 1: 퇴직한 사원, 2: 재직중인 사원)
	 * @throws SQLException
	 */
	public int checkEmployee(int input) throws SQLException{
		Connection conn = getConnection();
		int check = dao.checkEmployee(conn, input);
		close(conn);
		return check;
	}

	/** 퇴직 처리 서비스
	 * @param input
	 * @throws SQLException
	 */
	public void retireEmployee(int input) throws SQLException{

		Connection conn = getConnection();
		
		 dao.retireEmployee(conn, input);
		//트랜잭션 처리
		 // 예외 발생시 SQL 수행이 정상적으로 진행되지 않음
		commit(conn);
	
		close(conn);
	}

	/** 부서별 통계 조회 서비스
	 * @return mapList
	 * @throws SQLException
	 */
	public List<Map<String, Object>> selectDepartment() throws SQLException{

		Connection conn = getConnection();
		List<Map<String, Object>> mapList = dao.selectDepartment(conn);
		close(conn);
		return mapList;
	}

}
