package j13_object;

import java.util.Scanner;
//lang 안에 있으면 import 할 필요없다
public class StringTest {

    public static void main(String[] args) {//String 값은 같은 값을 변수로 넣을때 주소도 같이 쓴다.
        String str = "A";
        String str2 = "A";
        String str3 = new String("A");
        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3);
        System.out.println(str.toString());



    }
}
