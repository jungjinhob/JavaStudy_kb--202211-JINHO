package j14_스태틱.빌더;

public class OrderMain {

	public static void main(String[] args) {

		Order order = null;
        order = Order.builder() 
        		.orderId(100)
        		.productName("Samsung GalaxyBook2 Pro")
        		.consumerName("홍길동")
                .price(1450000)
                .stock(2)
                .build();
        order.showOrderInfo();
	}

}
