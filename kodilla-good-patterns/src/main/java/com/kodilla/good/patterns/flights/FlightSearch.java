package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private static List<Flight> allFlights = List.of(
            new Flight("Warsaw", "Prague"),
            new Flight("Warsaw", "Berlin"),
            new Flight("Roma", "Barcelona"),
            new Flight("Warsaw", "Roma"),
            new Flight("Barcelona", "Warsaw"),
            new Flight("Roma", "Prague"),
            new Flight("Berlin", "Prague")
    );

    public static List<Flight> findFlightFrom(String city) {
        return allFlights.stream()
                .filter(f -> f.getDepartureAirport().equals(city))
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightTo(String city) {
        return allFlights.stream()
                .filter(f -> f.getArrivalAirport().equals(city))
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightsThrough(String from, String through, String to) {
        List<Flight> result = allFlights.stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .filter(f -> f.getArrivalAirport().equals(through))
                .collect(Collectors.toList());

        result.addAll(allFlights.stream()
                .filter(f -> f.getDepartureAirport().equals(through))
                .filter(f -> f.getArrivalAirport().equals(to))
                .collect(Collectors.toList()));
        return result;
    }
}