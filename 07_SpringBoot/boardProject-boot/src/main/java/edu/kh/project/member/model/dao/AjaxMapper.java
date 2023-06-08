package edu.kh.project.member.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface AjaxMapper {

//	이름으로 조회
	/**
	 * @param email
	 * @return count
	 */
	public String selectNickname(String email);
//	닉네임으로 전화번호 조회
	/**
	 * @param nickname
	 * @return count
	 */
	public String selectMemberTel(String nickname);
	
//	이메일 중복 검사
	/**
	 * @param email
	 * @return count
	 */
	public int checkEmail(String email);
//	닉네임 중복 검색
	/**
	 * @param nickname
	 * @return count 
	 */
	public int checkNickname(String nickname);

	/**
	 * @param email
	 * @return count
	 */
	public Member selectMember(String email);
	/**
	 * @param input
	 * @return count
	 */
	public List<Member> selectMemberList(String input);
	
}
