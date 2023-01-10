package com.example.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.dto.auth.AuthPostDto;
import com.example.board.dto.auth.loginDto;
import com.example.board.dto.response.ResponseDto;
import com.example.board.entity.MemberEntity;
import com.example.board.respository.MemberRepository;

@Service
public class AuthService {
	
	@Autowired MemberRepository memberRepository;
	public String hello(){
//		Entity class로 entity 빌드
		MemberEntity memberEntity = MemberEntity.builder()
				.email("qwer@naver.com")
				.password("qwe123")
				.nickname("jjh")
				.telNumber("010-2222-3333")
				.address("busan")
				.build();
//		빌드한 entity DB에 저장
		memberRepository.save(memberEntity);
		
//		MemberRepository가 상속받은 JpaRepository 메서드를 사용하여 데이터 검색
		MemberEntity savedMemberEntity = memberRepository.findById("qwer@naver.com").get();
		
//		MemberRepositor에 작성한 커스텀 메서드를 사용
		List<MemberEntity> list = memberRepository.myFindAll("qwer@naver.com");
		System.out.println(list.toString());
		return savedMemberEntity.getNickname();
	}
	
	public ResponseDto<loginDto> login(AuthPostDto dto){
		
//		입력받은 email 으로 데이터베이스에서 검색
		String email = dto.getEmail();
		String password = dto.getPassword();
		MemberEntity member;
		
		
//		존재하지 않는다면 없는 아이디 로그인실패 반환
		
		try {
			member = memberRepository.findById(email).get();
			
		}catch (Exception e ) {
			return ResponseDto.setFailed("login failed");
		}
		
//		존재한다면 입력받은 패스워드와 데이터베이스의 패스워드와 동일한지 검사
//		동일하지 않다면 로그인 실패 반환	
		try {
			String savedPassword = member.getPassword();
			if(!password.equals(savedPassword)) {
				return ResponseDto.setFailed("로그인 실패");
			}

			
			
		}catch (Exception e ) {
			return ResponseDto.setFailed("데이터베이스 오류");
		}
		
//		맞으면 토큰 생성 후 토큰 및 만료시간 반환
		loginDto result = new loginDto("",3600000);
		return ResponseDto.setSuccess("", result);

		
		

	}
}
