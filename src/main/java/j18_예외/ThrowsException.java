package j18_예외;

public class ThrowsException {
	public static void printArray(int [] numbers) throws Exception { //이 메소드에서 예외가 일어날수도있다. 그래서 강제 try catch 시킴 (main)
		for(int i = 0; i< 6 ; i++) {												 // 호출 할때로 예외를 밀어버림.
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args) throws Exception {
		int[] nums = new int[] {1,2,3,4,5};
		
		
			try {
				printArray(nums);
			} catch (NullPointerException | ArrayIndexOutOfBoundsException e2) {
				e2.printStackTrace();
			}
			System.out.println("프로그램 종료");
		
		
	} 
}
