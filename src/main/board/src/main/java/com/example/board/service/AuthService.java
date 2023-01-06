package com.example.board.service;

import org.springframework.stereotype.Service;

import com.example.board.dto.auth.AuthPostDto;
import com.example.board.dto.auth.loginDto;
import com.example.board.dto.response.ResponseDto;

@Service
public class AuthService {
	public ResponseDto<loginDto> login(AuthPostDto dto){
		loginDto result = new loginDto("",3600000);
		return ResponseDto.setSuccess("", result);
	}
}
