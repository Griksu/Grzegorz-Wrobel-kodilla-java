package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService{

    @Override
    public boolean order(final User user, final Product product,
                         final int productQuantity) {
        System.out.println("User: " + user.getUserName() + user.getUserSurname() +
                " ordered product: " + product.getProductName() + " in quantity: " +
                 productQuantity);
        return true;
    }
}
