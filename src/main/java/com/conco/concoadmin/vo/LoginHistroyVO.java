package com.conco.concoadmin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginHistroyVO {

	@JsonProperty("LOGIN_NUM")
	private int LOGIN_NUM;
	@JsonProperty("LOGIN_TYPE")
	private int LOGIN_TYPE;
	@JsonProperty("LOGIN_INFO")
	private String LOGIN_INFO;
	@JsonProperty("LOGIN_IP")
	private String LOGIN_IP;
	@JsonProperty("LOGIN_BROWSER")
	private String LOGIN_BROWSER;
	@JsonProperty("LOGIN_OS")
	private String LOGIN_OS;
	@JsonProperty("LOGIN_COUNT")
	private int LOGIN_COUNT;
	@JsonProperty("LOGIN_ID")
	private String LOGIN_ID;
	@JsonProperty("MEMBER_NAME")
	private String MEMBER_NAME;
	@JsonProperty("LOGIN_TIME")
	private String LOGIN_TIME;
	@JsonProperty("MEMBER_NUM")
	private int MEMBER_NUM;
	
	
	public int getLOGIN_TYPE() {
		return LOGIN_TYPE;
	}
	public void setLOGIN_TYPE(int lOGIN_TYPE) {
		LOGIN_TYPE = lOGIN_TYPE;
	}
	public String getLOGIN_INFO() {
		return LOGIN_INFO;
	}
	public void setLOGIN_INFO(String lOGIN_INFO) {
		LOGIN_INFO = lOGIN_INFO;
	}
	public String getLOGIN_IP() {
		return LOGIN_IP;
	}
	public void setLOGIN_IP(String lOGIN_IP) {
		LOGIN_IP = lOGIN_IP;
	}
	public String getLOGIN_BROWSER() {
		return LOGIN_BROWSER;
	}
	public void setLOGIN_BROWSER(String lOGIN_BROWSER) {
		LOGIN_BROWSER = lOGIN_BROWSER;
	}
	public String getLOGIN_OS() {
		return LOGIN_OS;
	}
	public void setLOGIN_OS(String lOGIN_OS) {
		LOGIN_OS = lOGIN_OS;
	}
	public int getLOGIN_COUNT() {
		return LOGIN_COUNT;
	}
	public void setLOGIN_COUNT(int lOGIN_COUNT) {
		LOGIN_COUNT = lOGIN_COUNT;
	}
	public String getLOGIN_ID() {
		return LOGIN_ID;
	}
	public void setLOGIN_ID(String lOGIN_ID) {
		LOGIN_ID = lOGIN_ID;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public int getLOGIN_NUM() {
		return LOGIN_NUM;
	}
	public void setLOGIN_NUM(int lOGIN_NUM) {
		LOGIN_NUM = lOGIN_NUM;
	}
	public String getLOGIN_TIME() {
		return LOGIN_TIME;
	}
	public void setLOGIN_TIME(String lOGIN_TIME) {
		LOGIN_TIME = lOGIN_TIME;
	}
	public int getMEMBER_NUM() {
		return MEMBER_NUM;
	}
	public void setMEMBER_NUM(int mEMBER_NUM) {
		MEMBER_NUM = mEMBER_NUM;
	}


}
