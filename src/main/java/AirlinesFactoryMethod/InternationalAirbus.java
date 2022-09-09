package AirlinesFactoryMethod;

import java.util.ArrayList;

public class InternationalAirbus implements AirbusInterface{

    int totalSeat;
    public ArrayList<Integer> AvailableSeats = new ArrayList<Integer>();


    @Override
    public ArrayList<Integer> BookSeats() {
        return null;
    }

    @Override
    public ArrayList<Integer> getAvailableSeats() {

        for (Integer i = 1; i <= totalSeat; i++) {
            this.AvailableSeats.add(i);

        }
        System.out.println("Available Seat" +AvailableSeats);
        return AvailableSeats;
    }

    @Override
    public int getTotalSeat(int totalSeat) {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }
}
