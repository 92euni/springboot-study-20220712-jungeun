package com.springboot.studyjungeun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MethodStudyController {
	
	@GetMapping({"/", "/index"})				//요청주소
	public String getMethod() {				
		return "method/get";					//method폴더안에 get.html
	}
	

//	@GetMapping("/api/v1/username")
//	@ResponseBody
//	public String getUsername() {
//		return "euni";
		//ResponseBody가 붙으면 일반 데이터 리턴이다 -> 그래서 euni라는 값이 날라온다
		//없으면 html응답이다

	}
	

