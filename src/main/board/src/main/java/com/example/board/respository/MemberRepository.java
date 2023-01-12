package com.example.board.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.board.entity.MemberEntity;

// 해당 인터페이스가 repository 임을 명시
@Repository
// repository는 interface로 작성
// JpaRepository interface를 상속받아야함
// JpaRepository<Table(EntityClass), primary key type>
public interface MemberRepository  extends JpaRepository<MemberEntity, String>{
//	Entity는 먹지만 Table은 안먹음 테이블명 
//	@query : 커스텀 ORM 메서드를 작성
//	테이블 명을 alias로 지정해서 사용
//	?1 ,?2, ... : 매개변수로 받아온 변수를 해당위치로 넣기 위한 구문
	@Query("SELECT m FROM MEMBER m where m.email = ?1") 
	public List<MemberEntity> myFindAll(String email);
}
