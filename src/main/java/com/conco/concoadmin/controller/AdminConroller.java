package com.conco.concoadmin.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conco.concoadmin.service.AdminLoginService;
import com.conco.concoadmin.service.AdminService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
public class AdminConroller {

	@Resource(name = "adminService")
	private AdminService adminService;
	
	@Resource(name = "adminLoginService")
	private AdminLoginService adminLoginService;

//	@Resource(name = "adminMapper")
//	private AdminMapper adminMapper;

//	@RequestMapping("/")
//	public String ADM() {
//		return "ADM/login";
//	}

	@GetMapping("/ADM/{name}.html")
	public String main(@PathVariable String name, Model model) {
		System.out.println(name + "   namenamename");
		model.addAttribute("pageName", name);
		return "ADM/ADM";
	}

	@GetMapping("/ADM")
	public String login(Model model) {
		System.out.println("///");
		String name = "login";
		model.addAttribute("pageName", name);
		return "ADM/login";
	}

//	@RequestMapping(value = "/loginSuccess", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
//	@ResponseBody
//	public HashMap<String, String> login_success(HttpSession session, HttpServletRequest request) {
//		System.out.println("aaaa");
//		return null;
//	
//	}

	@RequestMapping(value = "/ADM/loginSuccess", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public HashMap<String, String> login_success(HttpSession session, HttpServletRequest request) throws Exception {
		
		HashMap<String, String> result = adminLoginService.login_success(session,request);
		System.out.println(result+"   Successresult");
		return result;
	}

	@RequestMapping(value = "/ADM/loginPageFail", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public HashMap<String, String> loginPageFail(HttpSession session, HttpServletRequest request) throws Exception {
		HashMap<String, String> result = adminLoginService.loginPageFail(session,request);
		System.out.println(result+"   Faileresult");
		return result;
	}
	
//	@RequestMapping("/signin")
//	public String signindd( @RequestParam HashMap<String, String> commandMap) {
//		System.out.println(commandMap+"    commandMap들어왔다");
//		return "yes";
//	}

//	@RequestMapping("/ADM")
//	public String ADM() {
//		return "ADM/ADM";
//	}
//	
//	@RequestMapping("/test")
//	public String test() throws Exception {
//		System.out.println("컨트롤러");
//		List<TestVO> list = adminService.testList();
//		System.out.println(list+"  listlistlistlist");
//		return "ADM/ADM";
//	}
}
