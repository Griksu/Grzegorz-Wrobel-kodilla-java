package com.kodilla.good.patterns.food2door;

public class ProductOrderService implements OrderService{


    @Override
    public boolean order(User user, String productProvider, Product product,
                         int productQuantity) {
        System.out.println("Client: " + user.getUserName() + " " + user.getUserSurname() +
                ", ordered product: " + product.getProductName() + ", quantity: " +
                productQuantity + ", from: " + productProvider);
        return true;
    }
}
