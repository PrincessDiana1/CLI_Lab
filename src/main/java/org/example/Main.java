import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// Create an ArrayList of passengers
        ArrayList<Passengers> passengers1 = new ArrayList<>();
        passengers1.add(new Passengers("Thinesan", 1234567890, 1));
        passengers1.add(new Passengers("Diana", 1234567891, 2));

        ArrayList<Passengers> passengers2 = new ArrayList<>();
        passengers2.add(new Passengers("Ed", 1111111111, 3));
        passengers2.add(new Passengers("Colin", 1111111112, 4));

        // Create an ArrayList of flights
        ArrayList<Flights> flights = new ArrayList<>();
        flights.add(new Flights("New York", 1001, passengers1));
        flights.add(new Flights("London", 1002, passengers2));

        // Create an Airline object
        Airline airline = new Airline(flights);

        // Display all flights
        airline.displayFlights();

        // Book a passenger onto a flight
        airline.bookPassenger(1002, new Passengers("Tom Cruise", 1111111113, 5));
        System.out.println("\nAfter booking a passenger onto a flight:");
        airline.displayFlights();

        // Cancel a flight
        airline.cancelFlight(1001);
        System.out.println("\nAfter cancelling a flight:");
        airline.displayFlights();
    }
}