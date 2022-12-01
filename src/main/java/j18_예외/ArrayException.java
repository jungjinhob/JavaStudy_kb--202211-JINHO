package j18_예외;
//error 손댈 수 없는 부분 , 컴퓨터내부적 오류 
public class ArrayException {
	public static void main(String[] args) {
		int[] numberArray = {1,2,3,4,5};
		
		try {
			//예외가 예상되는 부분
			for(int i = 0 ; i <6;i++) {
				System.out.println(numberArray[i]);	
			}
			//예외 발생시.
		} catch (Exception e) {
				System.out.println("ㅇㄹ");
		}
		

		System.out.println("프로그램 정상 종료");
		
	}
}
