package com.kodilla.good.patterns.challenges;

public class Main {
    
    public static void main(String[] args) {

        //for exercise 13.1 only
        /*
        MovieStore theMovieStore = new MovieStore();
        String theResultTitles = theMovieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining(" ! ",
                        "Books titles with translation: ", "."));
        System.out.println(theResultTitles);
    }
         */

        //for exercise 13.2 only
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(),
                new ProductOrderService(),
                new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
