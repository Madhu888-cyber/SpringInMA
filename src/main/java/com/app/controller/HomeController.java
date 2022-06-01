package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/all")
	public String all() {
		return "CommonPage";
	}
	@RequestMapping("/emp")
	public String emp() {
		return "EmployeePage";
	}
	@RequestMapping("/view")
	public String view() {
		return "ViewPage";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "AdminPage";
	}
	@RequestMapping("/denied")
	public String denied() {
		return "AccessDenied";
	}
}
