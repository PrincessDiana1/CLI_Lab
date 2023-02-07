package org.example;

import org.example.Passengers;

import java.util.ArrayList;

public class Flights {
    private String destination;
    private int flightId;
    private ArrayList<Passengers> passengers;

    public Flights(String destination, int flightId, ArrayList<Passengers> passengers) {
        this.destination = destination;
        this.flightId = flightId;
        this.passengers = passengers;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public ArrayList<Passengers> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passengers> passengers) {
        this.passengers = passengers;
    }

    // Method that will add new passenger - adds  new passengers  to the arraylist of passengers using the add method.
    public void addPassenger(Passengers passenger) {
        passengers.add(passenger);
    }

}