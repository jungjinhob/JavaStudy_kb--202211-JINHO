package j12_추상.추상클래스;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;

        while(true) {
            String select =null;
            System.out.println("1. 사람");
            System.out.println("2. 호랑이");
            System.out.println("q. 종료");
            System.out.println("동물을 선택하세요>>");

            select = scanner.nextLine();

            if(select.equals("1")) {
                animal = new Human("사람");
            }else if(select.equals("2")) {
                animal = new Tiger("호랑이");

            }else if(select.equals("q")){
                break;

            }else{
                System.out.println("다시 입력");
            }

            if(select.equals("1") || select.equals("2")){ //어떤 객체를 연결하나에 따라 move가 다름.
                animal.move();
            }
            System.out.println();

        }
        System.out.println("프로그램 종료");
    }
}

