package com.conco.concoadmin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.conco.concoadmin.mapper.AdminMapper;
import com.conco.concoadmin.vo.TestVO;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	
	@Resource(name="adminMapper") 
	private AdminMapper adminMapper;

	
	@Override
	public List<TestVO> testList() throws Exception {
		System.out.println("serviceImpl접속");
		List<TestVO> vo;
		vo = adminMapper.testListDAO();
		System.out.println(vo.get(1).getADMIN_ID()+"   확인");
		return vo;
	}
}
