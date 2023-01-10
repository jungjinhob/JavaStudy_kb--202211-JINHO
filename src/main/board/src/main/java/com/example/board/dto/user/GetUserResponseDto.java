package com.example.board.dto.user;

import javax.validation.constraints.NotNull;

import com.example.board.entity.MemberEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetUserResponseDto {
	
	private String email;
	private String nickname;
	private String profile;
	private String telNumber;
	private String address;
	
	//생성자에서 바로 member 연결
	public GetUserResponseDto(MemberEntity member) {
		this.email = member.getEmail();
		this.nickname = member.getNickname();
		this.profile = member.getProfile();
		this.telNumber = member.getTelNumber();
		this.address = member.getAddress();
	}
}
