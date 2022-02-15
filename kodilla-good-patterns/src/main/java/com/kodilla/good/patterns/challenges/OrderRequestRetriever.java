package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("jonny84", "John", "Smith",
                "j.smith84@mail.com");

        Product product = new Product(1234, "my product",
                199);

        int productQuantity = 3;

        return new OrderRequest(user, product, productQuantity);
    }
}
