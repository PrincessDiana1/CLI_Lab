public class Airline {

    Passenger passenger;
    private int flightId;

    private String newflight;

    public Airline(Passenger passenger, int flightId, String newflight) {
        this.passenger = passenger;
        this.flightId = flightId;
        this.newflight = newflight;

    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
}
