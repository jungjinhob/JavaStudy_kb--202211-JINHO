package com.example.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.board.service.FileService;

@RestController
@RequestMapping("file/")
public class FileController {

	
	@Autowired FileService fileService;
//	파일을 서버에 업로드
	@PostMapping("upload")
//	@requestparam(field명) : requestbody에서 특정 필드를 받아옴
//	request body에 파일을 받아 올땐 MultipartFile 인스턴스로 받음
	public String fileupload(@RequestParam("file") MultipartFile file) {
		//file이 있는지 검사
		return fileService.fileUpload(file);
	}

//	파일을 서버에서 다운로드
	@GetMapping("download/{fileName}")
	public ResponseEntity<Resource> fileDownload(@PathVariable("fileName") String fileName){
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName)
				.body(fileService.fileDownload(fileName));
	}
	
//	이미지 파일일 경우 이미지를 출력
	@GetMapping(value = "image/{imageName}", produces= {MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_JPEG_VALUE})
	public Resource getImage(@PathVariable("imageName") String imageName) {
		return fileService.getImage(imageName);
	}
	

	
	
}
