package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Provider{

    private String productProvider;
    private String productName;

    public ExtraFoodShop(String productProvider, String productName){
        this.productProvider = "ExtraFoodShop";
        this.productName = productName;
    }

    public String getProductProvider() {
        return productProvider;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public void processOrderRequest(OrderRequest orderRequest) {
        OrderService orderService = new ProductOrderService();
        InformationService informationService = new EmailService();

        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getProductProvider(), orderRequest.getProductName(),
                orderRequest.getProductQuantity());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
        }
    }
}
