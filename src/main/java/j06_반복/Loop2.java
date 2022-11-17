package j06_반복;

import java.util.Scanner;

public class Loop2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0;i<9;i++){
            int num = i+1;
            System.out.println(N + " x " + num + " = " +N * num);
        }

//          for(int i = 0;i<8;i++){
//
//              int dan = i+2;
//              System.out.println(dan + " 단");
//
//            for(int j = 0 ; j<9;j++){
//
//                int num = j + 1;
//
//                System.out.println(dan  + " x "  + num + " = " + (dan * num)  );
//            }
//        }
    }
}
