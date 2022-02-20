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
        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getProductProvider(), orderRequest.getProductName(),
                orderRequest.getProductQuantity());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getProductProvider(), orderRequest.getProductName(),
                    orderRequest.getProductQuantity());
        }
    }
}
