package edu.kh.project.member.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.member.model.dto.Member;

@Repository //DB 연결 의미 + bean(스프링 관리하는 객체) 등록 
public class AjaxDAO {
	
	@Autowired // bean 중에서 타입이 같은 객체를 DI(의존성 주입)
	private SqlSessionTemplate sqlSesion;

	public String selectNickname(String email) {
		return sqlSesion.selectOne("ajaxMapper.selectNickname",email);
	}
	
	public String selectMemberTel(String nickname) {
		return sqlSesion.selectOne("ajaxMapper.selectMemberTel",nickname);
	}

	public int checkEmail(String email) {
		return sqlSesion.selectOne("ajaxMapper.checkEmail",email);
	}

	public int checkNickname(String nickname) {
		return sqlSesion.selectOne("ajaxMapper.checkNickname",nickname);
	}

	public Member selectMember(String email) {
		return sqlSesion.selectOne("ajaxMapper.selectMember",email);
	}

	public List<Member> selectMemberList(String input) {
		return sqlSesion.selectList("ajaxMapper.selectMemberList",input);
	}
}
