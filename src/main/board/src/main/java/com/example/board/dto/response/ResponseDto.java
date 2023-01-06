package com.example.board.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "set")
public class ResponseDto<D> {
	private boolean status;
	private String message;
	private D data;
	
	//앞 <D> 는 D 제네릭쓰겟다는 거 갈켜줌 위에 <D> D data 같은원리
	public static <D> ResponseDto<D> setSuccess(String message, D data){
		return ResponseDto.set(true, message, data);
	}
	
	public static <D> ResponseDto<D> setFailed(String message){
		return ResponseDto.set(false, message, null);
	}
}
