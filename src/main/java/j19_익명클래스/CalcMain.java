package j19_익명클래스;

public class CalcMain {
	
	public static void main(String[] args) {//정의 와 생성 //람다는 대상이 있어야함(Calculator)	
	////중간에 다른 실행문없는 경우 : 자료형, 중괄호 , return , 메서드명생략가능
		//중괄호에서만 return이 쓰임.
		//람다의 조건
		//람다는 무조건 인터페이스에서만 사용.
		//인터페이스에 추상메서드 하나만 있어야한다. ( 두개이상있으면 하나 결정지을수가  없음)(무조건!!)
		Calculator c1 = (x, y) ->  x + y ; 
		Calculator c = new Calculator() { //위와 같음 //생성
			
			@Override
			public int calc(int a, int b) { //정의
				return a+b;
			}
		};
		int r1 = c1.calc(10,20);
		
		CalculatorSub cs = x -> x * x;
		System.out.println(cs.calc(10));
		System.out.println(cs.a());
		
		
		System.out.println(r1);
		
		Calculator c2 = new Addition();
		
		int r2 =c2.calc(20, 30);
		System.out.println(r2);
	}
	
}

