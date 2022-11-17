package j06_반복;

import java.util.Scanner;

public class Loop6 {
    public static boolean selectionConditions(String select, int a, int b) {
        boolean c = true;
        if (select.equals("1")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (select.equals("2")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (select.equals("3")) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (select.equals("4")) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else if (select.equals("5")) {
            System.out.println(a + " % " + b + " = " + (a % b));
        } else if (select.equals("q")) {
            System.out.println("프로그램종료");

            c = false;

        } else {
            System.out.println("잘못된입력");
        }
        return c;

    }
    public static void print(){
        System.out.println("1.덧셈");
        System.out.println("2.뺄셈");
        System.out.println("3.곱셈");
        System.out.println("4.나눗셈");
        System.out.println("5.나머지");
        System.out.println("q.프로그램종료");
        System.out.print(" 선택 : ");
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean c = true;
        Scanner scanner =new Scanner(System.in);

        /*
        1.덧셈
        2.뺼셈
        3.곱셈
        4.나눗셈
        5.나머지
        q.프로그램 종료
         */

        while(c) {
            print();

            String select = scanner.nextLine();
            c = selectionConditions(select, a, b); //if문 메소드.
            System.out.println();
        }
    }


}
