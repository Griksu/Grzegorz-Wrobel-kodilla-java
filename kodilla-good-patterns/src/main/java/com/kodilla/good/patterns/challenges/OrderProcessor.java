package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService; //interface
    private OrderService orderService; //interface
    private OrderRepository orderRepository; //interface

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(),
                orderRequest.getProduct(), orderRequest.getProductQuantity());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                    orderRequest.getProductQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}