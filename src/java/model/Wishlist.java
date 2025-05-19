package model;

public class Wishlist {

    private int wishlistId;
    private int customerId;
    private String wishlistName;
    private User customer;

    public Wishlist() {
    }

    public Wishlist(int wishlistId, int customerId, String wishlistName) {
        this.wishlistId = wishlistId;
        this.customerId = customerId;
        this.wishlistName = wishlistName;
    }

    public int getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(int wishlistId) {
        this.wishlistId = wishlistId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getWishlistName() {
        return wishlistName;
    }

    public void setWishlistName(String wishlistName) {
        this.wishlistName = wishlistName;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }
}
