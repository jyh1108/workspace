package edu.kh.project.member.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.member.model.dto.Member;

@Repository
public class MemberDAO {

	@Autowired
	private MemberMapper memberMapper; //인터페이스를 상속 받는 자식 객체
										//-> 자식 객체가 sql세션템플릿을 이용 
	
	/**
	 * @param inputMember
	 * @return loginMember
	 */
	public Member login(Member inputMember) {
		
		return memberMapper.login(inputMember);
	}
	
	public int signUp(Member inputMember) {
		return memberMapper.signUp(inputMember);
	}
}
