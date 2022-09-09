package InsuranceFactoryMethod;

public interface Insurance{

    VehicleInsuranceInterface getVehicleIns(Term term);
    HealthInsuranceInterface gethealthIns(Term term);


}
