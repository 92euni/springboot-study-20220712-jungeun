package com.springboot.studyjungeun.web.controller.api.board;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/board")
public class BoardController {
	
		
	
	//[1. 게시글 작성]
	//단일 입력값 처리: request.getParameter를  => RequestParam(매개변수)로 파라미터 받음
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(@RequestParam("title")String title){
		System.out.println("게시글 작성 요청");
		System.out.println("title: " + title);
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-type","text/html;charset=utf-8");
		
		
		return ResponseEntity.ok().headers(headers).body("test");
		//순서지켜야함!! ↓밑에줄과 동일한 방식인데 static 방식 : 200ok
		
//		return new ResponseEntity<>(title + "게시글 작성 성공",headers, HttpStatus.BAD_REQUEST);
//		headers를 추가해서 보낼수 도 있다 : 400Bad Request
		
		/*
		 * BAD_REQUEST를 해줘야 한다 why?
		 * 우리는 클라이언트랑 협업을 해야한다
		 * 우리가 클라이언트에게 잘못됬어 라고 응답을 해줘야한다
		 * 클라이언트는 이 HttpStatus 코드를 보고 이런부분 잘못됬구나 라고 판별 가능
		 * 이걸가능하게 해주는 놈이 ResponseEntity 다
		 * 응답할 때 무조건 ResponseEntity 쓸 것!!
		 */

		
	}
	//[2. 게시글 조회]

	//[3. 게시글 수정]

	//[4. 게시글 삭제]
}