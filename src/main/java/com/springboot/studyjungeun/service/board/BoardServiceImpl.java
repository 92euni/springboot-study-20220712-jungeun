package com.springboot.studyjungeun.service.board;

import org.springframework.stereotype.Service;

import com.springboot.studyjungeun.web.dto.board.CreateBoardReqDto;

@Service
public class BoardServiceImpl implements BoardService{
	//@Service를 달아 놓으면 해당 객체명(BoardServiceImpl) 그대로 하나 생성이 되고 생성된 객체가 해당 인터페이스(BoardService)로 연결됨

	@Override
	public Boolean creatBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
		System.out.println(createBoardReqDto);
		if(0 == 0) {
			throw new RuntimeException();
			
		}
		//db는 아직 연결안했고 서비스까지 왔고 리턴까지 들어왔다해서 일단 true 줌
		return true;
	}

	@Override
	public Boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean deleteBoard(int boardcode) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
}
