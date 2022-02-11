package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class MovieStore {

    public Map<String, List<String>> getMovies() {
        final List<String> ironManTranslation = new ArrayList<>();
        ironManTranslation.add("Żelazny Człowiek");
        ironManTranslation.add("Iron Man");

        final List<String> avengersTranslation = new ArrayList<>();
        avengersTranslation.add("Mściciele");
        avengersTranslation.add("Avengers");

        final List<String> flashTranslation = new ArrayList<>();
        flashTranslation.add("Błyskawica");
        flashTranslation.add("Flash");

        final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslation);
        booksTitlesWithTranslations.put("AV", avengersTranslation);
        booksTitlesWithTranslations.put("FL", flashTranslation);

        return booksTitlesWithTranslations;
    }
}