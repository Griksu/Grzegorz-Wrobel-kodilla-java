package com.kodilla.good.patterns.food2door;

public interface OrderService {

    boolean order(User user, String provider, Product product, int productQuantity);
}