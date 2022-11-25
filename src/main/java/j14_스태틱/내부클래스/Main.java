package j14_스태틱.내부클래스;

public class Main {
    public static void main(String[] args) {
//        B b = new B(); // 내부클래스는 인스턴스 만들 수 없음
        A.B b = new A().new B("정진호"); // 외부 클래스를 생성해야 내부도 가능.
        System.out.println(b.getName());
    }
}
