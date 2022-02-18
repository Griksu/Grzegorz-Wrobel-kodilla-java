package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Provider{

    private String productProvider;
    private String productName;

    public ExtraFoodShop(String productProvider, String productName){
        this.productProvider = "ExtraFoodShop";
        this.productName = productName;
    }

    @Override
    public String getProductProvider() {
        return productProvider;
    }

    public String getProductName() {
        return productName;
    }


}
