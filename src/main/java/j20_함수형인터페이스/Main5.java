package j20_함수형인터페이스;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main5 {
	public static void main(String[] args) {
		//Predicate<T>는 T타입 인자를 받고 결과로 boolean을 리턴합니다.
		//Supplier<T>는 인자를 받지 않고 T 타입의 객체를 리턴합니다.
		//Consumer<T>는 T 타입의 객체를 인자로 받고 리턴 값은 없습니다.
		Predicate<Integer> isEven = number1 -> number1 % 2 == 0; //짝수 인지 아닌지 (true false)
		
		Function<Integer, String> isEvenStr = number -> {
			
		
			Predicate<Integer> isEven2 = num -> num % 2 == 0; //짝수 인지 아닌지 (true false)
			
			return isEven2.test(number) ? "짝수" : "홀수";
		};
		System.out.println(isEven.test(4));
		
		System.out.println(isEvenStr.apply(100));
		System.out.println(isEvenStr.apply(35));
		System.out.println(isEvenStr.apply(1));
		
		
		
		
	}
}
