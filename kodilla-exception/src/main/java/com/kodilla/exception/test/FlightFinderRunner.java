package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("Warsaw", "Vilnius");
        Flight flight3 = new Flight("Prague", "Warsaw");

        try {
            System.out.println("Checked destination airport: " +
                    flight1.getArrivalAirport());
            System.out.println(flightFinder.findFlight(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not supported");
        } finally {
            System.out.println("Search is finished" + "\n");
        }

        try {
            System.out.println("Checked destination airport: " +
                    flight2.getArrivalAirport());
            System.out.println(flightFinder.findFlight(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not supported");
        } finally {
            System.out.println("Search is finished" + "\n");
        }

        try {
            System.out.println("Checked destination airport: " +
                    flight3.getArrivalAirport());
            System.out.println(flightFinder.findFlight(flight3));
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not supported");
        } finally {
            System.out.println("Search is finished" + "\n");
        }
    }
}
