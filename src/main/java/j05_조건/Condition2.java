package j05_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.print("점수를 입력하세요");
        score = scanner.nextInt();

//        if(score >= 90 && score <=100){
//            System.out.println("A학점");
//        } else if (score >= 80) {
//            System.out.println("B학점");
//        }
//        else if (score >= 70) {
//            System.out.println("C학점");
//        }
//        else if (score >= 60) {
//            System.out.println("D학점");
//        }else if (score >= 0){
//            System.out.println("F학점");
//        }else {
//            System.out.println("잘못된 점수입니다.");
//        }

        if(score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
        } else if(score > 89) {
            System.out.println("A학점");
        } else if(score > 79) {
            System.out.println("B학점");
        } else if(score > 69) {
            System.out.println("C학점");
        } else if(score > 59) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
    }
}
