package com.example.board.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*  Member
이메일
비밀번호
닉네임
프로필 사진
전화번호
주소
*/ 
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

// members없으면 member 사용 , 둘다 없으면 class명사용
// name은 entity 이름 지정
@Entity(name = "MEMBER")
// 엔티티와 매핑할 테이블을 지정합니다.
// 해당 Entity 클래스와 데이터베이스 Table을 인자로 지정한 이름으로 매핑
@Table(name = "MEMBER")
public class MemberEntity {
	
	// 해당 필드가 PK임을 명시
	@Id
//	해당 PK의 value 자동 생성을 지시 
//	@GeneratedValue
	private String email;
	private String password;
	private String nickname;
	private String profile;
//	DB에서는 tel_number
	private String telNumber; 
	private String address;
}
