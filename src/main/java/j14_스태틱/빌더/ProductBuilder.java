package j14_스태틱.빌더;

public class ProductBuilder {
	private int orderId;
    private String consumerName;
    private String productName;
    private int price;
    private int stock;
    
    public ProductBuilder orderId(int orderId){
        this.orderId = orderId;
        return this;
    }
    public ProductBuilder consumerName(String consumerName){
        this.consumerName = consumerName;
        return this;
    }
    public ProductBuilder productName(String productName){
        this.productName = productName;
        return this;
    }
    public ProductBuilder price(int price){
        this.price = price;
        return this;
    }
    public ProductBuilder stock(int stock){
        this.stock = stock;
        return this;
    }
    public Order build() {
        return new Order(orderId,consumerName, productName, price, stock);
    }

}
