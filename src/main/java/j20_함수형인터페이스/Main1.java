package j20_함수형인터페이스;

public class Main1 {

	public static void main(String[] args) {
		int a = 10;
		//매개 변수가 하나일때  생략가능
		Runnable application1 = () -> {
			System.out.println("프로그램 시작합니다.");
			System.out.println("a: " + a);
		};
		
		
		application1.run(); //메소드안에서 메소드를정의 (main안에서 application1 을 정의함.
		
		Runnable t1 = () -> {
			try {
				for(int i = 0 ; i<100;i++) {
					System.out.println("시간 미쳣네 ");
					System.out.println(i + " : " + (i+1));
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		};
		
		Runnable t2 = () -> {
			try {
				for(int i = 0 ; i<100;i++) {
					System.out.println("진짜 안가네 ");
					System.out.println(i + " : " + (i+1));
					Thread.sleep(100);
					
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		};
		
		Thread tt = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt.start(); //runnable에 run 실행.(스레드 하나 등록)
		tt2.start(); //비동기처리.. (옆스레드가 뭘하든 내갈길간다.)
	}
	
	
}
