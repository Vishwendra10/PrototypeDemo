package com;

import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Flight flight= new Flight();
        flight.loadDefaultFlightList();

        Flight morningFlight= (Flight) flight.clone();
        List<String> morningFlightList=morningFlight.getDefaultFlightList();
        morningFlightList.add("JetAir");

        Flight nightFlight=(Flight) flight.clone();
        List<String> nightFlightList= nightFlight.getDefaultFlightList();
        nightFlightList.remove("Spice Jet");

        System.out.println("Default flight list: ");
        System.out.println(flight.getDefaultFlightList());
        System.out.println();
        System.out.println("Morning flight list: ");
        System.out.println(morningFlight.getDefaultFlightList());
        System.out.println();
        System.out.println("Night flight list: ");
        System.out.println(nightFlight.getDefaultFlightList());
        System.out.println();
        System.out.println("Default flight list: ");
        System.out.println(flight.getDefaultFlightList());
    }
}
