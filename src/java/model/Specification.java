package model;

public class Specification {

    private int specId;
    private String specName;
    private int categoryId;
    private Category category;

    public Specification() {
    }

    public Specification(int specId, String specName, int categoryId) {
        this.specId = specId;
        this.specName = specName;
        this.categoryId = categoryId;
    }

    public int getSpecId() {
        return specId;
    }

    public void setSpecId(int specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
