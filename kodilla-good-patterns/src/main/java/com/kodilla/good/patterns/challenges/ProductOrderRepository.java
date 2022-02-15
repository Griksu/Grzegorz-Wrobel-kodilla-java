package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository{

    @Override
    public boolean createOrder(final User user, final Product product,
                               final int productQuantity) {

        return true;
    }
}
