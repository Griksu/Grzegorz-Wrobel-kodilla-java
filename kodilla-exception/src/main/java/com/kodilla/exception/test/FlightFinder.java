package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    Flight flightBERWAW = new Flight("Berlin", "Warsaw");
    Flight flightWAWPRG = new Flight("Warsaw", "Prague");
    Flight flightPRGBER = new Flight("Prague", "Berlin");

    private Map<String, Boolean> flightMap() {
        return Map.of(
                flightBERWAW.getArrivalAirport(), true,
                flightWAWPRG.getArrivalAirport(), true,
                flightPRGBER.getArrivalAirport(), false
        );
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (flightMap().containsKey(flight.getArrivalAirport())) {
            return flightMap().get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Airport not found");
        }
    }
}
