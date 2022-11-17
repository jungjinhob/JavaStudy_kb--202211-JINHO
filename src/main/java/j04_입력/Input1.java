package j04_입력;

import java.util.Scanner;

public class Input1 {


    public static void main(String[] args) {
        String name = null;
        String address = null;
        String phone= null;
        int age = 0;

        Scanner scanner = new Scanner(System.in);
        //공식 nextline 전에 nextline이 아니면  공백 nextline 해줘야함
        //enter 포함
        name = scanner.nextLine();
        age = scanner.nextInt();
        scanner.nextLine();
        address = scanner.nextLine();
        phone = scanner.nextLine();



        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("연락처 : " + phone);
        System.out.println("주소 : " + address);
    }
}
