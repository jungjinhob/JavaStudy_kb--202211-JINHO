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
        //가장 중요한 포인트는 ==는 주소값이 같은지 아닌지 비교하는 것이고, 
        //		equals()연산도 내부적으로 주소값을 비교하지만 String클래스에서는 equals()를 재정의해 내용을 비교하게 되어있다.
        //		내용자체를비교함
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3);
        System.out.println(str.toString());



    }
}
