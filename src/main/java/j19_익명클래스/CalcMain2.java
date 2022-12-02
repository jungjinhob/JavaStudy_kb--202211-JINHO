package j19_익명클래스;

public class CalcMain2 {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator() { //생성된 힙메모리의 주소 여야함

			@Override //일회용 메서드.
			public int calc(int a, int b) {
				System.out.println("덧셈");
				return a + b;
			}
			
		};
		
		int  r1 = c1.calc(10, 20);
		
		System.out.println(r1);
		
		Calculator c2 = new Addition();
		
		int r2 =c2.calc(20, 30);
		System.out.println(r2);
	}
	
}
