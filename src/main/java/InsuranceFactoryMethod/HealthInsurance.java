package InsuranceFactoryMethod;

public class HealthInsurance implements Insurance {


    @Override
    public VehicleInsuranceInterface getVehicleIns(Term term) {
        return null;
    }

    @Override
    public HealthInsuranceInterface gethealthIns(Term term) {
        switch (term) {
            case lONG_TERM:
                return new LongTermHealthInterface();
            case SHORT_TERM:
                return new ShortTermHealthInterface();
        }
        return null;
    }
}
