package com.ssafy.happyhouse.model;

public class CoffeeShopDto {
	private int cno;
	private String cname;
	private String branchname;
	private String sido_code;
	private String city;
	private String gugun_code;
	private String gugun_name;
	private String dong;
	private String address1;
	private String address2;
	private String lat;
	private String lng;

	private String cnt;
	private String coffeeshopcnt;

	public CoffeeShopDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoffeeShopDto(int cno, String cname, String branchname, String sido_code, String city, String gugun_code,
			String gugun_name, String dong, String address1, String address2, String lat, String lng, String cnt,
			String coffeeshopcnt) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.branchname = branchname;
		this.sido_code = sido_code;
		this.city = city;
		this.gugun_code = gugun_code;
		this.gugun_name = gugun_name;
		this.dong = dong;
		this.address1 = address1;
		this.address2 = address2;
		this.lat = lat;
		this.lng = lng;
		this.cnt = cnt;
		this.coffeeshopcnt = coffeeshopcnt;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getSido_code() {
		return sido_code;
	}

	public void setSido_code(String sido_code) {
		this.sido_code = sido_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGugun_code() {
		return gugun_code;
	}

	public void setGugun_code(String gugun_code) {
		this.gugun_code = gugun_code;
	}

	public String getGugun_name() {
		return gugun_name;
	}

	public void setGugun_name(String gugun_name) {
		this.gugun_name = gugun_name;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getCnt() {
		return cnt;
	}

	public void setCnt(String cnt) {
		this.cnt = cnt;
	}

	public String getCoffeeshopcnt() {
		return coffeeshopcnt;
	}

	public void setCoffeeshopcnt(String coffeeshopcnt) {
		this.coffeeshopcnt = coffeeshopcnt;
	}

	@Override
	public String toString() {
		return "CoffeeShopDto [cno=" + cno + ", cname=" + cname + ", branchname=" + branchname + ", sido_code="
				+ sido_code + ", city=" + city + ", gugun_code=" + gugun_code + ", gugun_name=" + gugun_name + ", dong="
				+ dong + ", address1=" + address1 + ", address2=" + address2 + ", lat=" + lat + ", lng=" + lng
				+ ", cnt=" + cnt + ", coffeeshopcnt=" + coffeeshopcnt + "]";
	}

}
