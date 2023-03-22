package edu.kh.jdbc.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jdbc.model.dto.Emp;

public class EmpDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<Emp> selectAll(Connection conn) throws SQLException {
		List<Emp> EmpList = new ArrayList<>();

		try {
			String sql = "SELECT EMP_ID, EMP_NAME,DEPT_TITLE,JOB_NAME ,SALARY,PHONE,EMAIL\r\n" + "FROM EMPLOYEE\r\n"
					+ "JOIN JOB USING(JOB_CODE)\r\n" + "LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)\r\n"
					+ "WHERE ENT_YN = 'N'\r\n" + "ORDER BY DEPT_TITLE ASC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int empId = rs.getInt(1);
				String empName = rs.getNString(2);
				String departmentName = rs.getNString(3);
				String jobname = rs.getNString(4);
				int salary = rs.getInt(5);
				String phone = rs.getNString(6);
				String email = rs.getNString(7);

				Emp emp = new Emp(empId, empName, departmentName, jobname, salary, phone, email);

				EmpList.add(emp); // 리스트 추가
			}
		} finally {
			close(stmt);
			close(conn);
		}
		return EmpList;
	}

	public List<Emp> selectEntAll(Connection conn) throws SQLException {
		List<Emp> EmpList = new ArrayList<>();
		try {
			String sql = "SELECT EMP_ID, EMP_NAME,PHONE,EMAIL, ENT_DATE\r\n" + "FROM EMPLOYEE\r\n"
					+ "WHERE ENT_YN = 'Y'\r\n" + "ORDER BY ENT_DATE ASC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int empId = rs.getInt(1);
				String empName = rs.getNString(2);
				String phone = rs.getNString(3);
				String email = rs.getNString(4);
				String entDate = rs.getNString(5);

				Emp emp = new Emp(empId, empName, email, phone, entDate);

				EmpList.add(emp); // 리스트 추가
			}
		} finally {
			close(stmt);
			close(conn);
		}
		return EmpList;
	}

	public Emp selectOne(Connection conn, int input) throws SQLException {
		Emp emp = null;
		try {
			String sql = "SELECT  EMP_ID,EMP_NAME,DEPT_TITLE,JOB_NAME,SALARY,PHONE,EMAIL,HIRE_DATE,ENT_YN\r\n"
					+ "FROM EMPLOYEE \r\n" + "JOIN JOB USING(JOB_CODE)\r\n"
					+ "LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)\r\n" + "WHERE EMP_ID = '" + input + "'";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				String departmentName = rs.getString(3);
				String jobName = rs.getString(4);
				int salary = rs.getInt(5);
				String phone = rs.getString(6);
				String email = rs.getString(7);
				Date hire_date = rs.getDate(8);
				String entyn = rs.getString(9);

				emp = new Emp(empId, empName, email, phone, salary, hire_date, jobName, departmentName, entyn);
			}
		} finally {
			close(rs);
			close(stmt);
		}

		return emp;
	}

	public int insertEmployee(Connection conn, Emp emp) throws SQLException {

		int result = 0;
		try {
			String sql = "INSERT INTO EMPLOYEE VALUES(SEQ_EMP_ID.NEXTVAL," + "?,?,?,?,?,?,?,?,?,?, SYSDATE, NULL,'N')";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, emp.getEmpName());
			pstmt.setString(2, emp.getEmpNo());
			pstmt.setString(3, emp.getEmail());
			pstmt.setString(4, emp.getPhone());
			pstmt.setString(5, emp.getDeptCode());
			pstmt.setString(6, emp.getJobCode());
			pstmt.setString(7, emp.getSalLevel());
			pstmt.setInt(8, emp.getSalary());
			pstmt.setDouble(9, emp.getBonus());
			pstmt.setInt(10, emp.getManagerId());

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int updateEmployee(Connection conn, Emp emp) throws SQLException {

		int result = 0;
		try {
			// 2. PreaparedStatement 생성

			// 1)SQL 작성
			String sql = "UPDATE EMPLOYEE\r\n" + "SET EMAIL = ?,\r\n" + "	PHONE = ?,\r\n" + "	SALARY = ?,\r\n"
					+ "	BONUS = ?\r\n" + "WHERE EMP_ID = ?";

			// 2)PreaparedStatement 생성 후 placeholder에 값 세팅
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, emp.getEmail());
			pstmt.setString(2, emp.getPhone());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setDouble(4, emp.getBonus());
			pstmt.setInt(5, emp.getEmpId());
			// set자료형() 으로 ?에 값을 세팅할 때
			// 자료형에 맞는 DB 리터럴 표기법으로 변환되서 세팅된다!

			// setString() -> 'hong@fkemfwfw'
			// setInt() -> 1200000
			// setDouble() -> 0.2
			// setDate(순서, java.sql.date) -> DB DATE 타입

			// 3. 수행 후 결과 반환 받기
			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
			// 4. JDBC 객체 자원 반환
		}
		// 5.결과반환
		return result;
	}

	public int deleteEmployee(Connection conn, Emp emp) throws SQLException {
		int result = 0;
		try {
			String sql = "DELETE FROM EMPLOYEE \r\n" + "WHERE EMP_ID = '?'";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmpId());

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int retireEmployee(Connection conn, int input) throws SQLException {
		int result = 0;
		try {
			String sql = "UPDATE EMPLOYEE \r\n" 
					+ "SET ENT_YN = 'Y',\r\n" 
					+ "	ENT_DATE = SYSDATE\r\n"
					+ "WHERE EMP_ID = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, input);

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}
		return result;
	}
}
