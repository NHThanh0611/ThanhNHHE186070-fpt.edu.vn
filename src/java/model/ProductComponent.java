package model;

public class ProductComponent {

    private int productId;
    private int componentId;
    private Product product;
    private Product component;

    public ProductComponent() {
    }

    public ProductComponent(int productId, int componentId) {
        this.productId = productId;
        this.componentId = componentId;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getComponent() {
        return component;
    }

    public void setComponent(Product component) {
        this.component = component;
    }
}
