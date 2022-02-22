package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Smith",
                "j.smith84@mail.com", "987-456-321");

        String productProvider = "ExtraFoodShop";

        Product product = new Product("bread gluten free");

        int productQuantity = 2;

        return new OrderRequest(user, productProvider, product, productQuantity);
    }
}