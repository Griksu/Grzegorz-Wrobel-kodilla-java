package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {

        MovieStore theMovieStore = new MovieStore();
        String theResultTitles = theMovieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining(" ! ",
                        "Books titles with translation: ", "."));
        System.out.println(theResultTitles);
    }
}
