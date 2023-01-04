package controller;

import service.MainService;
//mainService 의존 클래스
public class MainController {
	private MainService mainService;
	
	public MainController(){
		this.mainService = new MainService();
	}
	
//	1. 생성자를 이용한 DI 구현
	public MainController(MainService mainService){
		this.mainService = new MainService();
	}
	
//	2. Setter 메서드를 이용한 DI 구현
	public void setMainService(MainService mainService) {
		this.mainService = new MainService();
	}
	
	public void hello() {
		mainService.hello();
	}
}
