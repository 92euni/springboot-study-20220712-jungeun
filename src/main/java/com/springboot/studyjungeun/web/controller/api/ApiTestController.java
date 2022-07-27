package com.springboot.studyjungeun.web.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyjungeun.web.dto.TestRespDto;
import com.springboot.studyjungeun.web.dto.TestUser;

//RestController 모든 메소드들한테 자동으로 Responseboby가 달려있는것과 같다

//ResponseBody는 일반 데이터 리턴이다
//데이터 통신용!! HTML(X)

//페이지로드 -> Controller
//데이터통신 -> RestController

/*
* springboot는 RestController를 통해서 데이터 통신만 한다
* 페이지는 로드만 해주겠다
* ajax를 통해서 전부다 RestController를 호출
*/

@RestController
@RequestMapping("/api/v1")	//써주는 이유?

public class ApiTestController {
	
	@GetMapping("/test")		//이유의 답 : 여기 앞에 /api/v1 이 다 붙는다 ->/api/v1/test
	public Object getTest() {	//Jackson역할
		return TestRespDto.builder().username("euni").password("1234").build();
	}
	
	@PostMapping("/test")
	public String postTest() {
		return "test data(post)";
		//리턴에 객체만 넣고 ResponseBody를 달아주면 전부다 jackson이 json으로 알아서 형변환해준다
	}
	
	/*
	 * [직접 해보세용!]
	 * 요청 메소드 : post
	 * 요청 주소 : /api/v1/user
	 * User 클래스 생성
	 * username
	 * password
	 * name
	 * email
	 * 
	 * Json으로 응답받기
	 * 
	 */
	
	@PostMapping("/user")
	public Object postUserTest() {
		return TestUser.builder().username("euni1").password("12345").name("으니").email("aa@naver.com").build();
	}

}
