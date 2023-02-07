import org.example.Airline;
import org.example.Flights;
import org.example.Passengers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void testAddFlight() {
        ArrayList<Flights> flights = new ArrayList<>();
        Airline airline = new Airline(flights);
        Flights flight = new Flights("Dubai", 1, new ArrayList<>());
        Flights flights1 = new Flights("Lagos",2,new ArrayList<>());
        Flights flights2 = new Flights("Okinawa",3,new ArrayList<>());
        airline.addFlight(flight);
        airline.addFlight(flights1);
        airline.addFlight(flights2);
        assertEquals(3, flights.size());
        assertTrue(flights.contains(flight));
    }


    @Test
    public void testDisplayFlights() {
        ArrayList<Flights> flights = new ArrayList<>();
        Airline airline = new Airline(flights);
        Flights flight1 = new Flights("Dubai", 1, new ArrayList<>());
        Flights flight2 = new Flights("Lagos", 2, new ArrayList<>());
        Flights flight3 = new Flights("Okinawa", 3, new ArrayList<>());
        airline.addFlight(flight1);
        airline.addFlight(flight2);
        airline.addFlight(flight3);
        airline.displayFlights();
    }

    @Test
    public void testBookPassenger() {
        ArrayList<Flights> flights = new ArrayList<>();
        Airline airline = new Airline(flights);
        Flights flight = new Flights("Lagos", 1, new ArrayList<>());
        airline.addFlight(flight);
        Passengers passenger = new Passengers("Diana", "Deee@gmail.com", 3426739);
        airline.bookPassenger(1, passenger);
        assertTrue(flight.getPassengers().contains(passenger));
    }

    @Test
    public void testCancelFlight() {
        ArrayList<Flights> flights = new ArrayList<>();
        Airline airline = new Airline(flights);
        Flights flight1 = new Flights("Dubai", 1, new ArrayList<>());
        Flights flight2 = new Flights("Lagos", 2, new ArrayList<>());
        Flights flight3 = new Flights("Okinawa", 3, new ArrayList<>());
        airline.addFlight(flight1);
        airline.addFlight(flight2);
        airline.addFlight(flight3);
        airline.cancelFlight(2);
        assertEquals(2, flights.size());
        assertTrue(flights.contains(flight1));
        assertTrue(flights.contains(flight3));
    }
}

