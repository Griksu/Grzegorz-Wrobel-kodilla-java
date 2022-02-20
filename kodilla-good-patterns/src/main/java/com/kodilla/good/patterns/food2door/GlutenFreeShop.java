package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Provider{

    private String productProvider;
    private String productName;

    public GlutenFreeShop(String productProvider, String productName) {
        this.productProvider = "GlutenFreeShop";
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
        OrderRepository orderRepository = new ProductOrderRepository();
        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getProductProvider(), orderRequest.getProductName(),
                orderRequest.getProductQuantity());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getProductProvider(), orderRequest.getProductName(),
                    orderRequest.getProductQuantity());
        } else {
            System.out.println("Your order is wrong. Check it again");
        }
    }
}
