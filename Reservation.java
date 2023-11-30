public class Reservation extends Passenger {
    private Flight flight;
    private boolean seatReserved;

    public Reservation(String name, int age, String contact, Flight flight) {
        super(name, age, contact);
        this.flight = flight;
        this.seatReserved = false;
    }

    // getters and setters

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isSeatReserved() {
        return seatReserved;
    }

    public void reserveSeat() {
        this.seatReserved = true;
    }

}