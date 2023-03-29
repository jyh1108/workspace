package edu.kh.jdbc.member.model.dto;

public class Member {
	
	private int memberNo;// 외원 번호
	private String memeberId;//회원 아이디
	private String memeberPw;// 회원 비밀번호
	private String memeberName;//회원 이름
	private String memeberGender;//회원 성별
	private String memeberDate;	//가입일
	private String unregisterFlag; //탈퇴여부
	private String EnrollDate;
	
	public String getEnrollDate() {
		return EnrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		EnrollDate = enrollDate;
	}

	public Member() {
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemeberId() {
		return memeberId;
	}

	public void setMemeberId(String memeberId) {
		this.memeberId = memeberId;
	}

	public String getMemeberPw() {
		return memeberPw;
	}

	public void setMemeberPw(String memeberPw) {
		this.memeberPw = memeberPw;
	}

	public String getMemeberName() {
		return memeberName;
	}

	public void setMemeberName(String memeberName) {
		this.memeberName = memeberName;
	}

	public String getMemeberGender() {
		return memeberGender;
	}

	public void setMemeberGender(String memeberGender) {
		this.memeberGender = memeberGender;
	}

	public String getMemeberDate() {
		return memeberDate;
	}

	public void setMemeberDate(String memeberDate) {
		this.memeberDate = memeberDate;
	}

	public String getUnregisterFlag() {
		return unregisterFlag;
	}

	public void setUnregisterFlag(String unregisterFlag) {
		this.unregisterFlag = unregisterFlag;
	}
	
	
	
}
