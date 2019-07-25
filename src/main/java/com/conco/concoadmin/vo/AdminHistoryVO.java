package com.conco.concoadmin.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminHistoryVO {
	private int ADMIN_NUM; 
	@JsonProperty("EXECUTE_KIND")
	private String EXECUTE_KIND;
	@JsonProperty("REQUEST_PAGE")
	private String REQUEST_PAGE;
	@JsonProperty("ADMIN_ACCOUNT")
	private String ADMIN_ACCOUNT;
	@JsonProperty("ADMIN_DESC")
	private String ADMIN_DESC; 
	@JsonProperty("EXECUTE_QUERY")
	private String EXECUTE_QUERY;
	@JsonProperty("EXECUTE_REASON")
	private String EXECUTE_REASON;
	@JsonProperty("EXECUTE_DATE")
	private String EXECUTE_DATE;
	@JsonProperty("ADMIN_MEMBER_NUM")
	private int ADMIN_MEMBER_NUM;
	@JsonProperty("ADMIN_NAME")
	private String ADMIN_NAME;
	@JsonProperty("ADMIN_LEVEL")
	private String ADMIN_LEVEL;
	
	public String getEXECUTE_KIND() {
		return EXECUTE_KIND;
	}
	public void setEXECUTE_KIND(String eXECUTE_KIND) {
		EXECUTE_KIND = eXECUTE_KIND;
	}
	public int getADMIN_NUM() {
		return ADMIN_NUM;
	}
	public void setADMIN_NUM(int aDMIN_NUM) {
		ADMIN_NUM = aDMIN_NUM;
	}
	public String getREQUEST_PAGE() {
		return REQUEST_PAGE;
	}
	public void setREQUEST_PAGE(String rEQUEST_PAGE) {
		REQUEST_PAGE = rEQUEST_PAGE;
	}
	public String getADMIN_ACCOUNT() {
		return ADMIN_ACCOUNT;
	}
	public void setADMIN_ACCOUNT(String aDMIN_ACCOUNT) {
		ADMIN_ACCOUNT = aDMIN_ACCOUNT;
	}
	public String getADMIN_DESC() {
		return ADMIN_DESC;
	}
	public void setADMIN_DESC(String aDMIN_DESC) {
		ADMIN_DESC = aDMIN_DESC;
	}
	public String getEXECUTE_QUERY() {
		return EXECUTE_QUERY;
	}
	public void setEXECUTE_QUERY(String eXECUTE_QUERY) {
		EXECUTE_QUERY = eXECUTE_QUERY;
	}
	public String getEXECUTE_DATE() {
		return EXECUTE_DATE;
	}
	public void setEXECUTE_DATE(String eXECUTE_DATE) {
		EXECUTE_DATE = eXECUTE_DATE;
	}
	public int getADMIN_MEMBER_NUM() {
		return ADMIN_MEMBER_NUM;
	}
	public void setADMIN_MEMBER_NUM(int aDMIN_MEMBER_NUM) {
		ADMIN_MEMBER_NUM = aDMIN_MEMBER_NUM;
	}
	public String getADMIN_NAME() {
		return ADMIN_NAME;
	}
	public void setADMIN_NAME(String aDMIN_NAME) {
		ADMIN_NAME = aDMIN_NAME;
	}
	public String getADMIN_LEVEL() {
		return ADMIN_LEVEL;
	}
	public void setADMIN_LEVEL(String aDMIN_LEVEL) {
		ADMIN_LEVEL = aDMIN_LEVEL;
	}
	public String getEXECUTE_REASON() {
		return EXECUTE_REASON;
	}
	public void setEXECUTE_REASON(String eXECUTE_REASON) {
		EXECUTE_REASON = eXECUTE_REASON;
	}
}
