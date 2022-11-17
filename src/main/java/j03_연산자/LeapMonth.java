package j03_연산자;

public class LeapMonth {
    public static void main(String[] args) {
        int year = 1999;
        String result = null;


        result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "윤달입니다" : "윤달이 아닙니다";
        System.out.println(year + " : " + result );
        /*
        윤달의 조건
        4의 배수이고 100의
        2000: 윤달입니다.
        1999: 윤달이 아닙니다.
         */
    }
}
