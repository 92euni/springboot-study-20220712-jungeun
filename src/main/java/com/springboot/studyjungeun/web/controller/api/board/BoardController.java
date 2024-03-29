package com.springboot.studyjungeun.web.controller.api.board;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyjungeun.service.board.BoardService;
import com.springboot.studyjungeun.web.dto.board.CreateBoardReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
//@컴포넌트 구조 : <@Controller , @Service >-> 이거 2개는 꼭 해야 한다  @Repository(DB부분)가 들어 있다
public class BoardController {
	
		
	private final BoardService boardService;		//<----  BoardServiceImpl에서 연결한 BoardService가 여기로 연결
	
	//[1. 게시글 작성]
	//단일 입력값 처리: request.getParameter(무조건 String 타입)를  => RequestParam(매개변수)로 파라미터 받음
	/* @RequestParam
	 * 1. 타입을 알아서 찾아줌 ex) 숫자가 들어오면 숫자로 잡아줌
	 * 2. 형변환이 되서 들어옴
	 * 3. 실질적으로 String이 들어옴
	 * 4. 생략가능 ex) 	( @RequestParam ) int usercode,
	 */
	
	@PostMapping("/content")	// /1 or /2...등등 뒤에 번호안줌 번호는?dbIndex이다 명시할 필요없고 자동으로 생성됨
	//--> 변수명이 같으면 생략 가능 :  public ResponseEntity<?> addBoard(@RequestParam("title") String title){	
	public ResponseEntity<?> addBoard(CreateBoardReqDto createBoardReqDto){
		boolean responseData = false;
		try {
			responseData = boardService.creatBoard(createBoardReqDto);
			//try에서 chtch가 안떳다 하면은? responseEntity ok 하고 boby에 true날라감
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(responseData);
			
		}
		return ResponseEntity.ok().body(responseData);		//......1
	}
		
//		System.out.println("게시글 작성 요청");
//		System.out.println("title: " + createBoardReqDto.getTitle());
//		System.out.println("usercode" + createBoardReqDto.getUsercode());
//		System.out.println("content" + createBoardReqDto.getContent());
		
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("Content-type","text/html;charset=utf-8");
//		return ResponseEntity.ok().headers(headers).body("test");
		
//		return ResponseEntity.ok().body("test");.......1
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

		
	
	//[2. 게시글 조회]

	//[3. 게시글 수정]

	//[4. 게시글 삭제]
}
