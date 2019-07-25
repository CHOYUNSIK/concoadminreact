package com.conco.concoadmin.service;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface AdminLoginService {
	 HashMap<String, String> login_success(HttpSession session, HttpServletRequest request) throws Exception; 
	 HashMap<String, String> loginPageFail(HttpSession session, HttpServletRequest request) throws Exception; 
}
