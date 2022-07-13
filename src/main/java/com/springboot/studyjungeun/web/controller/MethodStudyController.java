package com.springboot.studyjungeun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MethodStudyController {
	
	@GetMapping({"/", "/index"})	//요청주소
	public String getMethod() {
		return "method/get";		//method폴더안에 get.html
	}
	
	@GetMapping("/test")			//요청주소
	public String getMethod2() {
		return "method/test";		//method폴더안에 test.html
	}
	
}
