package model;

public class ProductSpecification {

    private int productId;
    private int specId;
    private Product product;
    private Specification specification;

    public ProductSpecification() {
    }

    public ProductSpecification(int productId, int specId) {
        this.productId = productId;
        this.specId = specId;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSpecId() {
        return specId;
    }

    public void setSpecId(int specId) {
        this.specId = specId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
