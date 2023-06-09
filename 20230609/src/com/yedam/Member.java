package com.yedam;

public class Member {

	private String id;
	private String pw;

	public Member() {
	}

	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);

		if (!(obj instanceof Member)) {
			return false;
		}
		Member member = (Member) obj;
		if (this.id.equals(member.id) && this.pw.equals(member.pw)) {
		}
		return true;

	}

	@Override
	public int hashCode() {
		return super.hashCode();
//		return this.id.hashCode();
	}

	@Override
	public String toString() {
//		return super.toString();
		return "회원아이디: " + id + ", " + "비밀번호: " + pw;
	}
}
