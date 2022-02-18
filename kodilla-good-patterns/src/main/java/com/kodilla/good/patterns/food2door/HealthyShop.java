package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Provider {

    private String productProvider;
    private String productName;

    public HealthyShop(String productProvider, String productName){
        this.productProvider = "HealthyShop";
        this.productName = productName;
    }

    @Override
    public String getProductProvider() {
        return productProvider;
    }

    public String getProductName() {
        return productName;
    }

    public void process(final OrderRequest orderRequest) {
        OrderService orderService = null;
        InformationService informationService = new SMSService();
        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getProductProvider(), orderRequest.getProductName(),
                orderRequest.getProductQuantity());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
        }
    }
}
