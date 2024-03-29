package com.example.board.service;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
//	properties 갖고오기 (환경변수 갖고오기)
	@Value("${file.dir}")
	private String dir;
	
	public String fileUpload(MultipartFile file) {
		if(file.isEmpty()) return null;
		
//		Original file name 가져옴
	String originalFileName = file.getOriginalFilename();
	
//	확장자를 가져옴 (image.png)
	String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
//	저장할 때 사용되는 UUID 생성 (파일명 중복시 구분용)
	String uuid = UUID.randomUUID().toString();
	
//	실제로 저장되는 이름 생성
	String saveName = uuid + extension;
	
//	파일이 저장된 실제 경로
	String savePath = dir + saveName;
	
//	해당 파일을 실제로 해당 경로에 저장하는 것
	try {
		file.transferTo(new File(savePath));
	} catch (Exception e) {
		return null;
	}
		return saveName;
	}
	
//	이미지 출력
	public Resource getImage(String imageName) {
		try {
			return new UrlResource("file:" + dir + imageName);
		} catch (Exception e) {
			return null;
		}
	}
	
	// 파일 다운로드
	public Resource fileDownload(String fileName) {
		try {
			return new UrlResource("file:" + dir + fileName);
		} catch (Exception e) {
			return null;
		}
	}
}
