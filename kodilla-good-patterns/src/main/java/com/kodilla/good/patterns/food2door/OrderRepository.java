package com.kodilla.good.patterns.food2door;

public interface OrderRepository {

    boolean createOrder(User user, String provider, Product product, int productQuantity);
}