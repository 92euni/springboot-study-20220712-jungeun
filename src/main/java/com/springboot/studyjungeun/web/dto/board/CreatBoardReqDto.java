package com.springboot.studyjungeun.web.dto.board;

import lombok.Data;

@Data
public class CreatBoardReqDto {
	private String title;
	private int usercode;
	private String content;

}
