package edu.kh.project.myPage.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface MyPageMapper {

	// 등록된 Bean 중 타입이 SqlSessionTemplate으로 일치하는 Bean을 주입 (DI)
	// -> root-context.xml에 <bean> 작성됨
	@Autowired

	/**
	 * 회원 정보 수정 DAO
	 * 
	 * @param updateMember
	 * @return result
	 */
	public int updateInfo(Member updateMember);

	/**
	 * 회원 비밀번호 조회
	 * 
	 * @param memberNo
	 * @return
	 */
	public String selectEncPw(int memberNo);

	/**
	 * 비밀번호 변경
	 * 
	 * @param member
	 * @return result
	 */
	public int changePw(Member memberNo);
	

	public int secession(int memberNo);

	/** 프로필 이미지 수정
	 * @param loginMember
	 * @return
	 */
	public int updateProfileImage(Member loginMember);
}