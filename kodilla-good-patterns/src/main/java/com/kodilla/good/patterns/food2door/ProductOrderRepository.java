package com.kodilla.good.patterns.food2door;

public class ProductOrderRepository implements OrderRepository{

    @Override
    public boolean createOrder(final User user, final String provider,
                               final Product product, final int productQuantity) {
        return true;
    }
}
