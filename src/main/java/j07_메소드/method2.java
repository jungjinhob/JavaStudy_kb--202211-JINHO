package j07_메소드;

public class method2 {
    // 메서드 오버로딩 -> return 형은 상관

    public static void print(String name){
        System.out.println("이름 : "+ name);
    }

    public static void print(int age){
        System.out.println("나이 : "+ age);
    }public static void print(String name, int age){
        System.out.println("이름 : "+ name + " 나이 : "+ age);
    }public static void print(int age, String name){
        System.out.println("이름 : "+ name + " 나이 : "+ age);
    }

    public static void main(String[] args) {
        print("정진호");
        print(27);
        print("정진호",27);
        print(27,"정진호");

    }
}
