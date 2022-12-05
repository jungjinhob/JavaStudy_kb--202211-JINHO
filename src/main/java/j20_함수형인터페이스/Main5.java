package j20_함수형인터페이스;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main5 {
	public static void main(String[] args) {
		
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
