package j14_스태틱.빌더;

public class ProductMain {
    public static void main(String[] args) {
        Product product = Product.builder() // -> new productBuilder
                .productCode(20221111)
                .price(2220200)
                .productName("아이폰")
                .build();
        System.out.println(product);
    }
}
