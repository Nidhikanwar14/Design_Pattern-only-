package AirlinesFactoryMethod;

public interface Flight {
    AirbusInterface selectAirbusFlight(flightType ft);

    BoeingInterface selectBoeingFlight(flightType ft);

    class Boeing implements Flight {
        @Override
        public AirbusInterface selectAirbusFlight(flightType ft) {
            return null;
        }

        @Override
        public BoeingInterface selectBoeingFlight(flightType ft) {
            switch (ft) {
                case DOMESTIC:
                    return new DomesticBoeing();
                case INTERNATIONAL:
                    return new InternationalBoeing();
            }
            return null;
        }
    }
}

class Airbus implements Flight {

    @Override
    public AirbusInterface selectAirbusFlight(flightType ft) {
        switch (ft) {
            case DOMESTIC:
                return new DomesticAirbus();
            case INTERNATIONAL:
                return new InternationalAirbus();
        }
        return null;
    }

    @Override
    public BoeingInterface selectBoeingFlight(flightType ft) {
        return null;
    }
}

