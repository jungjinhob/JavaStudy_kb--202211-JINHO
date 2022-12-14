package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Product {
	private int orderId;
    private String consumerName;
    private String productName;
    private int price;
    private int stock;
    
    public static ProductBuilder builder(){
    	return new ProductBuilder();
    }
    
    public void showOrderInfo() {
    	
    	System.out.println("주문번호 : " + orderId);
        System.out.println("주문번호 : " + consumerName);
        System.out.println("주문번호 : " + productName);
        System.out.println("주문번호 : " + price);
        System.out.println("주문번호 : " + stock);
    }



}
