package com.example.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.user.GetUserResponseDto;
import com.example.board.dto.user.PatchUserDto;
import com.example.board.dto.user.PostUserDto;
import com.example.board.dto.user.ResultResponseDto;
import com.example.board.entity.MemberEntity;
import com.example.board.respository.MemberRepository;

@Service
public class UserService {
	
	@Autowired MemberRepository memberRepository;
	
	public ResponseDto<List<GetUserResponseDto>> getAllUser(){
		List<MemberEntity> memberList = memberRepository.findAll();
//		getuserresponseDto 의 포맷에 맞춘 List 생성
		List<GetUserResponseDto> data = new ArrayList<>();
//		테이블List의 값을 포맷맞춘 List에 옮김
		for(MemberEntity member : memberList) {
			data.add(new GetUserResponseDto(member));
		}
		
		return ResponseDto.setSuccess("get user list success", data);
	}
	
	public ResponseDto<GetUserResponseDto> getUser(String email){
		MemberEntity member;
//		해당 이메일을 데이터베이스에서 검색
		try {
			member = memberRepository.findById(email).get();
				
		}catch (Exception e ) {
//			존재하지 않으면 "NOt Exist User"
			return ResponseDto.setFailed("Not Exist User");
		}

		
//		존재하면 User정보 반환 
//		1. builder 사용
//		GetUserResponseDto userInfo = GetUserResponseDto.builder()
//				.email(member.getEmail())
//				.nickname(member.getNickname())
//				.profile(member.getProfile())
//				.telNumber(member.getTelNumber())
//				.address(member.getAddress())
//				.build();
//		
//
//		
//		
//		return ResponseDto.setSuccess("Get user success", userInfo);
		
//		2. 생성자에 member 바로 연결 
		return ResponseDto.setSuccess("get user success", new GetUserResponseDto(member));
	}
	
	public ResponseDto<ResultResponseDto> postUser(PostUserDto dto){
		MemberEntity member = null;
//		데이터베이스에 해당 이메일이 존재하는지 체크
//		존재한다면 failed response수행
		String email = dto.getEmail();
		
//		repository 즉 DB쓰는거 try catch 다해주자..
		
//		try {
//			member = memberRepository.findById(email).get();
//		}catch(Exception e) {
//			return ResponseDto.setFailed("이메일 중복됨");
//		}
		try {
			if(memberRepository.existsById(email) ) {
				return ResponseDto.setFailed("이미 존재합니다 이메일");
			}
			
		}catch (Exception e ) {
			return ResponseDto.setFailed("데이터베이스 오류");
		}
		
		
		String password = dto.getPassword();
		String password2 = dto.getPassword2();
		
		if(!password.equals(password2)) {
			return ResponseDto.setFailed("비밀번호가 서로 다릅니다.");
		}
		
		member = MemberEntity
				.builder()
				.email(dto.getEmail())
				.password(dto.getPassword())
				.nickname(dto.getNickname())
				.telNumber(dto.getTelNumber())
				.address(dto.getAddress() + " " + dto.getAdressDetail())
				.build();
		
//		jpaRepository.save(Entity) 메서드
//		해당 Entity Id가 데이터베이스 테이블에 존재하지 않으면 
//		Entity를 INSERT 작업을 수행
//		!!!하지만!!!
//		해당 Entity Id가 데이터베이스 테이블에 존재하면
//		존재하는 Entity UPDATE 작업을 수행.
		memberRepository.save(member);
		
		return ResponseDto.setSuccess("회원가입 성공", new ResultResponseDto(true));
	}
	
	public ResponseDto<GetUserResponseDto> patchUser(PatchUserDto dto){
//		dto에서 이메일 가져옴
		String email = dto.getEmail();
		MemberEntity member = null;
		
		// repository를 이용해서 데이터베이스에 있는 member 테이블 중
//		해당 email에 해당하는 데이터를 불러옴
		try {
			member = memberRepository.findById(email).get();
		}catch (Exception e){
			// 만약 존재하지 않으면 not exist user 반환
			return ResponseDto.setFailed("Not Exist User");
		}
		
		
//		Request Body로 받은 nickname과 profile로 각각 변경
		member.setNickname(dto.getNickname());
		member.setProfile(dto.getProfile());
		
//		변경한 entity를 repository를 이용해서 데이터베이스에 적용(저장)
		memberRepository.save(member);
		return ResponseDto.setSuccess("User patch success", new GetUserResponseDto(member));
	}
	
	public ResponseDto<ResultResponseDto> deleteUser(String email){
//		repository를 이용해서 데이터베이스에 있는 member 테이블 중
//		email에 해당하는 데이터를 삭제
		
		memberRepository.deleteById(email);
		
		return ResponseDto.setSuccess("정보 삭제됨", new ResultResponseDto(true));
	}
	
	
}
