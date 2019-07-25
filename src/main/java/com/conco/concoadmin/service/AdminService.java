package com.conco.concoadmin.service;

import java.util.HashMap;
import java.util.List;

import com.conco.concoadmin.vo.TestVO;

public interface AdminService {
	List<TestVO> testList() throws Exception;
	
	/* HashMap<String, String> login_success() throws Exception; */
}
