package com.conco.concoadmin.mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.conco.concoadmin.vo.AdminHistoryVO;
import com.conco.concoadmin.vo.AdminVO;
import com.conco.concoadmin.vo.LoginHistroyVO;
import com.conco.concoadmin.vo.TestVO;

@Repository("adminMapper")
public interface AdminMapper {
	public List<TestVO> testListDAO() throws Exception;
	
	
	public HashMap<String, String> admin_chk(AdminVO avo) throws Exception;
	
	public HashMap<String, String> adm_role_chk(AdminVO avo) throws Exception;
	
	public AdminVO getADMIN_INFO(AdminVO avo) throws Exception;
	
	public int insertADMIN_HISTORY(AdminHistoryVO ahvo) throws Exception;
	
	public void admin_setLoginDate(AdminVO avo) throws Exception;
	
	public void login_history(LoginHistroyVO lhvo) throws Exception;
}
