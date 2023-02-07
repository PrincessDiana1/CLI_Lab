package org.example;

import org.example.Passengers;

import java.util.ArrayList;

public class Airline {

    // Properties
    private ArrayList<Flights> flights;

    public String bookFlight;


    // Constructor
    public Airline(ArrayList<Flights> flights) {
        this.flights = flights;
    }

    // Getter & Setters
    public ArrayList<Flights> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flights> flights) {
        this.flights = flights;
    }

    // Method to call on instructions from user


    // Method that add new flight: adds a flight to the arraylist of flights using the add method.
    public void addFlight(Flights flight) {
        flights.add(flight);
    }

    // Method for displaying all flights: the method iterates through the array list of flights and prints out a destination and a flight id
    public void displayFlights() {
        System.out.println("List of org.example.Flights: ");
        for (Flights flight : flights) {
            System.out.println("Destination: " + flight.getDestination() + ", Flight ID: " + flight.getFlightId());
        }
    }
    // Method for booking passenger onto a flight
    // requires the arguments the flight id and passenger object. Created a enhanced loop where it iterates through the arraylist of flights  until finds the matching flight id . When it finds matching flight id it adds passenger. The break keyword stops the loop once we find it.

    public void bookPassenger(int flightId, Passengers passenger) {
        for (Flights flight : flights) {
            if (flight.getFlightId() == flightId) {
                flight.addPassenger(passenger);
                break;
            }
        }
    }
    // Method for cancelling a flight
    // Needs the argument flight id . The enhanced loop iterates through the array list oif flights and finds the matching flight id . when its found , it removes the flight from the flight array list using the remove method.
    public void cancelFlight(int flightId) {
        for (Flights flight : flights) {
            if (flight.getFlightId() == flightId) {
                flights.remove(flight);
                break;
            }
        }
    }


    }
