package j14_스태틱.빌더;

public class OrderBuilder {
	private int orderId;
    private String consumerName;
    private String productName;
    private int price;
    private int stock;
    
    public OrderBuilder orderId(int orderId){
        this.orderId = orderId;
        return this;
    }
    public OrderBuilder consumerName(String consumerName){
        this.consumerName = consumerName;
        return this;
    }
    public OrderBuilder productName(String productName){
        this.productName = productName;
        return this;
    }
    public OrderBuilder price(int price){
        this.price = price;
        return this;
    }
    public OrderBuilder stock(int stock){
        this.stock = stock;
        return this;
    }
    public Order build() {
        return new Order(orderId,consumerName, productName, price, stock);
    }
}
