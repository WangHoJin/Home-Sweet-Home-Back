package com.ssafy.happyhouse.model;

public class InterestAreaDto {
	private String userid;
	private String dongcode;

	public InterestAreaDto() {
	}

	public InterestAreaDto(String userid, String dongcode) {
		super();
		this.userid = userid;
		this.dongcode = dongcode;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getDongcode() {
		return dongcode;
	}

	public void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}

	@Override
	public String toString() {
		return "InterestAreaDto [userid=" + userid + ", dongcode=" + dongcode + "]";
	}

}
