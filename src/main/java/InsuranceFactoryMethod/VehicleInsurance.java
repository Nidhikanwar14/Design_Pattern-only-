package InsuranceFactoryMethod;

public class VehicleInsurance implements Insurance {
    @Override
    public VehicleInsuranceInterface getVehicleIns(Term term) {
        switch (term) {
            case lONG_TERM:
                return new LongTermVehicleInterface();
            case SHORT_TERM:
                return new ShortTermVehicleInterface();
        }
        return null;
    }

        @Override
        public HealthInsuranceInterface gethealthIns (Term term){
            return null;
        }
    }

