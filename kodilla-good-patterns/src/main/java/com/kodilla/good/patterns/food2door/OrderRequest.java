package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    private User user;
    private String productProvider;
    private Product productName;
    private int productQuantity;

    public OrderRequest(User user, String productProvider, Product productName,
                        int productQuantity) {
        this.user = user;
        this.productProvider = productProvider;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public String getProductProvider() {
        return productProvider;
    }

    public Product getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
