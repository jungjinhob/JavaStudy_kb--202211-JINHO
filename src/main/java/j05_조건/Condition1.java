package j05_조건;

public class Condition1 {
    public static void main(String[] args) {
        int num = 10;

        if(num < 10) {
            System.out.println("10보다 작습니다.");
            System.out.println("num의 값은 " + num + "입니다.");
        }else {
            if(num == 10){
                System.out.println("10이다.");
            }else {
                System.out.println("10보다 크다");
            }
        }

    }

}
