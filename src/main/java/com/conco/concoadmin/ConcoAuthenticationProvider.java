package com.conco.concoadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.conco.concoadmin.mapper.AdminMapper;
import com.conco.concoadmin.util.md5;
import com.conco.concoadmin.vo.AdminVO;

//type
//1 : ����
//2 : �������� �ʴ� ���̵�
//3 : ��й�ȣ�� Ʋ�� ����
//@Service
@Component
public class ConcoAuthenticationProvider implements AuthenticationProvider {

	@Resource(name = "adminMapper")
	private AdminMapper adminMapper;



	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String user_id = (String) authentication.getPrincipal();
		String user_pw = md5.testMD5((String) authentication.getCredentials());
		AdminVO avo = new AdminVO();

		avo.setADMIN_ID(user_id);
		avo.setADMIN_PASS(user_pw);

		try {
			//������ ID, PW ���� ��������
			HashMap<String, String> admin_chk = adminMapper.admin_chk(avo);
			
			if ( admin_chk == null) {
				throw new BadCredentialsException("{\"code\":\"1\", \"msg\":\"�������� �ʴ� ���̵� �Դϴ�.\"}");
			}
			
			//������ ID , PW ���� üũ
			if (user_id.equals(admin_chk.get("ADMIN_ID")) && user_pw.equals(admin_chk.get("ADMIN_PASS")) ) {
				//ROLEüũ
//				HashMap<String, String> role_chk = sqlSession.selectOne("login.role_chk", vo);
				HashMap<String, String> adm_role_chk = adminMapper.adm_role_chk(avo);
				System.out.println(adm_role_chk+ "   adm_role_chk");
				
				avo.setMEMBER_ROLE(adm_role_chk.get("MEMBER_ROLE"));
				
				//�����ڰ� ���� ���� üũ �� �� üũ
				if ( adm_role_chk.get("MEMBER_ROLE").equals("ROLE_ADMIN")) {
					
					List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
					roles.add(new SimpleGrantedAuthority(avo.getMEMBER_ROLE()));
			        
			        UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(user_id, user_pw, roles);
			        result.setDetails(new ConcoUserDetails(user_id, user_pw));
			        
					return result;
				} else {
					throw new BadCredentialsException("{\"code\":\"7\", \"msg\":\"������ �ܿ� �����Ͻ� �� �����ϴ�.\" , \"email\":\"" + user_id + "\"}");
				}
			} else {  
				throw new BadCredentialsException("{\"code\":\"2\", \"msg\":\"�Է��Ͻ� ������ �߸��Ǿ����ϴ�.\", \"email\":\"" + user_id + "\"}");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	
	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
