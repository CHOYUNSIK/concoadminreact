package com.conco.concoadmin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginVO {

	private String MEMBER_ID;
	private String MEMBER_PASS;
	private String MEMBER_NAME;
	private String MEMBER_PHONE;
	private String MEMBER_ROLE;
	private int MEMBER_ERR;
	private String MEMBER_BIRTH;	
	private int MEMBER_NUM;
	private String MEMBER_CI;
	private String MEMBER_LOGINDATE;
	private String MEMBER_SEX;

	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getMEMBER_PASS() {
		return MEMBER_PASS;
	}
	public void setMEMBER_PASS(String mEMBER_PASS) {
		MEMBER_PASS = mEMBER_PASS;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public String getMEMBER_PHONE() {
		return MEMBER_PHONE;
	}
	public void setMEMBER_PHONE(String mEMBER_PHONE) {
		MEMBER_PHONE = mEMBER_PHONE;
	}
	public String getMEMBER_ROLE() {
		return MEMBER_ROLE;
	}
	public void setMEMBER_ROLE(String mEMBER_ROLE) {
		MEMBER_ROLE = mEMBER_ROLE;
	}
	public int getMEMBER_ERR() {
		return MEMBER_ERR;
	}
	public void setMEMBER_ERR(int mEMBER_ERR) {
		MEMBER_ERR = mEMBER_ERR;
	}
	public String getMEMBER_BIRTH() {
		return MEMBER_BIRTH;
	}
	public void setMEMBER_BIRTH(String mEMBER_BIRTH) {
		MEMBER_BIRTH = mEMBER_BIRTH;
	}
//	public String getMEMBER_AUTHCODE() {
//		return MEMBER_AUTHCODE;
//	}
//	public void setMEMBER_AUTHCODE(String mEMBER_AUTHCODE) {
//		MEMBER_AUTHCODE = mEMBER_AUTHCODE;
//	}
	public int getMEMBER_NUM() {
		return MEMBER_NUM;
	}
	public void setMEMBER_NUM(int mEMBER_NUM) {
		MEMBER_NUM = mEMBER_NUM;
	}
	public String getMEMBER_CI() {
		return MEMBER_CI;
	}
	public void setMEMBER_CI(String mEMBER_CI) {
		MEMBER_CI = mEMBER_CI;
	}
	public String getMEMBER_LOGINDATE() {
		return MEMBER_LOGINDATE;
	}
	public void setMEMBER_LOGINDATE(String mEMBER_LOGINDATE) {
		MEMBER_LOGINDATE = mEMBER_LOGINDATE;
	}
	public String getMEMBER_SEX() {
		return MEMBER_SEX;
	}
	public void setMEMBER_SEX(String mEMBER_SEX) {
		MEMBER_SEX = mEMBER_SEX;
	}


}
