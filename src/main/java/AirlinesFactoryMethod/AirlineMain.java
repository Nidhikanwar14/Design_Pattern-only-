package AirlinesFactoryMethod;

public class AirlineMain {
    public static void main(String[] args) {

        Flight flight = FlightFactory.selectPlane(planeType.BOEING);
        BoeingInterface ab = flight.selectBoeingFlight(flightType.DOMESTIC);

        ab.getTotalSeat(100);
        ab.getAvailableSeats();
        System.out.println(ab.getAvailableSeats());
        System.out.println(ab.getTotalSeat(100));
    }
}
