package com.kodilla.good.patterns.challenges;

public class Product {

    private int productID;
    private String productName;
    private static  int productPrice;

    public Product(int productID, String productName, int productPrice){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "OrderedProduct{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
