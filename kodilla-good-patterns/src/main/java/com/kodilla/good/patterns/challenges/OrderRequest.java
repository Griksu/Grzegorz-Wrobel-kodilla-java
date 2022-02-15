package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private Product product;
    private int productQuantity;

    public OrderRequest(final User user, final Product product,
                        final int productQuantity) {
        this.user = user;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}