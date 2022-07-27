package com.springboot.studyjungeun.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class TestRespDto {
	private String username;
	private String password;

}
