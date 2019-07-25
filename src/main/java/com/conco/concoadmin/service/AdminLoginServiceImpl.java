  
package com.conco.concoadmin.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.AuthenticationException;

import com.conco.concoadmin.mapper.AdminMapper;
import com.conco.concoadmin.vo.AdminHistoryVO;
import com.conco.concoadmin.vo.AdminVO;
import com.conco.concoadmin.vo.LoginHistroyVO;
import com.conco.concoadmin.vo.LoginVO;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


import eu.bitwalker.useragentutils.UserAgent;

@Service("adminLoginService")
public class AdminLoginServiceImpl implements AdminLoginService {

	@Resource(name = "adminMapper")
	private AdminMapper adminMapper;

	@Override
	public HashMap<String, String> login_success(HttpSession session, HttpServletRequest request) throws Exception {
												 
		System.out.println("loginSuccess");
		HashMap<String, String> result = new HashMap<String, String>();

		LoginHistroyVO lhvo = new LoginHistroyVO();
		LoginVO lvo = new LoginVO();
		AdminVO avo = new AdminVO();
		AdminHistoryVO ahvo = new AdminHistoryVO();

		String EMAIL = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

   
		lvo.setMEMBER_ID(EMAIL);
		avo.setADMIN_ID(EMAIL);

		HashMap<String, String> adm_role_chk = adminMapper.adm_role_chk(avo);
		System.out.println(adm_role_chk + "   adm_role_chk");

		if (adm_role_chk == null) {
			String Msg = "잘못된 접근입니다.";

			result.put("ResultCode", "3");
			result.put("Data", Msg);

			return result;
		}

		// IP 가져오기
		String ip_result = "";
		try {
			ip_result = request.getHeader("X-FORWARDED-FOR");

			if (ip_result == null) {
				ip_result = request.getRemoteAddr();
			}

		} catch (Exception err) {
			ip_result = "Unknown";
		}

		// 브라우저 정보 확인하기
		UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));

		String user_info = (String) userAgent.toString();
		// 브라우저 가져오기
		String user_browser = userAgent.getBrowser().getName() + userAgent.getBrowserVersion();
		// OS 가져오기
		String user_os = (String) userAgent.getOperatingSystem().toString();

		lhvo.setLOGIN_IP(ip_result);
		lhvo.setLOGIN_INFO(user_info);
		lhvo.setLOGIN_BROWSER(user_browser);
		lhvo.setLOGIN_OS(user_os);
		lhvo.setLOGIN_ID(EMAIL);

		int LOGIN_TYPE = 0;

		if (adm_role_chk.get("MEMBER_ROLE").equals("ROLE_ADMIN")) {
			System.out.println("ADMIN");

			// ADMIN_MEMBER_NUM 가져오기
			// avo = sqlSession.selectOne("admin.getADMIN_INFO", avo);
			avo = adminMapper.getADMIN_INFO(avo);
			System.out.println(avo + "    avo");
			// ADMIN_MEMBER_NUM 세션 등록

			int ADMIN_MEMBER_NUM = avo.getADMIN_MEMBER_NUM();

			session.setAttribute("ADMIN_MEMBER_NUM", avo);

			// 로그인 날짜 및 account 삽입 insert
			Calendar calendar = Calendar.getInstance();
			java.util.Date date = calendar.getTime();
			String today = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));

			// 주소 가져오기
			String REQEUST_PAGE = request.getRequestURI();

			// avo 값들 셋팅
			// DB insert admin
			ahvo.setADMIN_MEMBER_NUM(ADMIN_MEMBER_NUM);
			ahvo.setEXECUTE_KIND("INSERT");
			ahvo.setREQUEST_PAGE(REQEUST_PAGE);
			ahvo.setADMIN_ACCOUNT(EMAIL);
			ahvo.setADMIN_DESC("LOGIN_SUCCESS // ADMIN_MEMBER_NUM : " + ADMIN_MEMBER_NUM);
			ahvo.setEXECUTE_DATE(today);

			int rst = adminMapper.insertADMIN_HISTORY(ahvo);
			System.out.println(rst + "       rst");

			if (rst > 0) {
				// 로그인 Date 삽입
				avo.setADMIN_MEMBER_NUM(ADMIN_MEMBER_NUM);
				avo.setADMIN_LOGINDATE(today);

				adminMapper.admin_setLoginDate(avo);

				// logger.info("ADMIN LOGIN SUCCESS / ADMIN_MEMBER_NUM : " + ADMIN_MEMBER_NUM +
				// " // 시각 : " + today);

				LOGIN_TYPE = 5;
				lhvo.setLOGIN_TYPE(LOGIN_TYPE);

				adminMapper.login_history(lhvo);

				String Msg = "ADMIN 로그인 성공";
				result.put("ResultCode", "0");
				result.put("Data", Msg);
				return result;
			} else {
				String Msg = "로그인 에러";
				result.put("ResultCode", "2");
				result.put("Data", Msg);
				return result;
			}
		} else {

			LOGIN_TYPE = 4;
			lhvo.setLOGIN_TYPE(LOGIN_TYPE);

			adminMapper.login_history(lhvo);

			String Msg = "관리자 외에 접근할 수 없습니다.";
			result.put("ResultCode", "4");
			result.put("Data", Msg);
			return result;
		}

	}

	@Override
	public HashMap<String, String> loginPageFail(HttpSession session, HttpServletRequest request)throws Exception {
												
		System.out.println("loginPageFail");
		System.out.println(request.getHeader("X-Forwarded-Proto"));
		HashMap<String, String> result = new HashMap<String, String>();
		AuthenticationException e = (AuthenticationException) session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
															 
	//	System.out.println(e+"      eeee");
		
		LoginVO vo = new LoginVO();
		LoginHistroyVO loginvo = new LoginHistroyVO();

		// json 객체 가져오기
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap = mapper.readValue(e.getMessage(), new TypeReference<Map<String, String>>(){});

		// resultMap 널 처리
		String CODE = resultMap.get("code");
		String MSG = resultMap.get("msg");

		// IP 가져오기
		String ip_result = "";
		try {
			ip_result = request.getHeader("X-FORWARDED-FOR");

			if (ip_result == null) {
				ip_result = request.getRemoteAddr();
			}

		} catch (Exception err) {
			ip_result = "Unknown";
		}

		// 브라우저 정보 확인하기
		UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));

		String user_info = (String) userAgent.toString();
		// 브라우저 가져오기
		String user_browser = userAgent.getBrowser().getName() + userAgent.getBrowserVersion();
		// OS 가져오기
		String user_os = (String) userAgent.getOperatingSystem().toString();

		loginvo.setLOGIN_IP(ip_result);
		loginvo.setLOGIN_INFO(user_info);
		loginvo.setLOGIN_BROWSER(user_browser);
		loginvo.setLOGIN_OS(user_os);

		int LOGIN_TYPE = 0;
		// 존재하지 않는 아이디
		if (CODE.equals("1")) {
			LOGIN_TYPE = 6;
			loginvo.setLOGIN_COUNT(0);
			loginvo.setLOGIN_TYPE(LOGIN_TYPE);

			//sqlSession.insert("login.login_history", loginvo);
			adminMapper.login_history(loginvo);
			
			result.put("ResultCode", "1");
			result.put("Data", MSG);
			return result;
		}

		// 입력한 정보가 잘못되었습니다.
		if (CODE.equals("2")) {
			LOGIN_TYPE = 7;
			String COUNT = resultMap.get("count");
			String EMAIL = resultMap.get("email");

			loginvo.setLOGIN_ID(EMAIL);
			loginvo.setLOGIN_TYPE(LOGIN_TYPE);
			loginvo.setLOGIN_COUNT(0);

			adminMapper.login_history(loginvo);

			result.put("ResultCode", "2");
			result.put("Data", MSG);
			return result;
		}

		// 관리자 이외에 로그인
		if (CODE.equals("7")) {
			LOGIN_TYPE = 8;
			String COUNT = resultMap.get("count");
			String EMAIL = resultMap.get("email");

			loginvo.setLOGIN_ID(EMAIL);
			loginvo.setLOGIN_TYPE(LOGIN_TYPE);
			loginvo.setLOGIN_COUNT(0);

			adminMapper.login_history(loginvo);

			result.put("ResultCode", "2");
			result.put("Data", MSG);
			return result;
		}
		return result;
	}

}
