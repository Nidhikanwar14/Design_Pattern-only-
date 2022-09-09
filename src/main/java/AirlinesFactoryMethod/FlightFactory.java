package AirlinesFactoryMethod;

public class FlightFactory {

    public static Flight selectPlane(planeType pt){
        switch (pt){
            case AIRBUS:
                return  new Flight.Boeing();
            case BOEING:
                return new Airbus();
        }
        return null;
    }
}
