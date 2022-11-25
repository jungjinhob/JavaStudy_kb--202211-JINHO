package j14_스태틱;

import lombok.Data;

@Data //생성자 빼고 다.
public class Product {
    private static int autoIncrement = 20220000;
    private int serialNumber;
    private String name;

    public Product(String name){
        this.serialNumber = ++autoIncrement;
        this.name = name;

    }

    public static void print(){ //만들어지지 않은건 참고 불가
        System.out.println(autoIncrement);
        Product pr = new Product("아이폰");
        System.out.println(pr.add(10,20));
    }
    public int add(int a, int b){
        return a + b;
    }
}
