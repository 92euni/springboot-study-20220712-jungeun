//web이랑 통신하는 쪽은 web안에 만들고
//service는 java 로직이여서 web 바깥쪽에 만듦
package com.springboot.studyjungeun.service.board;

import com.springboot.studyjungeun.web.dto.board.CreateBoardReqDto;

public interface BoardService {
	
	public Boolean creatBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
//	public Boolean readBoard(CreateBoardReqDto createBoardReqDto) throws Exception;
	public Boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;
	public Boolean deleteBoard(int boardcode) throws Exception;

}
