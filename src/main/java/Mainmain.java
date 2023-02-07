import org.example.Airline;
import org.example.Flights;
import org.example.Passengers;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainmain {


    public static void main(String[] args) {
        ArrayList<Flights> flights = new ArrayList<>();
        Airline airline = new Airline(flights);

        Scanner sc = new Scanner(System.in);

        // Add a new flight
        System.out.println("Welcome to AIRIELINE");
        System.out.println("Enter the destination of the flight: ");
        String destination = sc.nextLine();
        System.out.println("Enter the flight ID: ");
        int flightId = sc.nextInt();
        Flights flight = new Flights(destination, flightId, new ArrayList<>());
        airline.addFlight(flight);

     // Book a passenger onto a flight
        System.out.println("Enter the passenger ID to book a passenger: ");
        int flightIdToBook = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the passenger name: ");
        String name = sc.nextLine();
        System.out.println("Enter the contact information: ");
        String contactInfo = sc.nextLine();
        System.out.println("Enter the passenger id: ");
        int id = sc.nextInt();
        Passengers passenger = new Passengers(name,contactInfo,id);
        airline.bookPassenger(flightIdToBook, passenger);
        System.out.println("Passenger has been booked onto flight");

      // Display all flights
        airline.displayFlights();

      // Cancel a flight
        System.out.println("Enter the flight ID to cancel: ");
        int flightIdToCancel = sc.nextInt();
        airline.cancelFlight(flightIdToCancel);
        System.out.println("Flight has been cancelled");







    }
}
