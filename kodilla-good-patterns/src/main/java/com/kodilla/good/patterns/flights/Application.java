package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {
        String waw = "Warsaw";
        String prg = "Prague";
        String rom = "Roma";
        String bar = "Barcelona";

        System.out.println("All flights from " + waw + ": \n" +
                FlightSearch.findFlightFrom(waw) + "\n");
        System.out.println("All flights to " + prg + ": \n" +
                FlightSearch.findFlightTo(prg) + "\n");
        System.out.println("All flights from " + waw + " through " + rom +
                " to " + bar +": \n" +
                FlightSearch.findFlightsThrough(waw, rom, bar) + "\n");
    }
}