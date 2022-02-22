package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {

    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight that = (Flight) o;
        return getDepartureAirport().equals(that.getDepartureAirport()) &&
                getArrivalAirport().equals(that.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport(), getArrivalAirport());
    }

    @Override
    public String toString() {
        return "Flight " +
                "from: " + departureAirport +
                " -> to: " + arrivalAirport;
    }
}