package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService,
                          final InformationService informationService,
                          final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public void processOrderRequest(final OrderRequest orderRequest) {
        Provider provider = null;
        if (orderRequest.getProductProvider().equals("ExtraFoodShop")) {
            provider = new ExtraFoodShop(orderRequest.getProductProvider(), orderRequest.getProductName());
        } else if (orderRequest.getProductProvider().equals("GlutenFreeShop")) {
            provider = new GlutenFreeShop(orderRequest.getProductProvider(), orderRequest.getProductName());
        } else if (orderRequest.getProductProvider().equals("HealthyShop")) {
            provider = new HealthyShop(orderRequest.getProductProvider(), orderRequest.getProductName());
        }

        provider.processOrderRequest(orderRequest);

        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getProductProvider(), orderRequest.getProductName(),
                orderRequest.getProductQuantity());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getProductProvider(), orderRequest.getProductName(),
                    orderRequest.getProductQuantity());
        } else {
            System.out.println("Your order is wrong. CHeck it again");
        }
    }
}