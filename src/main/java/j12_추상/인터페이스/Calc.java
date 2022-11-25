package j12_추상.인터페이스;
/*
모든 인터페이스에서의 메서드는 기본적으로 추상메서드이다.
(구현부 X, (abstract))
일반 변수 선언 불가 . 그러나 상수는 선언 가능.
일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다.
 */
public interface Calc {

    int ERROR_CODE = -99999;
    int calc(int[] values);


}
