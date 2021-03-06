package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = continentList.stream()
                .flatMap(continentList -> continentList.countryList.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum=sum.add(current));
    return peopleQuantity;
    }
}
