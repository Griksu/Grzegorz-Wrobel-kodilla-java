package com.kodilla.good.patterns.food2door;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, String productProvider, Product product,
                         int productQuantity) {
        System.out.println("\nORDER SUMMARY:\n" +
                "client: " + user.getUserName() + " " + user.getUserSurname() +
                ",\nordered product: " + product.getProductName() +
                ",\nquantity: " + productQuantity +
                ",\nfrom: " + productProvider);
        return true;
    }
}