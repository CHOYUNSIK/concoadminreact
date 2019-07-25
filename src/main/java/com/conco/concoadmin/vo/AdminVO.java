package com.conco.concoadmin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminVO {

	@JsonProperty("ADMIN_ID")
	private String ADMIN_ID;
	@JsonProperty("ADMIN_PASS")
	private String ADMIN_PASS;
	@JsonProperty("ADMIN_NAME")
	private String ADMIN_NAME;
	@JsonProperty("ADMIN_PHONE")
	private String ADMIN_PHONE;
	@JsonProperty("ADMIN_REGDATE")
	private String ADMIN_REGDATE;
	private String MEMBER_ROLE;
	@JsonProperty("ADMIN_MEMBER_NUM")
	private int ADMIN_MEMBER_NUM;
	@JsonProperty("ADMIN_LEVEL")
	private float ADMIN_LEVEL;
	@JsonProperty("ADMIN_LOGINDATE")
	private String ADMIN_LOGINDATE;
	@JsonProperty("ADMIN_USE")
	private String ADMIN_USE;
	private String ADMIN_DESC;
	
	public String getADMIN_ID() {
		return ADMIN_ID;
	}
	public void setADMIN_ID(String aDMIN_ID) {
		ADMIN_ID = aDMIN_ID;
	}
	public String getADMIN_PASS() {
		return ADMIN_PASS;
	}
	public void setADMIN_PASS(String aDMIN_PASS) {
		ADMIN_PASS = aDMIN_PASS;
	}
	public String getADMIN_NAME() {
		return ADMIN_NAME;
	}
	public void setADMIN_NAME(String aDMIN_NAME) {
		ADMIN_NAME = aDMIN_NAME;
	}
	public String getADMIN_PHONE() {
		return ADMIN_PHONE;
	}
	public void setADMIN_PHONE(String aDMIN_PHONE) {
		ADMIN_PHONE = aDMIN_PHONE;
	}
	public String getADMIN_REGDATE() {
		return ADMIN_REGDATE;
	}
	public void setADMIN_REGDATE(String aDMIN_REGDATE) {
		ADMIN_REGDATE = aDMIN_REGDATE;
	}
	public String getMEMBER_ROLE() {
		return MEMBER_ROLE;
	}
	public void setMEMBER_ROLE(String mEMBER_ROLE) {
		MEMBER_ROLE = mEMBER_ROLE;
	}
	
	public int getADMIN_MEMBER_NUM() {
		return ADMIN_MEMBER_NUM;
	}
	public void setADMIN_MEMBER_NUM(int aDMIN_MEMBER_NUM) {
		ADMIN_MEMBER_NUM = aDMIN_MEMBER_NUM;
	}
	public float getADMIN_LEVEL() {
		return ADMIN_LEVEL;
	}
	public void setADMIN_LEVEL(float aDMIN_LEVEL) {
		ADMIN_LEVEL = aDMIN_LEVEL;
	}
	public String getADMIN_LOGINDATE() {
		return ADMIN_LOGINDATE;
	}
	public void setADMIN_LOGINDATE(String aDMIN_LOGINDATE) {
		ADMIN_LOGINDATE = aDMIN_LOGINDATE;
	}
	public String getADMIN_USE() {
		return ADMIN_USE;
	}
	public void setADMIN_USE(String aDMIN_USE) {
		ADMIN_USE = aDMIN_USE;
	}
	public String getADMIN_DESC() {
		return ADMIN_DESC;
	}
	public void setADMIN_DESC(String aDMIN_DESC) {
		ADMIN_DESC = aDMIN_DESC;
	}

}
