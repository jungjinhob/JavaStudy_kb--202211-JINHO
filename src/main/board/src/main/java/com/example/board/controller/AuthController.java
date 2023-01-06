package com.example.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.dto.auth.AuthPostDto;
import com.example.board.dto.auth.loginDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.service.AuthService;

@RestController
@RequestMapping("api/auth/")
public class AuthController {
	// @Autowired : 해당하는 클래스 인스턴스를 자동으로 생성 해줌
	@Autowired AuthService authService;
	
	@PostMapping("")
	public ResponseDto<loginDto> login(@RequestBody AuthPostDto requestBody){
//		loginDto result = new loginDto("JWT",3600000);
//		return ResponseDto.setSuccess("login success", result);
		return authService.login(requestBody);
	}
}
