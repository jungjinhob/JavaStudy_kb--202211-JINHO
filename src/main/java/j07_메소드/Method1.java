package j07_메소드;

public class Method1 {
    public static void method1(){
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }
    public static void method2(int a){
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println();
    }public static int method3(int a, int b){
        System.out.println("메소드3 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println("매개변수 b : " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println();
        return a+b;
    }
    public static int max(int a, int b){
        int result = 0;
        if(a<b){
            result = b;
        }else {
            result = a;
        }
        return result; //return만나면 동작끝이므로 최대한 return은 마지막에
    }

    public static void main(String[] args) {
//        int result = method3(2,3); //결과의 [동작]을 대입한다.
//        System.out.println(result);
        System.out.println(max(2,7));
    }
}
