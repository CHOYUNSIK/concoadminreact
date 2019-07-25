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
//1 : 성공
//2 : 존재하지 않는 아이디
//3 : 비밀번호가 틀린 유저
//@Service
@Component
public class ConcoAuthenticationProvider implements AuthenticationProvider {

	@Resource(name = "adminMapper")
	private AdminMapper adminMapper;



	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		System.out.println("ConcoAuthenticationProvider 들어옴");
		
		String user_id = (String) authentication.getPrincipal();
		String user_pw = md5.testMD5((String) authentication.getCredentials());
		AdminVO avo = new AdminVO();

		avo.setADMIN_ID(user_id);
		avo.setADMIN_PASS(user_pw);

		try {
			//관리자 ID, PW 정보 가져오기
			HashMap<String, String> admin_chk = adminMapper.admin_chk(avo);
			
			
			
			if ( admin_chk == null) {
				throw new BadCredentialsException("{\"code\":\"1\", \"msg\":\"존재하지 않는 아이디 입니다.\"}");
			}
			
			//관리자 ID , PW 여부 체크
			if (user_id.equals(admin_chk.get("ADMIN_ID")) && user_pw.equals(admin_chk.get("ADMIN_PASS")) ) {
				//ROLE체크
//				HashMap<String, String> role_chk = sqlSession.selectOne("login.role_chk", vo);
				HashMap<String, String> adm_role_chk = adminMapper.adm_role_chk(avo);
				System.out.println(adm_role_chk+ "   adm_role_chk");
				
				avo.setMEMBER_ROLE(adm_role_chk.get("MEMBER_ROLE"));
				
				//관리자가 계정 여부 체크 후 롤 체크
				if ( adm_role_chk.get("MEMBER_ROLE").equals("ROLE_ADMIN")) {
					
					List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
					roles.add(new SimpleGrantedAuthority(avo.getMEMBER_ROLE()));
			        
			        UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(user_id, user_pw, roles);
			        result.setDetails(new ConcoUserDetails(user_id, user_pw));
			        
					return result;
				} else {
					throw new BadCredentialsException("{\"code\":\"7\", \"msg\":\"관리자 외에 접근하실 수 없습니다.\" , \"email\":\"" + user_id + "\"}");
				}
			} else {  
				throw new BadCredentialsException("{\"code\":\"2\", \"msg\":\"입력하신 정보가 잘못되었습니다.\", \"email\":\"" + user_id + "\"}");
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
