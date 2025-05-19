package model;

public class OrderProduct {

    private int orderId;
    private int productId;
    private int quantity;
    private double netPrice;
    private Order order;
    private Product product;

    public OrderProduct() {
    }

    public OrderProduct(int orderId, int productId, int quantity, double netPrice) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.netPrice = netPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
