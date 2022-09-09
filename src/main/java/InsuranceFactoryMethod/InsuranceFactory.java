package InsuranceFactoryMethod;

public class InsuranceFactory {
    public static Insurance getInsuranceByType(InsuranceType insType){
        switch(insType){
            case HEALTH_INSURANCE:
                return  new HealthInsurance();
            case VEHICLE_INSURANCE:
                return  new VehicleInsurance();
        }
        return null;
    }
}
