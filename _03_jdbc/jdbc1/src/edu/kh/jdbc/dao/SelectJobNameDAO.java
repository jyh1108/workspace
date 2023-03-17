package edu.kh.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jdbc.dto.Employee2;

public class SelectJobNameDAO {

	public List<Employee2> select(String gjobName) {

		List<Employee2> empList2 = new ArrayList<>();
		// 1단계 : JDBC 객체 참조 변수 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 2단계 : 참조 변수에 알맞은 값 대입
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			String type = "jdbc:oracle:thin:@";
			String ip = "localhost";
			String port = ":1521";
			String dbName = ":ORCL";
			String user = "kh_jyh";
			String pw = "oracle_jyh123A";

			conn = DriverManager.getConnection(type + ip + port + dbName, user, pw);

			String sql = "SELECT NVL(DEPT_TITLE, '부서없음'),JOB_NAME, EMP_NAME ,EMAIL " + "FROM EMPLOYEE "
					+ "JOIN JOB USING(JOB_CODE) " + "LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID) "
					+ " WHERE JOB_NAME = '" + gjobName + "' ";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// 3단계
			while (rs.next()) {

				String dept_Title = rs.getNString(1);
				String job_Name = rs.getNString(2);
				String emp_Name = rs.getNString(3);
				String email = rs.getString(4);

				Employee2 emp = new Employee2(dept_Title, job_Name, emp_Name, email);

				empList2.add(emp);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 4단계 : JDBC 객체 자원 반환
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return empList2;

	}
}
