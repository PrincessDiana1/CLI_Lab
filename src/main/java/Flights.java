public class Flights {

    private String destination;
    private int PassengerAmount;


    public Flights(String destination, int passengerAmount) {
        this.destination = destination;
        PassengerAmount = passengerAmount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int collectPassenger() {
        return PassengerAmount;
    }

    public void collectPassenger(int passengerAmount) {
        PassengerAmount = passengerAmount;
    }
}
