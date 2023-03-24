package edu.kh.jdbc.member.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.jdbc.member.model.dto.Member;

public class MemberDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// xml에 작성된 sql을 읽어와 저장할 객체 참조 변수
	private Properties prop;

	public MemberDAO() { // 기본 생성자로 객체 생성 시 xml 읽어오기
		try {
			prop = new Properties();

			prop.loadFromXML(new FileInputStream("member-sql.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/** 회원 목록 조회 sql 수행
	 * @param conn
	 * @return memberList
	 * @throws Exception
	 */
	public List<Member> selectMemberList(Connection conn) throws Exception {
		List<Member> memberList = new ArrayList<>();
		
		try {
			String sql = prop.getProperty("selectMemberList");
			
			stmt= conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				String memberId = rs.getString("MEMBER_ID");
				String memberName = rs.getString("MEMBER_NM");
				String memberGender = rs.getString("성별");
				
				Member member = new Member();
				member.setMemeberId(memberId);
				member.setMemeberName(memberName);
				member.setMemeberGender(memberGender);
				
				memberList.add(member);
			}
		} finally {
			close(stmt);
			close(rs);
		}
		return memberList;
	}
}
