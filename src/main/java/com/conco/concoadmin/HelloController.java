package com.conco.concoadmin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "SpringBlog from Millky");
		return "hello";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/blank-page")
	public String blankpage(Model model) {
		return "blank-page";
	}
	
	@RequestMapping("/bootstrap-elements")
	public String bootstrapelements(Model model) {
		return "bootstrap-elements";
	}
	
	@RequestMapping("/bootstrap-grid")
	public String bootstrapgrid(Model model) {
		return "bootstrap-grid";
	}
	
	@RequestMapping("/index2")
	public String index2(Model model) {
		return "index-rtl";
	}
	
	@RequestMapping("/froms")
	public String froms(Model model) {
		return "froms";
	}
	
	@RequestMapping("/tables")
	public String tables(Model model) {
		return "tables";
	}
	
	@RequestMapping("/charts")
	public String charts(Model model) {
		return "charts";
	}
}