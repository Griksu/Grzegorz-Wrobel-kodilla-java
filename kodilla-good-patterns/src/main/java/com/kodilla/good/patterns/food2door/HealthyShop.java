package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Provider {

    private String productProvider;
    private Product productName;

    public HealthyShop(String productProvider, Product productName) {
        this.productProvider = "HealthyShop";
        this.productName = productName;
    }

    public String getProductProvider() {
        return productProvider;
    }

    public Product getProductName() {
        return productName;
    }

    @Override
    public void processOrderRequest(OrderRequest orderRequest) {
        System.out.println("Your order is processed by Healthy Shop ...");
        System.out.println("Ordered product: " + orderRequest.getProductName() +
                ", quantity: " + orderRequest.getProductQuantity());
    }
}